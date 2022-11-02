package DossierM;

import java.util.Scanner;

public class medecin extends personne {

	public String specialite;
	
	public medecin(String n, String p, String s) {
		super(n,p);
		specialite=s;
	}

		public String toString() {
		return "Medecin : Nom = " + nom + " | Prenom = " + prenom + " | Spécialité = " + specialite + "";
	}
		
	
		public void datesRDVs() {
			Scanner sc = new Scanner (System.in);
			System.out.print("Combien de rendez-vous voulez-vous entrer  ? : ");  
			String[] string = new String [sc.nextInt()];    
			String rdv=sc.nextLine();		
			for (int i = 0; i < string.length; i++)   
			{  
			string[i] = rdv =sc.nextLine();  
					}  
			System.out.println("Les dates de rendez-vous pour "+nom+" sont : ");

			for(String str: string)     
			{  
			System.out.println(str);
			}  
	
		}
}