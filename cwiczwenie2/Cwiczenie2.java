package cwiczwenie2;

import java.util.Scanner;

public class Cwiczenie2 {
	public static void main(String[] args)
	{
		System.out.println("Podaj liczbê A");
		Scanner in=new Scanner(System.in);
		int liczba=in.nextInt();
		for (int a=liczba; a>0; a--)
		{
			System.out.print("  " + a);
		}
		System.out.println("\n BUM");
	}
	
	}


