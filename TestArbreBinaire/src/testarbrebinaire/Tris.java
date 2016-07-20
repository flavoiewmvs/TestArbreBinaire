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
public class Tris {
    
    public static int[] trierInsertion ( int[] tableau ) {
        int[] listeCopie = copierListe(tableau);
        int elementListe;
        int j;
        
        System.out.println ( "Tri par insertion" );
       
        for ( int i = 1; i < listeCopie.length; i ++ ) {
            
            elementListe = listeCopie[i];
            j = i - 1;
            while ( j >= 0 && elementListe < listeCopie[j] ) {
                listeCopie[j+1] = listeCopie[j];
                
                System.out.print ( "    j = " + j + " : " );
                afficherListe (listeCopie );
                
                j--;
            } 
            listeCopie[j + 1] = elementListe;
            
            System.out.print ( "i = " + i + " : " );
            afficherListe(listeCopie);	           
        } 
        return listeCopie;
    } 
    
    private static int[] copierListe ( int[] tableau ) {
        int[] copie = new int [ tableau.length ];
        System.arraycopy(tableau, 0, copie, 0, tableau.length);
        return copie;
    } 
    
    private static void afficherListe ( int[] tableau ) {
        for ( int i = 0; i < tableau.length; i++ ) {
            System.out.print (tableau[i] + " " );
        }
        System.out.println ();
    } 
}