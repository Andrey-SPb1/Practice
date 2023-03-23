package innerClassesGenerics.task1;

public class User {
    private final String login;
    private final String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public void createQuery() {
        new Query().printToLog();
    }
    public class Query {
        public void printToLog() {
            System.out.println("Пользователь с логином " + login +
                    " и паролем " + password + " отправил запрос.");
        }
    }
}
