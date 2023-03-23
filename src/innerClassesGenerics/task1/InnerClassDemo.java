package innerClassesGenerics.task1;

/**
 * Создать класс User, содержащий private переменные login, password.
 * Создать внутренний класс Query в классе User. Класс Query содержит метод printToLog(),
 * который распечатывает на консоль сообщение о том что пользователь с таким то логином и паролем отправил запрос.
 * Класс User, содержит метод createQuery(), в котором создается объект класса Query и вызывается метод printToLog().
 * В методе main(): создать экземпляр класса User и вызвать метод createQuery();
 * создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию user.new Query();
 * создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query();
 */

public class InnerClassDemo {

    public static void main(String[] args) {
        User user = new User("Star_23", "qwerty123");

        user.createQuery(); // Пользователь с логином Star_23 и паролем qwerty123 отправил запрос.
        user.new Query().printToLog(); // Пользователь с логином Star_23 и паролем qwerty123 отправил запрос.
        new User("Moon_32", "qaz321").
                new Query().printToLog(); // Пользователь с логином Moon_32 и паролем qaz321 отправил запрос.
    }
}
