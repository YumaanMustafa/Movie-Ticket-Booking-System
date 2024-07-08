import java.util.*;
import java.util.*;
public class LogIn extends SignUp {
    private SignUp s;
    public LogIn(SignUp s) {
        this.s = s;
        setEmail();
        setPassword();
    }
    private String email;
    private String password;


    public void setEmail() {
        email=s.getEmail();
    }


    public void setPassword() {
        password=s.getPassword();
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void logIn() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;

        while (flag == false) {
            try {
                System.out.print("Enter email: ");
                String EMAIL = scanner.nextLine();
                System.out.print("Enter password: ");
                String pswd = scanner.nextLine();
                if(EMAIL.equals(getEmail()) && pswd.equals(getPassword())) {
                    System.out.println("Logged in successfully!");
                    flag = true;
                }
                else{
                    System.out.println("Email or Password is incorrect");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}