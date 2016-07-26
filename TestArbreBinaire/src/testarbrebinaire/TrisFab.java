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
            aff("i=" + i + ">>  ", tab);
        }
    }

    public static <Integer extends Comparable> void triInsertion(Integer[] tab) {
        for (int i = 1; i < tab.length; ++i) {
            int j = i;
            Integer x = tab[i];
            while (j != 0 && tab[j - 1].compareTo(x) > 0) {
                tab[j] = tab[j - 1];
//                aff("" + i + "," + j + "," + x + ">>", tab);
                --j;
            }
            tab[j] = x;
            aff("i=" + i + ",j=" + j + "," + ">>  ", tab);
        }

    }

    public static <Integer extends Comparable> void triBulle(Integer[] tab) {
        boolean estTrié = false;
        while (!estTrié) {
            estTrié = true;
            for (int i = 0; i < tab.length - 1; ++i) {
                if (tab[i].compareTo(tab[i + 1]) > 0) {
                    Integer x = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = x;
                    estTrié = false;
                }
            }
            aff(">>  ", tab);

        }
    }

    public static <Integer extends Comparable> void aff(String string, Integer[] tab) {
        System.out.print(string + " ");

        for (Integer valeur : tab) {
            System.out.print(valeur + ",");
        }
        System.out.println();
    }

    public static <Integer extends Comparable> void triRapide_r(Integer[] tab, int debut, int fin) {
        int ii = 0;
        int jj = 0;
        if (debut < fin) {
            Integer pivot = tab[0];
            ii = debut + 1;
            jj = fin;
            while (ii < jj) {
                while (ii < jj && tab[ii].compareTo(pivot) < 0) {
                    ++ii;
                }
                while (ii < jj && tab[jj].compareTo(pivot) >= 0) {
                    --jj;
                }
                Integer temp = tab[ii];
                tab[ii] = tab[jj];
                tab[jj] = temp;
                ++ii;
                --jj;
            }
            Integer temp = tab[0];
            tab[0] = tab[jj];
            tab[jj] = temp;

        }

        aff("ii=" + ii + "jj=" + jj + " >>  ", tab);
        triRapide_r(tab, debut, ii - 1);
        triRapide_r(tab, ii, fin);
    }

    public static <Integer extends Comparable> void triRapide(Integer[] tab) {
        triRapide_r(tab, 0, tab.length - 1);
    }

    public static void main(String[] args) {
        Integer[] liste1 = {11, 8, 6, 3, 10, 1, 9, 5, 7, 2, 14, 4, 15, 13, 12};

//        testarbrebinaire.TrisFab.quickSort(liste1, 0, liste1.length - 1);
        testarbrebinaire.TrisFab.triRapide(liste1);
//        testarbrebinaire.TrisFab.triBulle(liste1);
//        testarbrebinaire.TrisFab.triselection(liste1);
//        testarbrebinaire.TrisFab.triInsertion(liste1);
        System.out.println("Resultat tri  ");
        for (Integer valeur : liste1) {
            System.out.print(valeur + ",");
        }

    }

}
