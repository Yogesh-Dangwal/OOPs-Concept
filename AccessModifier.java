package OOPS;
public class AccessModifier {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.Username = "Yogi";
        System.out.println("Username: " + myAcc.Username);

        myAcc.setPassword("abcde");
        System.out.println("Password: " + myAcc.getPassword());
    }
}
class BankAccount {
    public String Username;
    private String Password;
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getPassword() {
        return this.Password;
    }
}
