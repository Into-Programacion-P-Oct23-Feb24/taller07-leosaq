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
        int num1 = 0;
        double num2 = 1;
        double calculo;
        int op = 1;
        double total = 0;
        String signo;
        String cadenaF = "1";
        
        do {
            if (num1 % 2 == 0) {
                signo = "+";
            } else {
                signo = "-";
            }
            calculo = op * (1 / num2);
            total = total + calculo ;
            num1 = num1 + 1;
            
            if (num2 <= 1) {
                cadenaF = String.format("%s", cadenaF , (int) num2);
            } else {
                cadenaF = String.format("%s %s 1/%s", cadenaF, signo, (int) num2);
            }
            op = op * -1;
            num2 = num2 + 2;
        } while (num2 <= 15);
        System.out.printf("%s\nResultado: %.2f\n", cadenaF, total);
    }

}
