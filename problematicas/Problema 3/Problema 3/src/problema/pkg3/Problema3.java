/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.pkg3;

/**
 *
 * @author leand
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int denom = 1;
        int nom = 2;
        do {
            System.out.println(nom);
            denom = denom + 2;
            nom = nom + denom;
        } while (denom <= 11);
    }

}
