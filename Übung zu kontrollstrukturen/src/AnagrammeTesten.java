	import java.util.ArrayList;

public class AnagrammeTesten {

	  public static void main(String args[])
	  {
	      String Wort1 = "halloo";
	      Wort1 = (Wort1.toLowerCase()).trim();
	      char[] Wort1Arr = Wort1.toCharArray();

	      String Wort2 = "lahol";
	      Wort2 = (Wort2.toLowerCase()).trim();
	      ArrayList<Character> Wort2ArrList = convertStringToArraylist(Wort2);

	      if (Wort1.length() != Wort2.length()) 
	      {
	          System.out.print("Diese Wörter sind keine Anagramme, sie sind noch nicht mal gleich lang!");
	      } 
	      else 
	      {
	          boolean stimmtUeberein = true;
	          for (int i=0; i<Wort1Arr.length; i++)
	          {  
	              for(int j = 0; j < Wort2ArrList.size(); j++) 
	              {
	                  if(Wort1Arr[i] == Wort2ArrList.get(j))
	                  {
	                      stimmtUeberein = true;
	                      Wort2ArrList.remove(j);
	                  }
	              }
	              if(stimmtUeberein == false)
	              {
	                  System.out.print("Diese Wörter sind keine Anagramme.");
	                  return;
	              } 
	          }
	          System.out.printf("%s is ein Anagram von %s", Wort1, Wort2);
	      }
	  }

	  public static ArrayList<Character> convertStringToArraylist(String str) {
	      ArrayList<Character> charList = new ArrayList<Character>(); 
	      for(int i = 0; i<str.length();i++){
	          charList.add(str.charAt(i));
	      }
	      return charList;
	  }
	  
	}