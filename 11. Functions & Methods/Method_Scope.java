public class Method_Scope {
    
    public static void Printsum() {
        // ERROR: System.out.println(s); 
        // Why? Java reads code sequentially. You cannot use a variable before it is declared.
        
        int s = 10;
        System.out.println(s); // This works perfectly because 's' has now been declared and initialized.
    }
    
    public static void main(String[] args) {
        // ERROR: System.out.println(s); 
        // Why? 's' is a local variable inside Printsum(). It only exists within that method's scope 
        // and is completely invisible to the main method.
        
        Printsum(); // This works because we are calling the method, not trying to access its private variables.
    }
}