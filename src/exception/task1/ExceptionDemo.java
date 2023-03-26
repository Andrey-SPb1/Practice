package exception.task1;

import java.util.regex.Pattern;

/**
 * Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
 * Login должен содержать только латинские буквы, цифры и знак подчеркивания.
 * Длина login должна быть меньше 20 символов.
 * Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 * Password должен содержать только латинские буквы, цифры и знак подчеркивания.
 * Длина password должна быть меньше 20 символов.
 * Также password и confirmPassword должны быть равны.
 * Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 * WrongPasswordException и WrongLoginException -
 * пользовательские классы исключения с двумя конструкторами – один по умолчанию,
 * второй принимает сообщение исключения и передает его в конструктор класса Exception.
 * Обработка исключений проводится внутри метода.
 * Используем multi-catch block.
 * Метод возвращает true, если значения верны или false в другом случае.
 */

public class ExceptionDemo {

    public static void main(String[] args) {

        String login = "User_12";
        String password = "qwerty123";
        String confirmPassword = "qwerty123";

        System.out.println(checkLoginAndPassword(login, password, confirmPassword)); // true

        String login2 = "User_12";
        String password2 = "qwerty123.";
        String confirmPassword2 = "qwerty123";

        System.out.println(checkLoginAndPassword(login2, password2, confirmPassword2)); // false
    }

    private static boolean checkLoginAndPassword(String login, String password, String confirmPassword) {

        String regex = "\\w+";

        try {
            if(!Pattern.matches(regex, login)) throw new WrongLoginException(login,
                    "The login must contain only Latin letters, numbers and underscores.");
            if(login.length() > 19) throw new WrongLoginException(login, "Login length exceeded");
            if(!Pattern.matches(regex, password)) throw new WrongPasswordException(
                    "The password must contain only Latin letters, numbers and underscores.");
            if(password.length() > 19) throw new WrongPasswordException("Password length exceeded");
            if(!password.equals(confirmPassword)) throw new WrongPasswordException(
                    "Password mismatch");
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println(e.toString()); // #2
            // WrongPasswordException{message='The password must contain only Latin letters, numbers and underscores.'}
            return false;
        }
        return true;
    }
}
