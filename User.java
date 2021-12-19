// Constructor
import java.util.Scanner;
public class User {
    public String Username;
    public String Password;

    public User(String Username, String Password){
        this.Username = Username;
        this.Password = Password;
    }
}


class DemoUser{
    public static void main(String[] args) {
        //Constructor Input User
       Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan Username: ");
        String Username= Input.nextLine();
        System.out.print("Masukkan Password: ");
        String Password = Input.nextLine();
        User UserInput = new User(Username, Password);

        System.out.println("Username :"+UserInput.Username);
        System.out.println("Password :"+UserInput.Password);

        //Constructor Biasa Pemanggilan
       User Akbar = new User("Akbarrzql", "Akbar22");
        System.out.println("Username: "+ Akbar.Username);
        System.out.println("Password: "+ Akbar.Password);


    }
}
