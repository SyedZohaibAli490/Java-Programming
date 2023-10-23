package assignment4;

class EvenThread extends Thread {
    private int n;

    public EvenThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 2; i <= n; i += 2) {
            System.out.println("Even Thread: " + i);
        }
    }

    @Override
    public String toString() {
        return "EvenThread";
    }
}

