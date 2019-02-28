package cwiczenie3;

import java.util.Scanner;

public class Cwiczenie3 {
	public static void main(String[] args)
	{
		System.out.println("Podaj liczbê A");
		Scanner in=new Scanner(System.in);
		int liczba=in.nextInt();
		System.out.println ("Podaj liczbê B");
		int liczba2=in.nextInt();
		int suma = dodaj(liczba,liczba2);
		System.out.println("Suma dwóch liczb to " + suma);
		int roznica=odejmij(liczba,liczba2);
		System.out.println("Roznica liczb to " +roznica);
	}
	public static int dodaj(int a, int b)
	{
		return a+b;
	}
	public static int odejmij(int a, int b)
	{
		return a-b;
	}
}
