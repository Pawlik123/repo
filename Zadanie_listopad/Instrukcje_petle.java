package Zadanie_listopad;

import java.util.Scanner;

public class Instrukcje_petle {
	public static void main(String[] args)
	{
		System.out.println("Podaj liczby nieparzyste");
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		for(int a=0; a<=x; a=a+1) {
			if (a%2!=0){
				System.out.println( a);
			}
		}
		}
}

