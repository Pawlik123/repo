package powtorka;

import java.util.Scanner;

public class Zadanie_case {
	public static void main (String[] args)
	{
		System.out.println("Podaj nr miesi¹ca");
		Scanner in=new Scanner(System.in);
		int nr =in.nextInt();
		switch(nr){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		System.out.println("Ten mc ma 31 dni");
//		break;
		case 2:
		System.out.println("Ten miesi¹c ma 28 dni");
	//	break;
		default:
		System.out.println("Ten miesi¹c ma 30 dni");

		}
	}
}
