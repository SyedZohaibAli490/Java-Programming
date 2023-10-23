package assignment_singleton;

public class Main {
    public static void main(String[] args) {
        Person p1 = Person.getInstance();
        System.out.println("p1 " + p1);

        Person p2 = Person.getInstance();
        System.out.println("p2 " + p2);

        // Check if p1 and p2 have the same hash code
        System.out.println("Hash code of p1: " + System.identityHashCode(p1));
        System.out.println("Hash code of p2: " + System.identityHashCode(p2));

        // Set properties of the singleton instance
        p1.setAutoId(1);
        p1.setUsername("john_doe");
        p1.setPassword("secret");
        p1.setGender("Male");

        // Access and print properties through p2
        System.out.println("p2 Auto ID: " + p2.getAutoId());
        System.out.println("p2 Username: " + p2.getUsername());
        System.out.println("p2 Password: " + p2.getPassword());
        System.out.println("p2 Gender: " + p2.getGender());
    }
}
