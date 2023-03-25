package otherTasks.onlineShop.comparatorProduct;

import otherTasks.onlineShop.Product;
import java.util.Comparator;

public class MaxPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getPrice(),o2.getPrice());
    }
}
