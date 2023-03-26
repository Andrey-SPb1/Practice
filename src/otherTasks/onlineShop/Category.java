package otherTasks.onlineShop;

import otherTasks.onlineShop.comparatorProduct.MaxPriceComparator;
import otherTasks.onlineShop.comparatorProduct.MaxRatingComparator;
import otherTasks.onlineShop.comparatorProduct.MinPriceComparator;

import java.util.*;

public class Category {

    private final String name;
    private final List<Product> goods;

    public Category(String name, List<Product> goods) {
        this.name = name;
        this.goods = goods;
    }

    public String getName() {
        return name;
    }

    public List<Product> getGoods() {
        return goods;
    }

    public static void setCategories(List<Category> categories) {
        Category.categories = categories;
    }

    private static List<Category> categories = List.of(
                new Category("Dishes", List.of(
                        new Product("Plate", 99.00, 7.9),
                        new Product("Bowl", 79.00, 6.4),
                        new Product("Cup", 49.00, 7.8),
                        new Product("Glass", 69.00, 8.4),
                        new Product("Fork", 20.00, 5.4),
                        new Product("Spoon", 20.50, 6.9)
                )),
                new Category("Musical instruments", List.of(
                        new Product("Guitar", 6500.00, 8.9),
                        new Product("Piano", 43000.00, 8.4),
                        new Product("Drum", 18000.00, 7.5),
                        new Product("Rock_guitar", 11999.00, 7.4),
                        new Product("Synthesizer", 9999.00, 6.2)
                )),
                new Category("Meat", List.of(
                        new Product("Pork", 500.00, 7.9),
                        new Product("Beef", 799.00, 7.4),
                        new Product("Chicken", 329.00, 8.5)
                )),
                new Category("Fruits", List.of(
                        new Product("Banana", 120.00, 6.4),
                        new Product("Apple", 80.00, 8.2),
                        new Product("Orange", 99.00, 7.5)
                )));
    public static List<Category> getCategories() {
        return categories;
    }
    public static Product getProduct(String name) {
        for (Category category : categories) {
            List<Product> goods = category.getGoods();
            for (Product product : goods) {
                if(product.getName().equalsIgnoreCase(name)) return product;
            }
        }
        return null;
    }
    public static Category getCategory(int number) {
        if(0 <= number && number < categories.size()) return categories.get(number);
        else return null;
    }
    public static void printSortGoodsByName() {
        Set<Product> sortGoods = new TreeSet<>();
        for (Category category : categories) {
            List<Product> goods = category.getGoods();
            sortGoods.addAll(goods);
        }
        sortGoods.forEach(System.out::println);
    }
    public static void printSortGoodsByPrice() {
        List<Product> sortGoods = new ArrayList<>();
        for (Category category : categories) {
            List<Product> goods = category.getGoods();
            sortGoods.addAll(goods);
        }
        MaxPriceComparator maxPrice = new MaxPriceComparator();
        sortGoods.sort(maxPrice);
        sortGoods.forEach(System.out::println);
    }
}
