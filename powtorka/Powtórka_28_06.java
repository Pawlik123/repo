package powtorka;

import java.util.Scanner;

public class Powt�rka_28_06 {
	public static void main(String[] args)
	{
	System.out.println("Witaj w pi�tek");
	Scanner ela=new Scanner(System.in);
	String name=ela.nextLine();
	if (name>5)
	System.out.println("Twoje imie ma mniej ni� 5 liter");
	else if (name=5)
	System.out.println("Toje imi� ma 5 liter");
	if (name<5)
	System.out.println("Twoje imi� ma wi�cej ni� 5 liter");
	}
}