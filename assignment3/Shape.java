package assignment3;


import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;
abstract class Shape {
    private static AtomicInteger nextID = new AtomicInteger(1);
    private int shapeID;
    private LocalDateTime creationDateTime;

    public Shape() {
        this.shapeID = nextID.getAndIncrement();
        this.creationDateTime = LocalDateTime.now();
    }

    public int getShapeID() {
        return shapeID;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public abstract double getArea();
    public abstract void draw();

    @Override
    public String toString() {
        return "Shape [ID=" + shapeID + ", area=" + getArea() + ", created at " + creationDateTime + "]";
    }
}

