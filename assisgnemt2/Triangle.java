package assisgnemt2;

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {
        this.base = 1.0;
        this.height = 1.0;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

