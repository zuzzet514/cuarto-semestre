package promedioPonderado;

import java.util.Scanner;

public class Ponderado {
    public static void main(String[] args) {

        int creditos = 0;
        int calif  = 0;
        double factorPoderacion= 0;
        double totalCreditos = 0;

        String respuesta = "y";

        Scanner sc = new Scanner(System.in);

        while (respuesta.equals("y")) {
            System.out.print("creditos: ");
            creditos = sc.nextInt();
            totalCreditos += creditos;
            System.out.print("calif: ");
            calif = sc.nextInt();

            factorPoderacion += creditos * calif;
            System.out.println("\nfactor ponderación: " + factorPoderacion + "\ntotal creditos: " + totalCreditos);
            System.out.print("seguir? ");
            respuesta = sc.next();
            System.out.println("\n\n");
        }

        System.out.println("Promedio: " + factorPoderacion / totalCreditos);


    }
}


