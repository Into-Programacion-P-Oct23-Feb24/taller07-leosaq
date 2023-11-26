/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.pkg2;

/**
 *
 * @author leand
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nom = 0;
        int denom = 2;

        while (denom <= 20) {
            nom = nom + denom;
            denom = denom + 2;
            System.out.println(nom);

        }

    }

}
