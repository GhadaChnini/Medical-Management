package DossierM;

public class per {

	public patient patients[];
	public medecin medecins[];
	public int nbpat;
	public int nbmed;
	public int nbch;
	public per (int max) {
		medecins = new medecin[max];
		patients = new patient[max];
	}
	public void ajouterPatient(patient p) {
		if (nbpat==patients.length) {
			System.out.println("Dossier Plein");
			}
		else {
			if (nbpat==0) {
				patients[0]=p;
				nbpat++;
			}
			else {
				patients[nbpat]=p;
				nbpat++;
			}
		}
	}
	public void patients() {
		for( int i=0 ; i<nbpat ; i++) {
			System.out.println(patients[i].toString());
		}
	}
	
	public void afficherpatient(patient p) {
		System.out.println(p.toString());
	}
	
	public void ajouterMedecin(medecin m) {
		if (nbmed==medecins.length) {
			System.out.println("Dossier Plein");
			}
		else {
			if (nbmed==0) {
				medecins[0]=m;
				nbmed++;
			}
			else {
				medecins[nbmed]=m;
				nbmed++;
			}
		}
	}
	
	public void medecins() {
		for( int i=0 ; i<nbmed ; i++) {
			System.out.println(medecins[i].toString());
		}
	}
	
	public void affichermedecin(medecin m) {
		System.out.println(m.toString());
	}
	
	public void pourcentagech() {
		nbch=0;
		for (int i=0;i<nbpat;i++) {
			if (patients[i].gettypem()=="chronique") {
				nbch++;
			}
		}
		System.out.println("Pourcentage des patients ayant une maladie chronique est : "+nbch*100/nbpat+" % ");
	}
}