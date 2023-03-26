package otherTasks.onlineShop;

import exception.task1.WrongLoginException;
import exception.task1.WrongPasswordException;

import java.util.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Shop {

    private static final List<User> USERS = User.getUsers();
    private static final List<Category> CATEGORIES = Category.getCategories();

    public static void startShopping() {
        while(true) {
            User user = null;
            Scanner sc = new Scanner(System.in);
            System.out.print("Do you have an account?\n1.Registration\n2.Authentication\n0.Exit\n");
            int chosenNumber = sc.nextInt();
            if (chosenNumber == 0) System.exit(0);
            else if (chosenNumber == 1) user = User.registrationUser();
            else if (chosenNumber == 2) user = User.authenticationUser();
            assert user != null : ":(";
            System.out.println("Welcome " + user.getLogin());
            while (true) {
                System.out.println("Choose a category");
                for (int i = 0; i < CATEGORIES.size(); i++) {
                    System.out.printf("%d. %s\n", i + 1, CATEGORIES.get(i).getName());
                }
                System.out.println("0. Exit");
                chosenNumber = sc.nextInt();
                if (chosenNumber == 0) break;
                List<Product> products = Objects.requireNonNull(Category.getCategory(chosenNumber - 1)).getGoods();
                System.out.println(CATEGORIES.get(chosenNumber - 1).getName());
                System.out.println("Choose a product");
                for (int i = 0; i < products.size(); i++) {
                    System.out.printf("%d. %-20s %.2f\n", i + 1, products.get(i).getName(), products.get(i).getPrice());
                }
                System.out.println("0. Exit");
                chosenNumber = sc.nextInt();
                if (chosenNumber == 0) break;
                Product product = products.get(chosenNumber - 1);
                System.out.println(product.getName());
                System.out.print("1.Add to basket\n2.Continue\n0.Exit\n");
                chosenNumber = sc.nextInt();
                if (chosenNumber == 0) break;
                else if (chosenNumber == 1) {
                    user.getBasket().setBoughtProduct(product);
                    System.out.println(product.getName() + " added to basket");
                }
                System.out.print("1.Go to basket\n2.Continue startShopping\n0.Exit\n");
                chosenNumber = sc.nextInt();
                if (chosenNumber == 0) break;
                if (chosenNumber == 1) {
                    List<Product> Boughtgoods = user.getBasket().getBoughtGoods();
                    double sum = 0;
                    System.out.println("Basket:");
                    for (Product boughtProduct : Boughtgoods) {
                        System.out.printf("%-20s %.2f\n", boughtProduct.getName(), boughtProduct.getPrice());
                        sum += boughtProduct.getPrice();
                    }
                    System.out.println("In the basket of goods for " + sum);
                    System.out.print("1.Buy goods\n2.Continue startShopping\n0.Exit\n");
                    chosenNumber = sc.nextInt();
                    if (chosenNumber == 0) break;
                    else if (chosenNumber == 1) {
                        user.setBasket(new Basket(new ArrayList<>()));
                        System.out.println("Goods bought, the basket is empty");
                    }
                    System.out.print("Continue?\n1.Yes\n2.No\n");
                    chosenNumber = sc.nextInt();
                    if (chosenNumber == 2) break;
                }
            }
            System.out.println("We are waiting for you again");
        }
    }
}
