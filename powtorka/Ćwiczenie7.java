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
		int tf3ab[]=new int[10];
		for (int a=0; a<10; a++)
		{
		tf3ab[a]=a+1;
		}
		for(int a: tf3ab)
		{
			System.out.println(a);
		}
		
	}
}
