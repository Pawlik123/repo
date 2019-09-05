package pow_wrzesien;

import java.util.Scanner;

public class Sposób_2 {
	public static void main(String[] args)
	{
		System.out.println("Wybierz bramke 1, 2 lub 3");
		Scanner ela=new Scanner(System.in);
		int number=ela.nextInt();
		switch(number){
		case 1:
			System.out.println("Zonk");
			break;
		case 2:
			System.out.println("Fiat 126 p");
			break;
		case 3:
			System.out.println("Zestaw stereo");
			break;
			default:
			System.out.println("Niepoprawna bramka");
	}
	}
}
