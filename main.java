package DossierM;

public class main {

	public static void main (String []args) {
		patientCh p1=new patientCh("wahib", "dellel", "15/11/2001");
		patientNonCh p2=new patientNonCh("ghada","chnini","17/01/2001");
		medecin m1=new medecin("gadour","ameur","aa");
		per per=new per(10);
		per.ajouterMedecin(m1);
		per.ajouterPatient(p1);
		per.ajouterPatient(p2);
		per.afficherpatient(p1);
		p1.maladies();
		p1.typem();
		p1.datesRDV();
		p1.rqueMed();
		p1.analyses();
		p1.antecedants();
		per.afficherpatient(p2);
		p2.maladies();
		p2.typem();
		p2.datesRDV();
		p2.rqueMed();
		p2.analyses();
		p2.antecedants();
		per.affichermedecin(m1);
		m1.datesRDVs();
		per.pourcentagech();
	}
}