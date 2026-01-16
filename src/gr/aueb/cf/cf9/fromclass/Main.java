package gr.aueb.cf.cf9.fromclass;

public class Main {

    public static void main(String[] args) {

        Student bob = new Student();

        bob.setId(1);
        bob.setFirstName("Bob");

        Student alice = new Student(2, "Alice", "Wonderland");

        System.out.println(bob.getId() + " " + bob.getFirstName());
        System.out.println(alice);

        Product product = new Product(1, " ", " ", 2.5, 50, true);

        User user = new User(1, " ", " ", " ", "***", true);

        System.out.println(Point.getRandomPoint());
    }
}
