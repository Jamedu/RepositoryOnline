
public class Jakobs_erste_Klasse {

static String beliebigerSting ;
static int eineZahl ;
static int nochEineZahl ;
static int ergebnis ;
static float eineZahlMitKomma;
static int ungradeZahl ;
static int u ;
static int i ;


public static void main(String[] args) {
    // TODO Auto-generated method stub
	//rechenspiele();
	//ungradeZahlen ();
	//fibonacciFolge();
}

public static void rechenspiele ()
{
	eineZahl = 5; nochEineZahl = 4;
	ergebnis = eineZahl * nochEineZahl ;
	eineZahlMitKomma = 20 ;
	
	if(ergebnis > eineZahlMitKomma) 
	{
		System.out.print(ergebnis-eineZahlMitKomma);
		}else {
		System.out.print("Das Ergebins ist zu klein");
		}		
}

	public static void ungradeZahlen ()
	{
		for(int i=1 ; i<26 ; i=i+2)
		{
			System.out.println(i);
		}
	}
	
	public static void fibonacciFolge ()
	{i=0; u=1;
	while(i-u<500) {i= u+i
		{System.out.println(i);
		}
	u=u+i
			
	}
	}
	

}