package exception.task1;

public class WrongLoginException extends Exception {

    private String login;

    public WrongLoginException() {
    }

    public WrongLoginException(String login, String message) {
        super(message);
        this.login = login;
    }

    @Override
    public String toString() {
        return "WrongLoginException{" +
                "login='" + login + '\'' +
                "message='" + getMessage() + '\'' +
                '}';
    }
}
