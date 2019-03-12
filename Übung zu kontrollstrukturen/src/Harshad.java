
public class Harshad {
     
    public static void main(String[] args) {
         
        for (int i = 1; i <= 100; i++)
            if((i % Quersumme(i) == 0))
                System.out.println(i);
    }
 
    private static int Quersumme(int zahl)
    {
        if (zahl <= 9) return zahl;
        return zahl%10 + Quersumme(zahl/10);
    }
     //Dieses Programm gibt alle Harshad Zahlen zwischen 1 und 100 aus
}