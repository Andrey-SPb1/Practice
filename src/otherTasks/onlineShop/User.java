package otherTasks.onlineShop;

import otherTasks.onlineShop.exception.WrongLoginException;
import otherTasks.onlineShop.exception.WrongPasswordException;

import java.util.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class User {
    private final String login;
    private final String password;
    private static List<User> users = new ArrayList<>();
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

    public static List<User> getUsers() {
        return users;
    }

    public static User registrationUser() {
        System.out.print("""
                Registration
                Сreate a username and password
                Login and password must contain only Latin letters, numbers and underscores and
                length must be less than 20
                 """);
        Scanner sc = new Scanner(System.in);
        User user = null;
        while(true) {
            System.out.print("Enter login: ");
            String login = sc.next();
            System.out.print("Enter password: ");
            String password = sc.next();
            System.out.print("Enter password again: ");
            String confirmPassword = sc.next();
            if(checkLoginAndPassword(login,password,confirmPassword)) {
                user = new User(login, password, new Basket(new ArrayList<>()));
                users.add(user);
                return user;
            }
            else System.out.println("Please try again");
        }
    }
    public static User authenticationUser() {
        System.out.println("Authentication");
        Scanner sc = new Scanner(System.in);
        for (User user : users) {
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
        for (User user : users) {
            System.out.printf("User %s bought:\n", user.getLogin());
            List<Product> goods = user.getBasket().getBoughtGoods();
            for (Product product : goods) {
                System.out.println(product);
            }
        }
    }
    private static boolean checkLoginAndPassword(String login, String password, String confirmPassword) {

        String regex = "\\w+";

        try {
            if(!Pattern.matches(regex, login)) throw new WrongLoginException(login,
                    "The login must contain only Latin letters, numbers and underscores.");
            if(login.length() > 19) throw new WrongLoginException(login, "Login length exceeded");
            if(!Pattern.matches(regex, password)) throw new WrongPasswordException(
                    "The password must contain only Latin letters, numbers and underscores.");
            if(password.length() > 19) throw new WrongPasswordException("Password length exceeded");
            if(!password.equals(confirmPassword)) throw new WrongPasswordException(
                    "Password mismatch");
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println(e.toString()); // #2
            // WrongPasswordException{message='The password must contain only Latin letters, numbers and underscores.'}
            return false;
        }
        return true;
    }
}
