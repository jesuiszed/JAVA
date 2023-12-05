package tp;

public class Test {

	public static void main(String[] args) {
		 Ville[]  listeVille= new Ville[4];
		TableauVille Villes = new TableauVille(listeVille);

		Villes.remplirTableau();
		System.out.println("Nombre de ville :");
		Villes.nombreVille();
		System.out.println("Liste des villes");
		Villes.afficher();
		System.out.println("Liste des villes inverser");
		Villes.inverserTableau();
		Villes.afficher();
		System.out.println("Liste des villes trier");
		Villes.trierTableau();
		Villes.afficher();
		System.out.println("Liste des villes apres suppression");
        Ville villeASupprimer = new Ville("poi", "jc");
		Villes.supprimerVille(villeASupprimer);
		Villes.afficher();

		TypeVille villes = new TypeVille();

        // Ajout de quelques villes pour tester
        villes.Ajouter("Paris", "Anne Hidalgo");
        villes.Ajouter("Berlin", "Michael Müller");
        villes.Ajouter("Rome", "Virginia Raggi");
        villes.Ajouter("New York", "Bill de Blasio");

        // Affichage de la liste des villes
        System.out.println("Liste des villes :");
        villes.Afficher();

        // Affichage de la liste inversée
        System.out.println("\nListe des villes inversée :");
        villes.inverserListe();
        villes.Afficher();

        // Affichage de la liste triée
        System.out.println("\nListe des villes triée :");
        villes.trierListe();
        villes.Afficher();

        // Suppression d'une ville et affichage de la liste après suppression
        Ville villeaSupprimer = villes.rechercherElement("Berlin");
        if (villeaSupprimer != null) {
            System.out.println("\nListe des villes après suppression de " + villeaSupprimer.getNom() + " :");
            villes.supprimerElement(villeaSupprimer);
            villes.Afficher();
        } else {
            System.out.println("La ville à supprimer n'a pas été trouvée.");
        }

	}

	
}
