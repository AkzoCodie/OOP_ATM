public class Account {

    String username;
    String password;
    int balance;

    public Account(String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void depositMoney(int amount){
        if (amount != 0){
            balance += amount;
            System.out.println("Your new balance is: " + balance);
        }else {
            System.out.println("Enter a valid amount");
        }
    }
    public void withdrawMoney(int amount){
        if (amount <= balance){
            balance -= amount;
            System.out.println("Your new baance is: " + balance);
        }else {
            System.out.println("You can not withdraw more than " + balance);
        }
    }
}




















