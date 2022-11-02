package DossierM;

public abstract class personne {
	
	public String nom , prenom;

	public personne(String n, String p) {
		nom=n;
		prenom=p;
	}
	public abstract String toString();
}