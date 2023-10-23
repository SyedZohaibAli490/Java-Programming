package assignment5;

public class Main {
    public static void main(String[] args) {
        try {
            Example.myfunc(5);
            Example.myfunc(10);
            Example.myfunc(15);
            Example.myfunc(30);
            Example.myfunc(25);
        } catch (MySpecialNumberException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

