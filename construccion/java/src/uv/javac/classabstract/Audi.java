package uv.javac.classabstract;

public class Audi extends Car {
    private int currentSpeed;

    public Audi() {
        this.currentSpeed = 0;
    }

    @Override
    public void accelerate(int amount) {
        this.currentSpeed += amount;
    }

    @Override
    public void slowDown(int amount) {
        this.currentSpeed -= amount;
    }

    @Override
    public void stop() {
        this.currentSpeed = 0;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
