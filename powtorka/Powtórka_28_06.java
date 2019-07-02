package powtorka;

import java.util.Scanner;

public class Powtórka_28_06 {
	public static void main(String[] args)
	{
	System.out.println("Witaj w pi¹tek");
	Scanner ela=new Scanner(System.in);
	String name=ela.nextLine();
	if (name>5)
	System.out.println("Twoje imie ma mniej ni¿ 5 liter");
	else if (name=5)
	System.out.println("Toje imiê ma 5 liter");
	if (name<5)
	System.out.println("Twoje imiê ma wiêcej ni¿ 5 liter");
	}
}