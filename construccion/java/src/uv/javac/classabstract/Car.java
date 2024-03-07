package uv.javac.classabstract;

public abstract class Car {

    public abstract void accelerate(int amount);
    public abstract void slowDown(int amount);
    public abstract void stop();

    public void apenMusic(String musicName) {
        System.out.println("Music is playing" + musicName);
    }
}
