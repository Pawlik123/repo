package Zadania_18_11;

import java.util.Scanner;

public class Metody_stat{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int wynik=suma1(a,b);
	System.out.println(wynik);
	}
	public static int suma1(int a, int b)
	{
	int cc=a+b;
	return cc;
	}
	public int suma2(int c, int d)
	{
		int aa=c+d;
		return aa;
	}
}
	

	
