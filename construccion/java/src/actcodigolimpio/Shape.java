package actcodigolimpio;

public abstract class Shape {
    private byte numberOfSides;

    public Shape(byte numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public byte getNumberOfSides() {
        return numberOfSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
