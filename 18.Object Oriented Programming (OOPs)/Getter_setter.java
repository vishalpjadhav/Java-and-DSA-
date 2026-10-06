public class Getter_setter {
    public static void main(String[] args) {
        Bank B1 = new Bank();
        B1.setbalance(10000);
        System.out.println("Your balance is :- "+B1.getbalance());

    }
}

class Bank {
    private int balance;
    private int password;

    int getbalance(){
        return this.balance;
    }

    void setbalance(int newbalance){
        this.balance = newbalance;
    }
}