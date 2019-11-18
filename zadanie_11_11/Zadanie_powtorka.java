package zadanie_11_11;

import java.util.Scanner;

public class Zadanie_powtorka {
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		String[] name=new String[5];
		for(int a=0; a<5; a++)
		{
			name[a]=in.nextLine();
		}
			for(int a=0; a<5; a++)
			
		{
			System.out.println("Imiona to "+ name[a]);	
		}
	}
}


