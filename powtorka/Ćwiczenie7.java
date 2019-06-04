package powtorka;

import java.util.Scanner;

public class Æwiczenie7 {
	public static void main(String[] args)
	{
		System.out.println("Jak masz na imie");
		Scanner in=new Scanner(System.in);
		String name=in.nextLine();
		System.out.println("Twoje imie to  " + name);	
		System.out.println("Twoje imie ma liter"+ name.length());
		if (name.length()<5)
		{
			System.out.println("Twoje imie ma mniej ni¿ 5 liter"+ name.length());
		}
		else if(name.length()==5)
		{
			System.out.println("Twoje imie ma 5 liter"+name.length());
		}
		else 
		{
			System.out.println("Twoje imie ma mniej ni¿ liter"+name.length());
		}
	}
	

}
