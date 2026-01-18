package gr.aueb.cf.cf9.fromclass.unit4;

public class Main {

    public static void main(String[] args) {
        ISpeakable obj1 = new Cat();
        ISpeakable obj2 = new Dog();

        obj1.speak();
        obj2.speak();
    }
}
