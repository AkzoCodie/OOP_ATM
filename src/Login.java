import java.util.Scanner;

public class Login {

    public boolean login(Account account){
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        System.out.println("Username: ");
        username = scanner.nextLine();
        System.out.println("Password: ");
        password = scanner.nextLine();
        if (account.getUsername().equals(username) && account.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }
}
