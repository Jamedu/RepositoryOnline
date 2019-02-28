
public class Anagram {
			static char[] charArray1;
			static char[] charArray2;
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			zuAnagram1Array("tset");
			zuAnagram2Array("test");
			anagramme();
		}

		public static void zuAnagram1Array (String test)
		{
			System.out.println(test);
				charArray1 = test.toCharArray();
			
		}
	
		public static void zuAnagram2Array (String test)
		{
			System.out.println(test);
				charArray2 = test.toCharArray();
		}
		
		public static void anagramme ()
		{
			for (int i=0; i < charArray1.length; i++)
			{
				for (int j=0; j < charArray2.length; j++)
				{
				if(i==j) 
					{
					System.out.println(charArray1[i]+ " Buchstabeist vorhanden");
					}else {
						System.out.println(charArray1[i]+ " Buchstabe ist nicht vorhanden");
					}
				}
			}
		}
		

}
