package assignment5;

class Example {
    public static void myfunc(int x) throws MySpecialNumberException {
        if (x == 10 || x == 20 || x == 30) {
            throw new MySpecialNumberException("MySpecialNumberException: x cannot be 10, 20, or 30");
        } else {
            System.out.println("x = " + x);
        }
    }
}
