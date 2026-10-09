public class Multilevel_inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.walk();
        d1.eat();
        d1.bark();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal Eating ");
    }

    void sleep() {
        System.out.println("Animal Sleep");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammel Can Walk");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog Barking");
    }
}
