package gr.aueb.cf.cf9.ch11;

public class Main {

    public static void main(String[] args) {

        User user = new User(1L, "Panos", "Tsitsikas");

        System.out.printf("New user's\n Id: %d,\n First Name: %s,\n Last Name: %s",
                user.getId(), user.getFirstname(), user.getLastname());
    }
}
