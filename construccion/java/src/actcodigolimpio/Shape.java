package actcodigolimpio;

public abstract class Shape {
    private short numberOfSides;

    public Shape() {

    }

    public short getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(short numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
