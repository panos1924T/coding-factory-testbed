package gr.aueb.cf.cf9.fromclass.unit1;

import gr.aueb.cf.cf9.fromclass.unit2.OnlyOneCodingFactory;
import gr.aueb.cf.cf9.fromclass.unit2.OnlyOneCodingLazy;

public class Main {

    public static void main(String[] args) {

        //java beans
        Student bob = new Student();

        bob.setId(1);
        bob.setFirstName("Bob");

        Student alice = new Student(2, "Alice", "Wonderland");

        System.out.println(bob.getId() + " " + bob.getFirstName());
        System.out.println(alice);

        Product product = new Product(1, " ", " ", 2.5, 50, true);

        User user = new User(1, " ", " ", " ", "***", true);

        //Point
        System.out.println(Point.getRandomPoint());

        //eager
        OnlyOneCodingFactory eager1 = OnlyOneCodingFactory.getInstance();
        OnlyOneCodingFactory eager2 = OnlyOneCodingFactory.getInstance();

        System.out.println("eager1: " + eager1);
        System.out.println("eager2: " + eager2);

        if (eager1 == eager2) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }

        //lazy
        OnlyOneCodingLazy lazy1 = OnlyOneCodingLazy.getInstance();
        OnlyOneCodingLazy lazy2 = OnlyOneCodingLazy.getInstance();

        System.out.println("lazy1: " + lazy1);
        System.out.println("lazy2: " + lazy2);

        if (lazy1 == lazy2) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }
}
