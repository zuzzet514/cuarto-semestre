package actcodigolimpio;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3,4);
        Triangle t1 = new Triangle(10, 5.5, 5.1, 12.7);

        System.out.println(r1);
        System.out.println(t1);

        r1.resizeByFactorX(3);

        System.out.printf("\nR1\narea= %.2f\nperimeter= %.2f%n", r1.getArea(), r1.getPerimeter());
    }
}
