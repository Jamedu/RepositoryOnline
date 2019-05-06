import java.util.ArrayList;
import java.util.List;

public class Passwortchecker {
	
	static boolean einGro�=false;
	static boolean einKlein=false;
	static boolean einSonder=false;
	static boolean langGenug=false;
	static boolean eineZahl=false;

	
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zuCharArray("P@sswort");
	}

	public static void zuCharArray (String test)
	{
		System.out.println(test);
		char[] charArray = test.toCharArray(); //Oben einegebens wort zu char array
	//	System.out.println(charArray[0]);
	//	System.out.println();
		
		
		
			for (int i=0; i < charArray.length; i++)
			{
				if (Character.isUpperCase(charArray[i]))
				{
					System.out.println(charArray[i] + " ist ein Gro�buchstabe");
					einGro�=true;
					
				}else {
					System.out.println(charArray[i] + " ist kein Gro�buchstabe");
				}
			}
		
				System.out.println(" ");
		
			for (int i=0; i < charArray.length; i++)
			{
				if (Character.isLowerCase(charArray[i]))
				{
					System.out.println(charArray[i] + " ist ein Kleinbuchstabe");
					einKlein=true;
				}else {
					System.out.println(charArray[i] + " ist kein Kleinbuchstabe");
				}
			}
			
			System.out.println(" ");
			
			for (int i=0; i < charArray.length; i++)
			{
				if (Character.isDigit(charArray[i]))
				{
					System.out.println(charArray[i] + " ist eine Zahl");
					eineZahl=true;
				}else {
					System.out.println(charArray[i] + " ist keine Zahl");
				}
			}
			
			System.out.println(" ");
			
			/*
				for (int i=0; i < charArray.length; i++)
			{
				if (Character.isLetter(charArray[i]))
				{
					System.out.println(charArray[i] + " ist ein Buchstabe");
					
				}else {
					System.out.println(charArray[i] + " ist kein Buchstabe");
				}
			}
			
			System.out.println(" ");
			*/

			for (int i=0; i < charArray.length; i++)
			{
				if (Character.isLetterOrDigit(charArray[i]))
				{
					System.out.println(charArray[i] + " ist kein Sonderzeichen");
				}else {
					System.out.println(charArray[i] + " ist ein Sonderzeichen");
					einSonder=true;
				}
			}
			
			System.out.println(" ");
			
			 if(charArray.length >= 8)
			 {
				 System.out.println("Passwort ist lang genug!");
				 langGenug=true;
			 }else{
				 System.out.println("Passwort ist zu kurz!");
			 }
			 
			 System.out.println(" ");
			 System.out.println(" ");
			 
			 
			 
			 if(langGenug==true && eineZahl==true && einGro�==true && einKlein==true && einSonder==true)
			 {
				 System.out.println("Das Passwort ist sicher");
			 }else {
				 System.out.println("Das Passwort ist nicht sicher");
			 }
			
			 System.out.println(" ");
			 
			 if(langGenug==false)
			 {
				 System.out.println("Dein Passwort ist zu kurz!");
			 }else {
				 
			 }
			
			 if(einGro�==false)
			 {
				 System.out.println("Deinem Passwort fehlt mindestens ein Gro�buchstabe!");
			 }else {
				 
			 }

			 if(einKlein==false)
			 {
				 System.out.println("Deinem Passwort fehlt mindestens ein Kleinbuchstabe!");
			 }else {
				 
			 }

			 if(einSonder==false)
			 {
				 System.out.println("Deinem Passwort fehlt mindestens ein Sonderzeichen!");
			 }else {
				 
			 }
			 
			 if(eineZahl==false)
			 {
				 System.out.println("Deinem Passwort fehlt mindestens eine Zahl!");
			 }else {
				 
			 }
	}
}
