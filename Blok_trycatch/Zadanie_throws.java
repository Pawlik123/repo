package Blok_trycatch;

import java.util.Scanner;

public class Zadanie_throws {
	public static void main(String[] args)throws ArithmeticException{
		int x=10;
		Scanner in=new Scanner(System.in);
		System.out.println("Podaj liczbê");
		int y=in.nextInt();
		if(y==0)throw new ArithmeticException("Nie mo¿na dzieliæ przez 0");
		else
		{
			System.out.println(x/(double)y);
		}
	}

}
