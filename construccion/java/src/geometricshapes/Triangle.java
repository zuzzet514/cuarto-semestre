package geometricshapes;

public class Triangle extends Shape {

    public Triangle(float height, float width) {
        super(height, width);
    }

    @Override
    public float calculateArea() {
        return (this.getHeight() * this.getWidth()) / 2;
    }

    @Override
    public String toString() {
        return "[Triangle]\nheight: " + getHeight() + "\t\tbase: " + getWidth() + "\t\tarea: " + calculateArea();
    }
}
