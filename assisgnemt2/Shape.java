package assisgnemt2;
import java.time.LocalDateTime;

abstract class Shape {
    private LocalDateTime creationDateTime;

    public Shape() {
        this.creationDateTime = LocalDateTime.now();
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public abstract double getArea();
    public abstract void draw();

    @Override
    public String toString() {
        return "Shape [area=" + getArea() + ", created at " + creationDateTime + "]";
    }
}





