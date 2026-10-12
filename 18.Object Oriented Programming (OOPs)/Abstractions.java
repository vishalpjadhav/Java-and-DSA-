public class Abstractions {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
        d1.eat();
    }
}

abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Animals Eats");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barks ");
    }
}
