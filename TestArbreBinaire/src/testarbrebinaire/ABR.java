/*
 code: (watt & brown 2001)
        guy lapalme 2011)
        (b.m   2016)

 */
package testarbrebinaire;

/**
 *
 * @author flavo
 */
public class ABR<E extends Comparable<E>> {

    protected E _element;
    protected ABR<E> _gauche;
    protected ABR<E> _droite;

    public ABR() {
    }

    public ABR(E element) {
        _element = element;
        _gauche = null;
        _droite = null;
    }

    public ABR<E> inserer(E element) {
        int direction = element.compareTo(_element);
        if (direction < 0) {
            _gauche = (_gauche == null) ? new ABR<E>(element) : _gauche.inserer(element);
        } else if (direction > 0) {
            _droite = (_droite == null) ? new ABR<E>(element) : _droite.inserer(element);
        }
        return this;
    }

    public int taille() {
        return ((_gauche == null) ? 0 : _gauche.taille()) + ((_droite == null) ? 0 : _droite.taille()) + 1;
    }

    /**
     * 10 / \ 2 20 / \ / \ 4 14 \ 19
     */
//    public String[] affiche(int niveau) {
//        String[] ligne = new String[100]; // ici id/alemeent devions valider nom de niveau
//        int espace = 16;
//
//        if (niveau == 0) {
//            for (int i = 1; i <= espace; ++i) {
//                ligne[niveau] += " ";
//            }
//            ligne[niveau] += _element;
//        }
//
//        if (_gauche == null) {
//            for (int i = 1; i <= espace / (niveau + 1); ++i) {
//                ligne[niveau+1] += " ";
//            }
//            ligne[niveau+1] += "xx";
//            for (int i = 1; i <= espace / (niveau + 1); ++i) {
//                ligne[niveau+1] += " ";
//            }
//        } else {
//            ligne[niveau+1]=_gauche.affiche(niveau+1);
//            
//            
//            for (int i = 1; i <= espace / (niveau + 1); ++i) {
//                ligne[niveau] += " ";
//            }
//            ligne[niveau] += "xx";
//            for (int i = 1; i <= espace / (niveau + 1); ++i) {
//                ligne[niveau] += " ";
//            }
//        }
//        
//        if (_droite == null) {
//            for (int i = 1; i <= espace / (niveau + 1); ++i) {
//                ligne[niveau] += " ";
//            }
//            ligne[niveau] += "xx";
//            for (int i = 1; i <= espace / (niveau + 1); ++i) {
//                ligne[niveau] += " ";
//            }
//        } else {
//        }
//        return ligne;
//    }
}
