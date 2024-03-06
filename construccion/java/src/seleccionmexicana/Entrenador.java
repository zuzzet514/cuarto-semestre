package seleccionmexicana;

public class Entrenador extends Persona {

    private int idFederacion;

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("*" + this.getNombre().concat(" ").concat(this.getApellidos()) + " se concentra en su chamba*");
    }

    @Override
    public void viajar() {
        System.out.println("*" + this.getNombre().concat(" ").concat(this.getApellidos()) + " viaja con en el equipo*");
    }

    public void dirigirPartido() {
        System.out.println("*" + this.getNombre().concat(" ").concat(this.getApellidos()) + " dirige el partido del equipo*");
    }

    public void dirigirEntrenamiento() {
        System.out.println("*" + this.getNombre().concat(" ").concat(this.getApellidos()) + " dirige el entrenamiento del equipo*");
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "\nNombre: "+ this.getNombre().concat(" ").concat(this.getApellidos()) +
                "\nEdad: " + this.getEdad() +
                "\nIdentificador: " + this.getIdentificador() +
                "\nidFederacion: " + idFederacion +
                "\n}";
    }
}
