class Address {

    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student {

    String name;
    Address address;

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow Copy
    Student shallowCopy() {
        Student copy = new Student(this.name, this.address);
        return copy;
    }

    // Deep Copy
    Student deepCopy() {
        Address newAddress = new Address(this.address.city);

        Student copy = new Student(this.name, newAddress);

        return copy;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("City: " + address.city);
    }
}

public class shallow_deep_copy {

    public static void main(String[] args) {

        // Original object
        Address a1 = new Address("Pune");
        Student s1 = new Student("Vishal", a1);

        // Shallow Copy
        Student s2 = s1.shallowCopy();

        // Deep Copy
        Student s3 = s1.deepCopy();

        // Change city through shallow copy
        s2.address.city = "Mumbai";

        // Change city through deep copy
        s3.address.city = "Nashik";

        System.out.println("Original Student:");
        s1.display();

        System.out.println("\nShallow Copy:");
        s2.display();

        System.out.println("\nDeep Copy:");
        s3.display();
    }
}