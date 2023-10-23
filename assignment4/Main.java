package assignment4;


public class Main {
    public static void main(String[] args) {
        int n = 10; // Number of even numbers
        int m = 10; // Number of odd numbers
        
        EvenThread evenThread = new EvenThread(n);
        OddThread oddThread = new OddThread(m);

        evenThread.start();
        oddThread.start();
    }
}

