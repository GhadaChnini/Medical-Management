package DossierM;

import java.util.Scanner;

public class patientCh extends patient implements dossiermedicalP {

	public patientCh(String n, String p, String d) {
		super (n,p,d);
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
		System.out.println("*****Les d'antecedants de ce patient chronique sont : ");
		for(String str: string)     
		{  
		System.out.println(str);
		}  
		System.out.println("***Y a-t-il des antecedants qui ont un effects sur ce patient ");
		System.out.println("1-oui");
		System.out.println("2-non");
		System.out.println("choix : ");
		Scanner scanner = new Scanner (System.in);
		int choix = scanner.nextInt();
		switch (choix) {
		case 1 :
			Scanner sc1 = new Scanner (System.in);
			System.out.print("***Combien d'antecedants voulez-vous entrer ? : ");  
			String[] string1 = new String [sc.nextInt()];    
			String ant =sc1.nextLine();		
			for (int i = 0; i < string1.length; i++)   
			{  
			string1[i] = ant=sc.nextLine();  
					}  
			System.out.println("*****Les antecedants qui ont un effects sur ce patient chronique sont : ");
			for(String str: string1)     
			{  
			System.out.println(str);
			}  
			 break ;
		case 2: 
			 break ;
			
	}
	}

	public void datesRDV() {
		Scanner sc = new Scanner (System.in);
		System.out.print("***Combien de rendez-vous voulez-vous entrer  pour ce moins ? : ");  
		String[] string = new String [sc.nextInt()];    
		String rdv=sc.nextLine();		
		System.out.println("***Tapez les dates de rendez-vous : ");
		for (int i = 0; i < string.length; i++)   
		{  
		string[i] = rdv =sc.nextLine();  
				}  
		System.out.println("*****Les dates de rendez-vous pour "+nom+" sont : ");

		for(String str: string)     
		{  
		System.out.println(str);
		}  
	}

	public void rqueMed() {
		Scanner sc = new Scanner (System.in);
		System.out.print("***Combien de remarque voulez-vous entrez ? : ");  
		String[] string = new String [sc.nextInt()];    
		String rqueMed=sc.nextLine();		
		for (int i = 0; i < string.length; i++)   
		{  
		string[i] = rqueMed=sc.nextLine();  
				}  
		System.out.println("*****Les remaruqes de medecin pour ce patient chronique sont : ");
		for(String str: string)     
		{  
		System.out.println(str);
		}  
		System.out.println("***Y a-t-il des recommandations importantes ");
		System.out.println("1-oui");
		System.out.println("2-non");
		System.out.println("choix : ");
		Scanner scanner = new Scanner (System.in);
		int choix = scanner.nextInt();
		switch (choix) {
		case 1 :
			Scanner sc1 = new Scanner (System.in);
			System.out.print("***Combien de recommandations voulez-vous entrez ? : ");  
			String[] string1 = new String [sc1.nextInt()];    
			String recMed=sc1.nextLine();		
			for (int i = 0; i < string1.length; i++)   
			{  
			string1[i] = recMed=sc1.nextLine();  
					}  
			System.out.println("*****Les recommandations  de medecin pour ce patient chronique sont : ");
			for(String str: string1)     
			{  
			System.out.println(str);
			}  
			 break ;
		case 2: 
			 break ;
		}
	}
}