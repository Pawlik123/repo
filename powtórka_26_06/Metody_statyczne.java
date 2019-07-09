package powtórka_26_06;

import java.util.Scanner;

public class Metody_statyczne {
	public static void main(String[] args)
	{
		System.out.println("Podaj liczbê 1");
		Scanner in=new Scanner(System.in);
		int age1=in.nextInt();
		System.out.println("Podaj liczbê 2");

		int age2=in.nextInt();
		int wynik=suma(age1,age2);
		System.out.println("Poka¿ sumê  " + wynik);
		int wynik2=ró¿nica(age1,age2);
		System.out.println("Poka¿ ró¿nicê "+ wynik2);
		int wynik3=mno¿enie(age1,age2);
		System.out.println("Poka¿ wynik z mno¿enia  "+ wynik3);
		metodd();
		metodd();
	}
public static int suma(int a, int c)
{
	return a+c;
}

public static int ró¿nica(int f, int g)
{
	return f-g;
}
public static int mno¿enie(int p, int s)
{
	return p*s;
}
public static void metodd()
{
	System.out.println("Witaj metodo");
}
}