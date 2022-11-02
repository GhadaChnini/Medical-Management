package DossierM;

import java.util.Scanner;

public class patientNonCh extends patient implements dossiermedicalP {

	public patientNonCh(String n, String p, String d) {
		super(n, p, d);
	}
	
	public void antecedants() {
		Scanner sc = new Scanner (System.in);
		System.out.print("***Combien d'antecedants voulez-vous entrer ? : ");  
		String[] string = new String [sc.nextInt()];    
		String antecedant=sc.nextLine();		
		for (int i = 0; i < string.length; i++)   
		{  
		string[i] = antecedant=sc.nextLine();  
				}  
		System.out.println("*****Les d'antecedants ce patient non chronique sont : ");
		for(String str: string)     
		{  
		System.out.println(str);
		}  
	}
	
	public void datesRDV() {
		System.out.println("***Tapez la date de rendez-vous : ");
		Scanner sc = new Scanner (System.in);
		String dateRdv=sc.nextLine();
		System.out.println("*****La rendez-vous de ce patient non chronique est " +dateRdv);
	}

	public void rqueMed() {
		Scanner sc = new Scanner (System.in);
		System.out.print("***Combien de remarque voulez-vous entrer ? : ");  
		String[] string = new String [sc.nextInt()];    
		String rqueMed=sc.nextLine();		
		for (int i = 0; i < string.length; i++)   
		{  
		string[i] = rqueMed=sc.nextLine();  
				}  
		for(String str: string)     
		{  
		System.out.println("***Les remarques de medecin pour ce patient non chronique sont : "+str);
		}  
	}
}