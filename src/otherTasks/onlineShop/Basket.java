package otherTasks.onlineShop;

import java.util.*;
public class Basket {
    private Product[] boughtGoods;
    public Basket(Product[] boughtGoods) {
        this.boughtGoods = boughtGoods;
    }

    public Product[] getBoughtGoods() {
        return boughtGoods;
    }
    public void setBoughtProduct(Product product) {
        Product[] goods = new Product[boughtGoods.length+1];
        System.arraycopy(boughtGoods, 0, goods, 0, boughtGoods.length);
        goods[goods.length-1] = product;
        this.boughtGoods = goods;
    }
}
