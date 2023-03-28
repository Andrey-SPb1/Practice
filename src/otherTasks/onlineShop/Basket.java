package otherTasks.onlineShop;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
public class Basket implements Serializable {
    private final List<Product> boughtGoods;
    private final static File file =
            Path.of("src", "otherTasks", "onlineShop", "dataStore", "lastBoughtBasket").toFile();
    public Basket(List<Product> boughtGoods) {
        this.boughtGoods = boughtGoods;
    }
    public List<Product> getBoughtGoods() {
        return boughtGoods;
    }
    public void setBoughtProduct(Product product) {
        boughtGoods.add(product);
    }
    public void basketInFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Basket basketOutFile() {
        Basket basket = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            basket = (Basket) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return basket;
    }
    @Override
    public String toString() {
        return "Basket{" +
                "boughtGoods=" + boughtGoods +
                '}';
    }
}
