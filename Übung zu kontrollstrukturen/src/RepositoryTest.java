
public class RepositoryTest {
	
	static int variable=4;
	static int andereZahl;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lustigeMethode();
		
	}
	public static void lustigeMethode() 
	{
		if(variable==4) 
		{
			 andereZahl= (variable+3) ;
		}
		
		System.out.print(andereZahl);
	}
}
