public class Hierarchical_inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
        System.out.println("---------------------------------------------------------------");
        Cat c1 = new Cat();
        c1.eat();
        c1.meow();
        System.out.println("---------------------------------------------------------------");
        Fish f1 = new Fish();
        f1.eat();
        f1.swim();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog Barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat Meow ");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Fish Swim");
    }
}