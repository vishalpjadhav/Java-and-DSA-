public class Access_modifier {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Vishaal";
        myAcc.SetPassword("jadhavvv");
    }
}

class BankAccount {
    public String username;
    private String password;

    public void SetPassword(String pwd) {
        password = pwd;
    }
}
