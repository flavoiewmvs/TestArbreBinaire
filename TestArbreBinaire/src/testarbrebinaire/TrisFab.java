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
public class TrisFab {

    public static <Integer extends Comparable> void triselection(Integer[] tab) {
        for (int i = 0; i < tab.length - 1; ++i) {
            Integer valeurMin = tab[i];
            int posPetit = i;
            for (int j = i + 1; j < tab.length; ++j) {
                if (tab[j].compareTo(valeurMin) < 0) {
                    valeurMin = tab[j];
                    posPetit = j;
                }
            }
            tab[posPetit] = tab[i];
            tab[i] = valeurMin;
        }
    }

    public static <Integer extends Comparable> void triInsertion(Integer[] tab) {
        for (int i = 1; i < tab.length; ++i) {
            int j = i;
            Integer x = tab[i];
            while (j != 0 && tab[j - 1].compareTo(x) > 0) {
                 tab[j] = tab[j - 1];
                                aff(""+i+","+j+","+x+">>",tab);
                --j;
            }
            tab[j] = x;
                           aff(""+i+","+j+","+x+">>",tab);
        }

    }

    public static <Integer extends Comparable> void aff(String string, Integer[] tab) {
        System.out.print(string + " ");

        for (Integer valeur : tab) {
            System.out.print(valeur + ",");
        }
        System.out.println();
    }

    
}
