package geometricshapes;

public class Rectangle extends Shape {
    public Rectangle(float height, float width) {
        super(height, width);
    }

    @Override
    public float calculateArea() {
        return this.getHeight() * getWidth();
    }

    @Override
    public String toString() {
        return "[Rectangle]\nheight: " + getHeight() + "\t\twidth: " + getWidth() + "\t\tarea: " + calculateArea();
    }
}
