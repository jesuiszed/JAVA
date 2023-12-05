package tp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TableauVille {
	
	private Ville[]  listeVille= new Ville[4];

	public TableauVille(Ville[] listeVille) {
		super();
		this.listeVille = listeVille;
	}
	

	public void trierTableau() {
		Arrays.sort(listeVille);
	}
	public void remplirTableau() {
		listeVille[0]=new Ville("qwerty","asdf");
		listeVille[1]=new Ville("poi","jc");
		listeVille[2]=new Ville("wel","zed");
		listeVille[3]=new Ville("azerty","qwdf");
	}

	
	public void supprimerVille(Ville p) {
        List<Ville> list = new ArrayList<>(Arrays.asList(listeVille));
		list.remove(p);
        listeVille = list.toArray(new Ville[0]);
	}
	
	public int nombreVille() {
		List< Ville> list= Arrays.asList(listeVille);
		int taille=list.size();
		System.out.println(taille);
		
		return taille;
	}
		
	
	public void inverserTableau() {
		List< Ville> list= Arrays.asList(listeVille);
		Collections.reverse(list);
	}

	public void afficher() {
		System.out.println(Arrays.toString(listeVille));
	}
	
	public boolean Equals(Ville[] p) {
		System.out.println(this.equals(p));
		return false;
		}
	
	
}
