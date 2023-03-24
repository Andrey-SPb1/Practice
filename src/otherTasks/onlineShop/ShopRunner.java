package otherTasks.onlineShop;

/**
 * Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 * Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
 * Создать класс Basket, содержащий массив купленных товаров.
 * Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
 * Вывести на консоль каталог продуктов.
 * Вывести на консоль покупки посетителей магазина.
 */

public class ShopRunner {

    public static void main(String[] args) {
        printCategories();
        System.out.println("----------");
        printUsersGoods();
    }
    private static void printCategories() {
        Category[] categories = Category.categories;
        for (Category category : categories) {
            System.out.printf("Category \"%s\" has next goods:\n", category.getName());
            Product[] goods = category.getGoods();
            for (Product product : goods) {
                System.out.println(product);
            }
        }
    }
    private static void printUsersGoods() {
        User[] users = User.getUsers();
        for (User user : users) {
            System.out.printf("User %s bought:\n", user.getLogin());
            Product[] goods = user.getBasket().getBoughtGoods();
            for (Product product : goods) {
                System.out.println(product);
            }
        }
    }
}
