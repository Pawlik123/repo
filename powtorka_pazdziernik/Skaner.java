package powtorka_pazdziernik;

import java.util.Scanner;

public class Skaner {
	public static void main(String[] args){
		Scanner ela=new Scanner(System.in);
		System.out.println("Jak masz na imie");
		String name=ela.nextLine();
		System.out.println("Witaj "+ name);
	}

}
