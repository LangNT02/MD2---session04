package Excersise;

public class Excersice09 {
    public static void main(String[] args) {
        String email = "thaolannguyen1607@gmail.com";
        String password = "Pass123";

        boolean isEmailValid = validateEmail(email);
        boolean isPasswordValid = validatePassword(password);

        if (isEmailValid && isPasswordValid) {
            System.out.println("Email và mật khẩu hợp lệ.");
        } else {
            if (!isEmailValid) {
                System.out.println("Email không hợp lệ.");
            }
            if (!isPasswordValid) {
                System.out.println("Mật khẩu không hợp lệ.");
            }
        }
    }
    public static boolean validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }
    public static boolean validatePassword(String password) {
        String passwordRegex = "^(?!.*\\\\s).{7,}$";
        return password.matches(passwordRegex);
    }
}
