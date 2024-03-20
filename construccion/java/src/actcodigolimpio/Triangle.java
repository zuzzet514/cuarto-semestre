package actcodigolimpio;

public class Triangle extends Shape {
    private double height;
    private double base;
    private double side1;
    private double side2;

    public Triangle() {
        this.setNumberOfSides((short) 3);
        this.height = 0.0;
        this.base = 0.0;
        this.side1 = 0.0;
        this.side2 = 0.0;
    }

    public Triangle(double height, double base, double side1, double side2) {
        this.setNumberOfSides((short) 3);
        this.height = height;
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return (this.base * this.height) / 2;
    }

    @Override
    public double getPerimeter() {
        return this.side1 + this.side2 + this.base;
    }

    @Override
    public String toString() {
        return String.format("[Triangle]\nNumber of sides= %d\nHeight= %.2f\nBase= %.2f\nSide 1= %.2f\nSide 2 = %.2f\nArea= %.3f\nPerimeter= %.3f\n"
                        ,this.getNumberOfSides(), this.height, this.base, this.side1, this.side2, this.getArea(), this.getPerimeter());
    }
}
