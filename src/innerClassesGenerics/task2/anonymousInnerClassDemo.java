package innerClassesGenerics.task2;

/**
 * Создать интерфейс Cookable, содержащий метод void cook(String str).
 * Создать класс Food, содержащий метод public void prepare(Cookable c, String str) { c.cook(str);}
 * Создать экземпляр класса Food и вызвать его метод prepare().
 * На вход метода prepare() передать экземпляр анонимного класса, расширяющего интерфейс Cookable.
 */
public class anonymousInnerClassDemo {

    public static void main(String[] args) {

        Cookable cook = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("Повар готовит " + str);
            }
        };

        Food food = new Food();
        food.prepare(cook, "торт"); // Повар готовит торт
    }
}
