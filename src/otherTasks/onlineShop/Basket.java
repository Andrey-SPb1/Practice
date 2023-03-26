package otherTasks.onlineShop;

import java.util.*;
public class Basket {
    private List<Product> boughtGoods;
    public Basket(List<Product> boughtGoods) {
        this.boughtGoods = boughtGoods;
    }

    public List<Product> getBoughtGoods() {
        return boughtGoods;
    }
    public void setBoughtProduct(Product product) {
        boughtGoods.add(product);
    }
}
