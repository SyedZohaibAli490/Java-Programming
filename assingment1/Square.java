package assingment1;
import java.time.LocalDateTime;

class Square {
    private double side;
    private LocalDateTime creationDateTime;

    public Square() {
        this.side = 1.0; // Default side length
        this.creationDateTime = LocalDateTime.now();
    }

    public Square(double side) {
        this.side = side;
        this.creationDateTime = LocalDateTime.now();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    @Override
    public String toString() {
        return "Square [side=" + side + ", area=" + getArea() + ", created at " + creationDateTime + "]";
    }
}


