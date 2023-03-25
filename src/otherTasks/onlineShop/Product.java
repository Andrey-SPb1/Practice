package otherTasks.onlineShop;

public class Product implements Comparable<Product> {

    private final String name;
    private final double price;
    private final double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
    @Override
    public int compareTo(Product o) {
        return name.compareTo(o.getName());
    }
}
