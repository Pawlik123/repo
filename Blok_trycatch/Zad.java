package Blok_trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		try
		{
			int liczba=in.nextInt();
		}
		catch(InputMismatchException b){
			System.out.println("Niepoprawna dana podaj liczbe ca³kowit¹");
		}
		finally{
			System.out.println("dobrze");
	}

}
}
