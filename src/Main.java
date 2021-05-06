public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Account AkzoCodie = new Account("Username", "12345678", 5000);
        atm.work(AkzoCodie);
        System.out.println("Exiting from program.");
    }
}
