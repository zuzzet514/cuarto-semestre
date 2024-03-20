package actcodigolimpio;

public class Rectangle extends Shape implements  Resize{
    private double height;
    private double width;

    public Rectangle() {
        this.setNumberOfSides((short) 4);
        this.height = 0.0;
        this.width = 0.0;
    }

    public Rectangle(double height, double width) {
        this.setNumberOfSides((short) 4);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public double getPerimeter() {
        return (height * 2) + (width * 2);
    }

    @Override
    public void resizeByFactorX(double x) {
        this.width *=x;
        this.height *= x;
    }

    @Override
    public String toString() {
        return String.format("[Rectangle]\nNumber of sides= %d\nHeight= %.2f\nWidth= %.2f\nArea= %.3f\nPerimeter= %.3f\n"
                ,this.getNumberOfSides(), this.height, this.width, this.getArea(), this.getPerimeter());
    }
}
