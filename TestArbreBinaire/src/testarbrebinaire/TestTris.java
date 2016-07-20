/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarbrebinaire;

import testarbrebinaire.TrisFab;

/**
 *
 * @author flavo
 */
public class TestTris {

    public static void main(String[] args) {
        Integer[] liste1 = {12, 4, 7, 3, 6, 8, 2, 10, 9};

        testarbrebinaire.TrisFab.triselection(liste1);
        System.out.println("Resultat tri selection  ");
        for (Integer valeur : liste1) {
            System.out.print(valeur + ",");
        }
        Integer[] liste2 = {12, 4, 7, 3, 6, 8, 2, 10, 9};
        System.out.println("");
        testarbrebinaire.TrisFab.triInsertion(liste2);
        System.out.println("Resultat tri insertion  ");

        for (Integer valeur : liste2) {
            System.out.print(valeur + ",");
        }
//        Tris.trierInsertion(liste1);
    }

}
