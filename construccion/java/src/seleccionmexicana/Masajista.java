package seleccionmexicana;

public class Masajista extends Persona{

    private String profesion;
    private int aniosExperiencia;

    public Masajista(String profesion, int aniosExperiencia) {
        this.profesion = profesion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("*" + this.getNombre().concat(" ").concat(this.getApellidos()) + " se concentra en su chamba*");
    }

    @Override
    public void viajar() {
        System.out.println("*" + this.getNombre().concat(" ").concat(this.getApellidos()) + " viaja con en el equipo*");
    }

    public void darMasaje() {
        System.out.println("*" + this.getNombre().concat(" ").concat(this.getApellidos()) + " da masaje a un jugador*");
    }

    @Override
    public String toString() {
        return "Masajista{" +
                "\nNombre: "+ this.getNombre().concat(" ").concat(this.getApellidos()) +
                "\nEdad: " + this.getEdad() +
                "\nprofesion: " + profesion + '\'' +
                "\naniosExperiencia: " + aniosExperiencia +
                "\n}";
    }
}
