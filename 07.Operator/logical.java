public class logical {
    public static void main(String[] args) {
        int age = 20;
        boolean hasLicense = true;

        System.out.println(age >= 18 && hasLicense); // true
        System.out.println(age >= 18 || hasLicense); // true
        System.out.println(!hasLicense);             // false
    }
}

