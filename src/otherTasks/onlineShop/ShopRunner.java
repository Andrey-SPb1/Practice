package otherTasks.onlineShop;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Вместо массивов используйте коллекции.
 * Создать метод, распечатывающий товары каталога, отсортированные по имени, цене или рейтингу.
 * Добавить возможность сортировать в обратном порядке.
 */

public class ShopRunner {
    public static void main(String[] args) throws FileNotFoundException {

        List<User> userList = User.getUsers();
        userList.add(new User("Sun23", "qwerty123", new Basket(new ArrayList<>())));
        userList.add(new User("RockStar", "SuperStar12", new Basket(new ArrayList<>())));

        List<Category> categories = new ArrayList<>();

//        Shop.startShopping();

        File file = Path.of("src", "otherTasks", "onlineShop", "dataStore", "goods.txt").toFile();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String line;
            String regexCategory = "\\w+";
            String regexGoods = "\\w+.\\d+\\.\\d+.\\d\\.\\d+."; // Plate{99.00;7.90}
            String category = null;

            while ((line = bufferedReader.readLine()) != null) {
                if (Pattern.matches(regexCategory, line)) category = line;
                else if(Pattern.matches(regexGoods,line)) {
                    StringTokenizer st = new StringTokenizer(line, " {};");
                    List<Product> goods = new ArrayList<>();
                    String name = st.nextToken();
                    double price = Double.parseDouble(st.nextToken());
                    double rating = Double.parseDouble(st.nextToken());
                    goods.add(new Product(name, price, rating));
                    categories.add(new Category(category, goods));
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
//            for (Category category : categories) {
//                List<Product> goods = category.getGoods();
//                bufferedWriter.write(String.format("%s\n",category.getName()));
//                for (Product product : goods) {
//                    bufferedWriter.write(String.format(Locale.ROOT,"%s{%.2f;%.2f}\n",
//                            product.getName(),product.getPrice(),product.getRating()));
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
//        Category.printSortGoodsByName();
