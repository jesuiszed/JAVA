package tp;

import java.util.Objects;

public class Ville implements Cloneable, Comparable <Ville>{
	private String nom;
	private String nomMaire;
	
	public Ville(String nom, String nomMaire) {
		this.nom = nom;
		this.nomMaire = nomMaire;
	}

	@Override
	public String toString() {
		return "Ville : nom=" + nom + "  nomMaire=" + nomMaire + "\n";
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNomMaire() {
		return nomMaire;
	}

	public void setNomMaire(String nomMaire) {
		this.nomMaire = nomMaire;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ville other = (Ville) obj;
		return Objects.equals(nom, other.nom) && Objects.equals(nomMaire, other.nomMaire);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

	@Override
	public int compareTo(Ville p) {
		// TODO Auto-generated method stub
		return this.nom.compareTo(p.nom);
	}

	


}
