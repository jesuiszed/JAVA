package tp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TypeVille {
    List<Ville> list = new ArrayList<>();
    
    public void Ajouter(String nom, String nomMaire)
    {
    	Ville nVille = new Ville("nom","nomMaire");    	
    	list.add(nVille);
    }
    
    public void Afficher() 
    {
    	for(Ville v: list) {
    		System.out.println("Nom:"+v.getNom() +"Maire:"+v.getNomMaire());
    	}
    	
    }
    
    public void parcourirAvecIterateur() {
        Iterator<Ville> iterator = list.iterator();
        while (iterator.hasNext()) {
            Ville ville = iterator.next();
            System.out.println("Nom de la ville : " + ville.getNom() + ", Maire : " + ville.getNomMaire());
        }
    }
    
    public void insererElement(Ville v) {
        list.add(v);
    }
    
    public Ville recupererElement(int i) {
        if (i >= 0 && i < list.size()) {
            return list.get(i);
        }
        return null;
    }
    
    public void supprimerElement(Ville v) {
        list.remove(v);
    }
    
    public Ville rechercherElement(String nom) {
        for (Ville ville : list) {
            if (ville.getNom().equals(nom)) {
                return ville;
            }
        }
        return null;
    }
    
    
    public void trierListe() {
        Collections.sort(list);
    }
    
    public List<Ville> copierListe() {
        return new ArrayList<>(list);
    }
    
    
    public void melangerListe() {
        Collections.shuffle(list);
    }
    
    
    public void inverserListe() {
        Collections.reverse(list);
    }
    
    public List<Ville> extrairePartie(int debut, int fin) {
        if (debut >= 0 && debut <= fin && fin < list.size()) {
            return list.subList(debut, fin + 1);
        }
        return null;
    }
    
    public boolean comparerListes(List<Ville> autreListe) {
        return list.equals(autreListe);
    }

    public void echangerElements(int index1, int index2) {
        Collections.swap(list, index1, index2);
    }
    
    public void viderListe() {
        list.clear();
    }

    public boolean estVide() {
        return list.isEmpty();
    }
}
