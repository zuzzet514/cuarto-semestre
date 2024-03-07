package uv.javac.classabstract;

public class Main {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.accelerate(10);
        audi.slowDown(5);
        System.out.println(audi);
    }
}
