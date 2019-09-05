package pow_wrzesien;

import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args)
	{
		System.out.println("Wybierz bramke 1, 2 lub 3");
		Scanner ela=new Scanner(System.in);
		int number=ela.nextInt();
		if(number==1){
			System.out.println("Zonk");
		}
			else if
			(number==2){
				System.out.println("Wygrana");
			}
			else if(number==3){
				System.out.println("Zestaw stereo");
			}
			else{
				System.out.println("Niepoprawna bramka");
			}
		}
}


