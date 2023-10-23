package assignment3;


public class Main {
    public static void main(String[] args) {
        ShapeLinkedList shapeList = new ShapeLinkedList();
        
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                shapeList.addShape(new Square(i + 1));
            } else if (i % 3 == 1) {
                shapeList.addShape(new Rectangle(i + 1, i + 2));
            } else {
                shapeList.addShape(new Triangle(i + 1, i + 2));
            }
        }
        
        System.out.println(shapeList);
    }
}
