package DossierM;

import java.util.Scanner;

public class patient extends personne{
	public int choix;

	public String datenaissance;
	
	public class datenaissance {
		public int annee;
		public int mois;
		public int jour;
		
		public datenaissance (int a , int m , int j) {
			this.annee=a;
			this.mois=m;
			this.jour=j;
		}

		public String date() {
			return "Date de naissance : " + annee + "/ =" + mois + "/ =" + jour + "";
		}
	}
	
	public patient(String n, String p,String d) {
		super(n, p);
		datenaissance=d;
	}

	public String toString() {
		return "Patient : Nom = "+ nom + " | Prenom = " + prenom + " | Date de naissance = " + datenaissance;
	}
	
	public void maladies() {
		System.out.println("***Tapez la maladie : ");
		Scanner sc = new Scanner (System.in);
		String maladie=sc.nextLine();
		System.out.println("*****La maladie de "+nom+" est " +maladie);
	}
	public void analyses() {
		Scanner sc = new Scanner (System.in);
		System.out.print("***Combien d'analyses voulez-vous entrer ? : ");
		String[] string = new String [sc.nextInt()];    
		String analyse=sc.nextLine();		
		for (int i = 0; i < string.length; i++)   
		{  
		string[i] = analyse=sc.nextLine();  
				}
		System.out.println("*****Les analyses ce patient chronique sont : ");

		for(String str: string)     
		{  
		System.out.println(str);
		}
	}

	public void typem() {
		System.out.println("***Quel est le type de maladie:");
		System.out.println("1-Maladie chronique");
		System.out.println("2-Maladie non chronique");
		System.out.println("choix : ");
		Scanner scanner = new Scanner (System.in);
		int choix = scanner.nextInt();
		this.choix=choix;
		 
	}
	
	public String gettypem() {
		if (choix==1) {
			return("chronique");
		}else {
			return("non chronique");
		}
	}
}