package otherTasks.onlineShop;

public class User {
    private final String login;
    private final String password;
    private Basket basket;
    private static final Category[] categories = Category.categories;
    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public Basket getBasket() {
        return basket;
    }

    public static User[] getUsers() {
        return users;
    }

    private static User[] users = {
            new User("Sun23", "qwerty123", new Basket(new Product[]{
                    Category.getProduct("Banana"),
                    Category.getProduct("Beef")
            })),
            new User("RockStar", "SuperStar12", new Basket(new Product[]{
                    Category.getProduct("Rock guitar"),
                    Category.getProduct("Drum")
            }))
    };
}
