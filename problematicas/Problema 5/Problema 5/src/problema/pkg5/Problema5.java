/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.pkg5;

/**
 *
 * @author leand
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 1;
        int num2 = 3;
        int limite = 15;
        String signo;
        String cadena = "1";

        do {
            if (num1 % 2 == 0) {
                signo = "+";
            } else {
                signo = "-";
            }

            num1 = num1 + 1;
            cadena = String.format("%s %s 1/%s", cadena, signo, num2);
            num2 = num2 + 2;
        } while (num2 <= limite);
        System.out.println(cadena);
    }

}