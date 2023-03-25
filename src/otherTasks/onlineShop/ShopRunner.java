package otherTasks.onlineShop;

/**
 * Вместо массивов используйте коллекции.
 * Создать метод, распечатывающий товары каталога, отсортированные по имени, цене или рейтингу.
 * Добавить возможность сортировать в обратном порядке.
 */

public class ShopRunner {

    public static void main(String[] args) {

        Category.printSortGoodsByName();
        System.out.println("-------------");
        Category.printSortGoodsByPrice();
        System.out.println("-------------");
        Category.printSortGoodsByRating();
        System.out.println("-------------");
        Category.printSortGoodsByPriceReverse();

//        User user = User.authenticationUser();
//        Shop.shopping(user);
    }
}
