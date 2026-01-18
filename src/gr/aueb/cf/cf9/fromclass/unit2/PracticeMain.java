package gr.aueb.cf.cf9.fromclass.unit2;

import gr.aueb.cf.cf9.fromclass.exceptions.NegativeAmountException;
import gr.aueb.cf.cf9.fromclass.unit1.Point;
import gr.aueb.cf.cf9.fromclass.unit1.Student;

public class PracticeMain {

    public static void main(String[] args) throws NegativeAmountException {
        Student panos = new Student(1, "Panos", "Tsitsikas");
        System.out.println(panos);

        Account account = new Account("GR0301", 1000.0);
        account.deposit(300.0);
        System.out.println(account.getAccountBalance());

        System.out.println(Point.getRandomPoint());

        HelloUtil.sayHello();

        System.out.println(OnlyOneCodingFactory.getInstance());
        System.out.println(OnlyOneCodingFactory.getInstance());
    }
}
