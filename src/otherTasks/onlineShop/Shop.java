package otherTasks.onlineShop;

import java.util.Scanner;

public class Shop {

    private static final User[] USERS = User.getUsers();
    private static final Category[] CATEGORIES = Category.getCategories();

    public static void shopping(User user) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        while (true) {
            System.out.println("Choose a category");
            for (int i = 0; i < CATEGORIES.length; i++) {
                System.out.printf("%d. %s\n", i+1,CATEGORIES[i].getName());
            }
            System.out.println("0. Exit");
            int chosenNumber = sc.nextInt();
            if(chosenNumber == 0) break;
            Product[] products = CATEGORIES[chosenNumber-1].getGoods();
            System.out.println(CATEGORIES[chosenNumber-1].getName());
            System.out.println("Choose a product");
            for (int i = 0; i < products.length; i++) {
                System.out.printf("%d. %-20s %.2f\n", i+1,products[i].getName(),products[i].getPrice());
            }
            System.out.println("0. Exit");
            chosenNumber = sc.nextInt();
            if(chosenNumber == 0) break;
            Product product = products[chosenNumber-1];
            System.out.println(product.getName());
            System.out.print("1.Add to basket\n2.Continue\n0.Exit\n");
            chosenNumber = sc.nextInt();
            if(chosenNumber == 0) break;
            else if(chosenNumber == 1) {
                user.getBasket().setBoughtProduct(product);
                System.out.println(product.getName() + " added to basket");
            }
            System.out.print("1.Go to basket\n2.Continue shopping\n0.Exit\n");
            chosenNumber = sc.nextInt();
            if(chosenNumber == 0) break;
            if (chosenNumber == 1) {
                Basket basket = user.getBasket();
                Product[] goods = basket.getBoughtGoods();
                double sum = 0;
                System.out.println("Basket:");
                for (int i = 0; i < goods.length; i++) {
                    System.out.printf("%-20s %.2f\n",goods[i].getName(),goods[i].getPrice());
                    sum += goods[i].getPrice();
                }
                System.out.println("In the basket of goods for " + sum);
                System.out.print("1.Buy goods\n2.Continue shopping\n0.Exit\n");
                chosenNumber = sc.nextInt();
                if(chosenNumber == 0) break;
                else if(chosenNumber == 1) {
                    user.setBasket(new Basket(new Product[0]));
                    System.out.println("Goods bought, the basket is empty");
                }
                System.out.print("Continue?\n1.Yes\n2.No\n");
                chosenNumber = sc.nextInt();
                if(chosenNumber == 2) break;
            }
        }
        System.out.println("We are waiting for you again");
    }

}
