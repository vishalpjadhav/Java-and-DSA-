
public class inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog("red", "puppy");
        d1.eat();
        d1.bark();
        d1.sleep();
    }
}

class Animal {
    String color;
    String name;

    Animal(String color, String name) {
        this.color = color;
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is Eating....");
    }

    void sleep() {
        System.out.println(name + " is Sleeping....");
    }
}

class Dog extends Animal {

    Dog(String color, String name) {
        super(color, name);

    }

    void bark() {
        System.out.println(name + " is Barking");
    }
}
