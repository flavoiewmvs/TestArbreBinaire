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

    public E getElement() {
        return _element;
    }

    public ABR<E> getGauche() {
        return _gauche;
    }

    public ABR<E> getDroite() {
        return _droite;
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

    protected E elementPlusAGauche() {
        return (_gauche == null) ? _element : _gauche.elementPlusAGauche();
    }

    public ABR<E> supprimer(E element) {
        ABR<E> resultat = this;
        int direction = element.compareTo(_element);
        if (direction < 0) {
            if (_gauche != null) {
                _gauche = _gauche.supprimer(element);
            }
        } else if (direction > 0) {
            if (_droite != null) {
                _droite = _droite.supprimer(element);
            }
        } else if (_gauche == null) {; // 2 cas >>>
            resultat = _droite;
        } else if (_droite == null) {
            resultat = _gauche;

        } else {
            _element = _droite.elementPlusAGauche();
            _droite = _droite.supprimer(_element);
        }
        return resultat;
    }

    /**
     * Affiche l'arbre selon un parcours prefixe
     */
    public void ParcoursPrefixe() {
        System.out.print(getElement() + ",");
        if (getGauche() != null) {
            getGauche().ParcoursPrefixe();
        }
        if (getDroite() != null) {
            getDroite().ParcoursPrefixe();
        }
    }

    /**
     * Affiche l'arbre selon un parcours infixe
     */
    public void ParcoursInfixe() {
        if (getGauche() != null) {
            getGauche().ParcoursInfixe();
        }
        System.out.print(getElement()+",");
        if (getDroite() != null) {
            getDroite().ParcoursInfixe();
        }
    }

    /**
     * Affiche l'arbre selon un parcours Suffixe
     */
    public void ParcoursSuffixe() {
        if (getGauche() != null) {
            getGauche().ParcoursSuffixe();
        }
        if (getDroite() != null) {
            getDroite().ParcoursSuffixe();
        }
        System.out.print(getElement() + ",");
    }
}
