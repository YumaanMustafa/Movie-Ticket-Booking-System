import java.util.List;
import java.util.Scanner;
class SignUp{
    private String name;
    private String email;
    private String contactNumber;
    private String password;
    public void signUp() {
        while (true) {
            try {
                System.out.println("Make sure your password contains at least:"+"\none special character (!@#$%^&*)\n" +
                        "Contains at least two uppercase letters (A-Z)\n" +
                        "Contains at least two numeric digits (0-9)\n" +
                        "Has a minimum length of 6 characters");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter name: ");
                name = scanner.nextLine();
                setName(name);
                System.out.print("Enter email: ");
                email = scanner.nextLine();
                validateEmail(email);
                System.out.print("Enter contact number: ");
                contactNumber = scanner.nextLine();
                PhoneNumberValidation(contactNumber);
                System.out.print("Enter password: ");
                password = scanner.nextLine();
                validatePassword(password);
                System.out.println("Sign up successful!");
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        contactNumber=phoneNumber;
    }


    public void validateEmail(String email) throws Exception {
        if (!email.matches("^[A-Za-z0-9+_.-]+@(gmail|hotmail|yahoo|outlook)\\.com$")) {
            throw new Exception("Invalid email format. Please enter a valid email address ending with @gmail.com, @hotmail.com, or @yahoo.com.");
        }
        else{
            setEmail(email);
        }
    }
    public void validatePassword(String password) throws Exception {
        if (!password.matches("^(?=.*[!@#$%^&*])(?=.*[A-Z])(?=.*[0-9])(?=.*[A-Z])(?=.*[0-9]).{6,}$")) {
            throw new Exception("Invalid password format. Please enter a password with 1 special character, 2 uppercase letters, 2 numbers, and a minimum length of 6 characters.");
        }
        else{
            setPassword(password);
        }
    }
    public void PhoneNumberValidation(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            throw new IllegalArgumentException("Invalid phone number format. Please enter a valid phone number consisting of 11 digits");
        }
        else{
            setPhoneNumber(phoneNumber);
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getPassword() {
        return password;
    }
}