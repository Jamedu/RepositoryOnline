import java.util.ArrayList;
import java.util.List;

public class EinMalEins {
	
	static List<String> monate=new ArrayList<String>();
	static List<Integer> monatstage=new ArrayList<Integer>();

	static int tag=12;
	static int monat=3;
	static int jahr=2019;
	static int tageSeit1900; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//einMalEins() ;
		wochentage();
	}

		public static void einMalEins() {
			for(int i=1; i<=10; i++) {
				for(int j=1; j<=10; j++) {
					System.out.print(i*j + "\t");	
				}
				System.out.println("");
			}
		}
		
		public static void wochentage() {

			int zwischenergebnis= (jahr - 1900)/4;
			
			monatstage.add(31);
			monatstage.add(28);
			monatstage.add(31);
			monatstage.add(30);
			monatstage.add(31);
			monatstage.add(30);
			monatstage.add(31);
			monatstage.add(31);
			monatstage.add(33);
			monatstage.add(31);
			monatstage.add(30);
			monatstage.add(31);
			
			tageSeit1900=( zwischenergebnis + (jahr - 1900)*365)+(monatstage.get(monat-3)+tag);
			System.out.print(tageSeit1900);
		}
}
