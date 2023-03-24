package otherTasks.onlineShop;

public class Basket {
    private Product[] boughtGoods;
    public Basket(Product[] boughtGoods) {
        this.boughtGoods = boughtGoods;
    }

    public Product[] getBoughtGoods() {
        return boughtGoods;
    }
}
