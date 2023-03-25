package otherTasks.onlineShop;

public class Category {

    private final String name;
    private Product[] goods;

    public Category(String name, Product[] products) {
        this.name = name;
        this.goods = products;
    }

    public String getName() {
        return name;
    }

    public Product[] getGoods() {
        return goods;
    }
    private final static Category[] CATEGORIES = {
                new Category("Dishes", new Product[]{
                        new Product("Plate", 99.00, 7.9),
                        new Product("Bowl", 79.00, 6.4),
                        new Product("Cup", 49.00, 7.8),
                        new Product("Glass", 69.00, 8.4),
                        new Product("Fork", 20.00, 5.4),
                        new Product("Spoon", 20.50, 6.9)
                }),
                new Category("Musical instruments", new Product[]{
                        new Product("Guitar", 6500.00, 8.9),
                        new Product("Piano", 43000.00, 8.4),
                        new Product("Drum", 18000.00, 7.5),
                        new Product("Rock guitar", 11999.00, 7.4),
                        new Product("Synthesizer", 9999.00, 6.2)
                }),
                new Category("Meat", new Product[]{
                        new Product("Pork", 500.00, 7.9),
                        new Product("Beef", 799.00, 7.4),
                        new Product("Chicken", 329.00, 8.5),
                }),
                new Category("Fruits", new Product[]{
                        new Product("Banana", 120.00, 6.4),
                        new Product("Apple", 80.00, 8.2),
                        new Product("Orange", 99.00, 7.5),
                })
    };
    public static Category[] getCategories() {
        return CATEGORIES;
    }
    public static Product getProduct(String name) {
        for (Category category : CATEGORIES) {
            Product[] goods = category.getGoods();
            for (Product product : goods) {
                if(product.getName().equalsIgnoreCase(name)) return product;
            }
        }
        return null;
    }
    public static Category getCategory(String name) {
        for (Category category : CATEGORIES) {
            if(category.getName().equalsIgnoreCase(name)) return category;
        }
        return null;
    }
    public static Category getCategory(int number) {
        if(0 <= number && number < CATEGORIES.length) return CATEGORIES[number+1];
        else return null;
    }
    public static void printCategoriesAndGoods() {
        for (Category category : CATEGORIES) {
            System.out.printf("Category \"%s\" has next goods:\n", category.getName());
            Product[] goods = category.getGoods();
            for (Product product : goods) {
                System.out.println(product);
            }
        }
    }

}
