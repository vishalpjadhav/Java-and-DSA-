public class Runtime_poly {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.sound();
        Animal a2 = new Animal();
        a2.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}