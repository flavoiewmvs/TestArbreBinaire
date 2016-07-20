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
         * 10 / \ 5 22 / \ 20 27 / 15 / 11 \ 12
         */
        ABR monArbre = new ABR(10);
        monArbre.inserer(7);
        monArbre.inserer(12);
        monArbre.inserer(4);
        monArbre.inserer(8);
        monArbre.inserer(2);
        monArbre.inserer(5);
        monArbre.inserer(15);
        monArbre.inserer(13);
//        System.out.println(monArbre.taille());
        monArbre.ParcoursPrefixe();
        System.out.println();
        monArbre.ParcoursSuffixe();
        System.out.println();
        monArbre.ParcoursInfixe();
//        monArbre.supprimer(10);
//        System.out.println(monArbre.taille());
    }
}
