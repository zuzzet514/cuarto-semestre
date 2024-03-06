package seleccionmexicana;

public class Main {
    public static void main(String[] args) {
        Entrenador e1 = new Entrenador();
        Futbolista f1 = new Futbolista();

        e1.setNombre("Jordain");
        e1.setApellidos("Cruz Mendoza");
        e1.setEdad(22);
        e1.setIdentificador(345);
        e1.setIdFederacion(234);
        e1.concentrarse();
        e1.viajar();
        e1.dirigirEntrenamiento();
        e1.dirigirPartido();

        f1.setNombre("Emilio");
        f1.setApellidos("Jasso López");
        f1.setEdad(19);
        f1.setNumPlay(69);
        f1.setIdentificador(344);
        f1.setPosicionEnCancha("portero");
        f1.concentrarse();
        f1.entrenar();
        f1.viajar();
        f1.jugarPartido();

        System.out.println(e1);
        System.out.println(f1);
    }
}
