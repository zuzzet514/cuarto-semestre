package promedioPonderado;
import java.util.Scanner;

public class General {
    public static void main(String[] args) {
        int numCalifs = 0;
        double calificacion = 0;
        String respuesta = "y";

        Scanner s = new Scanner(System.in);

        while (respuesta.equals("y")) {
            ++numCalifs;
            System.out.print("Calificación no. " + numCalifs + ": ");
            calificacion += s.nextDouble();
            System.out.print("seguir? ");
            respuesta = s.next();
            System.out.println("\n\n");
        }

        System.out.println("Promedio general: " + calificacion / numCalifs);
    }
}
