package otherTasks.onlineShop.exception;

public class WrongPasswordException extends Exception{

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongPasswordException{" +
                "message='" + getMessage() + '\'' +
                '}';
    }
}
