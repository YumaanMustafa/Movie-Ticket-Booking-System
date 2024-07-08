import java.util.*;
public class User {
    User(){};
    private SignUp su;
    public User(SignUp su){
        this.su = su;
        setName();
        setId();
        setEmail();
        setPassword();
        setPhoneNumber();
    }
    private String name;
    private static int cnt =0;
    private String id;

    public void setId() {
        id=getName().substring(0,2)+"-"+cnt++;
    }

    public String getName() {
        return su.getName();
    }
    public String getId() {
        return id;

    }
    private String email;
    private String password;
    private String PhoneNumber;

    public void setName() {
        name = su.getName();
    }

    public void setPassword() {
        password = su.getPassword();
    }

    public void setEmail() {
        email = su.getEmail();
    }

    public void setPhoneNumber() {
        PhoneNumber = su.getContactNumber();
    }

    public String getPassword() {
        return su.getPassword();
    }

    public String getEmail() {
        return su.getEmail();
    }

    public String getPhoneNumber() {
        return su.getContactNumber();
    }
}