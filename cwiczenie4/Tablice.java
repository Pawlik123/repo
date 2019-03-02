package cwiczenie4;

import java.util.Scanner;

public class Tablice {
	public static void main(String[] args)
	{
	String[] tab=new String[5];
	Scanner odczyt=new Scanner(System.in);
	for(int i=0; i<5; i++)
	{
		tab[i]=odczyt.nextLine();
	}
		for (int i=0; i<5; i++)
		{
			System.out.println("Czesc "+ tab[i]);
		}
	
}
	}
	


