public class Final_Keyword {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.print();
        Dog d1 = new Dog();
        d1.sound();
        Puppy p1 = new Puppy();
        p1.run();
    }
}

final class Animal {
    final String name = "lion";

    // name = "tiger"; // final variable cannot resign/modify(Only assign value
    // ones)
    void print() {
        System.out.println(name + " Eating ");
    }
}

// class Dog extends Animal {

// } // Final Class cannot be inherited/extends by child class

class Dog {
    final void sound() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    // void sound(){ // it not valid, we cannot override the final method of parent
    // class
    // System.out.println("Puppy barks");

    void run() {
        System.out.println("Puppy runs fast ");
    }
}
