package cwiczenie3;

import java.util.Scanner;

public class Cwiczenie3 {
	public static void main(String[] args)
	{
		System.out.println("Podaj liczb� A");
		Scanner in=new Scanner(System.in);
		int liczba=in.nextInt();
		System.out.println ("Podaj liczb� B");
		int liczba2=in.nextInt();
		int suma = dodaj(liczba,liczba2);
		System.out.println("Suma dw�ch liczb to " + suma);
		int roznica=odejmij(liczba,liczba2);
		System.out.println("Roznica liczb to " +roznica);
		int iloczyn=mnozenie(liczba,liczba2);
		System.out.println("Iloczyn dw�ch liczb to " + iloczyn);
		double iloraz=dzielenie(liczba,liczba2);
		System.out.println("Iloraz dw�ch liczb to " + iloraz);
	}
	public static int dodaj(int a, int b)
	{
		return a+b;
	}
	public static int odejmij(int a, int b)
	{
		return a-b;
	}
	public static int mnozenie(int a, int b)
	{
		return a*b;
	}
	public static double dzielenie(int a, int b)
	{
		return a/b;
	}
}
