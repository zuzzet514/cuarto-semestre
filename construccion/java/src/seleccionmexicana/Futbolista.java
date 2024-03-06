package seleccionmexicana;

public class Futbolista extends Persona {

    private int numPlay;
    private String posicionEnCancha;

    public int getNumPlay() {
        return numPlay;
    }

    public void setNumPlay(int numPlay) {
        this.numPlay = numPlay;
    }

    public String getPosicionEnCancha() {
        return posicionEnCancha;
    }

    public void setPosicionEnCancha(String posicionEnCancha) {
        this.posicionEnCancha = posicionEnCancha;
    }

    @Override
    public void concentrarse() {
        System.out.println("*" + this.getNombre().concat(" ").concat(this.getApellidos()) + " se concentra en el juego*");
    }

    @Override
    public void viajar() {
        System.out.println("*" + this.getNombre().concat(" ").concat(this.getApellidos()) + " viaja para un partido*");
    }

    public void jugarPartido() {
        System.out.println("*" + this.getNombre().concat(" ").concat(this.getApellidos()) + " se pone a jugar el partido*");
    }

    public void entrenar() {
        System.out.println("*" + this.getNombre().concat(" ").concat(this.getApellidos()) + " entrena*");
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "\nNombre: "+ this.getNombre().concat(" ").concat(this.getApellidos()) +
                "\nEdad: " + this.getEdad() +
                "\nnumPlay: " + numPlay +
                "\nposicionEnCancha: " + posicionEnCancha + '\'' +
                "\n}";
    }
}
