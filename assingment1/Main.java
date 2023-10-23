package assingment1;

public class Main {
    public static void main(String[] args) {
        SquareLinkedList squareList = new SquareLinkedList();
        squareList.addSquare(new Square(3.0));
        squareList.addSquare(new Square(5.0));
        squareList.addSquare(new Square());

        System.out.println(squareList);
    }
}