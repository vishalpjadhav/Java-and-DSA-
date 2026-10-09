public class Hybrid_inheritance {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.eat();
        c1.meow();
        System.out.println("------------------------------------------------------------");
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
        System.out.println("------------------------------------------------------------");
        Puppy p1 = new Puppy();
        p1.eat();
        p1.bark();
        p1.color();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal eating ");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat Meow");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog Barking");
    }
}

class Puppy extends Dog {
    void color() {
        System.out.println("Black");
    }
}