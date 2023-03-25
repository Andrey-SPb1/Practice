package otherTasks.onlineShop;

import java.util.*;
import java.util.Scanner;

public class User {
    private final String login;
    private final String password;
    private Basket basket;
    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }
    private String getPassword(){return password;}
    public Basket getBasket() {
        return basket;
    }
    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public static User[] getUsers() {
        return USERS;
    }

    private final static User[] USERS = {
            new User("Sun23", "qwerty123", new Basket(new Product[]{

            })),
            new User("RockStar", "SuperStar12", new Basket(new Product[]{
                    Category.getProduct("Rock guitar"),
                    Category.getProduct("Drum")
            }))
    };

    public static User authenticationUser() {
        Scanner sc = new Scanner(System.in);
        for (User user : USERS) {
            while(true) {
                System.out.print("Enter login: ");
                String login = sc.next();
                System.out.print("Enter password: ");
                String password = sc.next();
                if (user.getLogin().equals(login) &&
                        user.getPassword().equals(password)) return user;
                else System.out.println("Invalid username or password, please try again");
            }
        }
        return null;
    }
    public static void printUsersGoods() {
        for (User user : USERS) {
            System.out.printf("User %s bought:\n", user.getLogin());
            Product[] goods = user.getBasket().getBoughtGoods();
            for (Product product : goods) {
                System.out.println(product);
            }
        }
    }
}
