package Zadanie_listopad;

import java.util.Scanner;

public class Zadanie {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Podaj liczbê 1");
		int a=in.nextInt();
		System.out.println("Podaj liczbê 2");
		int b=in.nextInt();
		int suma = 0;
		for (int c=0; a<=b ; c++)
		{
			suma=suma+a;
			a++;
		}
	
			System.out.println("Suma ci¹gu liczb"+suma);
		}
		}
		
	

