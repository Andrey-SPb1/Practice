package otherTasks.onlineShop;

import otherTasks.onlineShop.comparatorProduct.MaxPriceComparator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Pattern;

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

    private static final List<Category> CATEGORIES = new ArrayList<>();

    public static void addListGoods() {

        File file = Path.of("src", "otherTasks", "onlineShop", "dataStore", "goods.txt").toFile();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String line;
            String regexCategory = "\\w+";
            String regexGoods = "\\w+.\\d+\\.\\d+.\\d\\.\\d+."; // Plate{99.00;7.90}
            String category = bufferedReader.readLine();
            List<Product> goods = new ArrayList<>();

            while (true) {
                line = bufferedReader.readLine();
                if(line == null) {
                    CATEGORIES.add(new Category(category,goods));
                    break;
                }
                if (Pattern.matches(regexCategory, line)) {
                    CATEGORIES.add(new Category(category,goods));
                    category = line;
                    goods = new ArrayList<>();
                }
                else if(Pattern.matches(regexGoods,line)) {
                    StringTokenizer st = new StringTokenizer(line, " {};");
                    String name = st.nextToken();
                    double price = Double.parseDouble(st.nextToken());
                    double rating = Double.parseDouble(st.nextToken());
                    goods.add(new Product(name, price, rating));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Category> getCategories() {
        return CATEGORIES;
    }
    public static Product getProduct(String name) {
        for (Category category : CATEGORIES) {
            List<Product> goods = category.getGoods();
            for (Product product : goods) {
                if(product.getName().equalsIgnoreCase(name)) return product;
            }
        }
        return null;
    }
    public static Category getCategory(int number) {
        if(0 <= number && number < CATEGORIES.size()) return CATEGORIES.get(number);
        else return null;
    }
    public static void printSortGoodsByName() {
        Set<Product> sortGoods = new TreeSet<>();
        for (Category category : CATEGORIES) {
            List<Product> goods = category.getGoods();
            sortGoods.addAll(goods);
        }
        sortGoods.forEach(System.out::println);
    }
    public static void printSortGoodsByPrice() {
        List<Product> sortGoods = new ArrayList<>();
        for (Category category : CATEGORIES) {
            List<Product> goods = category.getGoods();
            sortGoods.addAll(goods);
        }
        MaxPriceComparator maxPrice = new MaxPriceComparator();
        sortGoods.sort(maxPrice);
        sortGoods.forEach(System.out::println);
    }
}
