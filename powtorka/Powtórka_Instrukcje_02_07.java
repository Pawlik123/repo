package powtorka;

import java.util.Scanner;

public class Powtórka_Instrukcje_02_07 {
	public static void main(String[] args)
	{
		System.out.println("Wybierz wygran¹ 1 lub 2 lub 3");
		Scanner ela=new Scanner(System.in);
		int number=ela.nextInt();
		switch(number){
		case 1:
		System.out.println("Wygrany fiacik 500");
		break;
		case 2:
			System.out.println("Wygrany rower");
			break;
		case 3:
			System.out.println("Wygrana mikra");
			break;
			default:
			System.out.println("Wygrane wakacje");
	}
	}
}


