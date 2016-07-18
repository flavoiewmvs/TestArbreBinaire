/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarbrebinaire;

/**
 *
 * @author flavo
 */
public class TestArbreBinaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         *                 10
         *               /    \
         *              2      20
         *             / \    /  \
         *               4   14  
         *                     \
         *                      19
         */
        ABR monArbre = new ABR(10);
        monArbre.inserer(20);
        monArbre.inserer(2);
        monArbre.inserer(14);
        monArbre.inserer(4);
        monArbre.inserer(19);
        System.out.println(monArbre.taille());
    }
    
}
