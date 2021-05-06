import java.util.Scanner;

public class ATM {

    public void work(Account account) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our bank");
        System.out.println("===================");
        System.out.println("User Login");
        System.out.println("===================");

        int right_of_entry = 3;

        while (true) {
            if (login.login(account)) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Enter Failed");
                right_of_entry -= 1;
                System.out.println("Remaining right of entry: " + right_of_entry);
            }
            if (right_of_entry == 0) {
                System.out.println("You run out of right of entry");
                return;
            }
        }
            System.out.println("===================");
            String transactions = "1. Show Balance\n"
                    + "2. Deposit Money\n"
                    + "3. Withdraw Money\n"
                    + "4. Press q for quit";
            System.out.println(transactions);
            System.out.println("===================");

            while (true) {
                System.out.println("Choose Transactions");
                String transaction = scanner.nextLine();
                if (transaction.equals("q")) {
                    break;
                } else if (transaction.equals("1")) {
                    System.out.println("Your balance is: " + account.getBalance());
                } else if (transaction.equals("2")) {
                    System.out.println("The amount you want to deposit: ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    account.depositMoney(amount);
                } else if (transaction.equals("3")) {
                    System.out.println("The amount you want to withdraw: ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    account.withdrawMoney(amount);
                } else {
                    System.out.println("Invalid Transaction");
                }
            }
    }
}
