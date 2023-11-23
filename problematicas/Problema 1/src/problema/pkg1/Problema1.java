/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.pkg1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaReporte = "";
        String nombreJugador;
        String posicionCampo;
        double estatura;
        int edad;
        boolean bandera = true;
        String salir;
        int sumaEdades = 0;
        double sumaEstatura = 0;
        int contador = 0;
        double promedioEdad;
        double promedioEstatura;
        cadenaReporte = String.format("%s%s\n", cadenaReporte,
                "Listado de Jugadores");

        do {
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese la estatura: ");
            estatura = entrada.nextDouble();

            sumaEdades = sumaEdades + edad;
            sumaEstatura = sumaEstatura + estatura;
            contador = contador + 1;

            cadenaReporte = String.format("%s%d.) %s -%s-, edad %d, estatura %d\n",
                    cadenaReporte,
                    contador,
                    nombreJugador,
                    posicionCampo,
                    edad, estatura);

            entrada.nextLine();
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if (salir.equals("si")) {
                bandera = false;
            }
        
    



