package cwiczenie8;

import java.util.Scanner;

public class Cwiczenie8 {
	public static void main(String []args)
	{
		String tabnnn[]=new String[2];
		Scanner in=new Scanner(System.in);
		System.out.println("Podaj imie");
		String name=in.nextLine();
		System.out.println("Podaj nazwisko");
		String name2=in.nextLine();
		tabnnn[0]=name;
		tabnnn[1]=name2;
		for (String g:tabnnn)
		{
			System.out.println(g);
		}
		System.out.println("Twoje imie ma liter "+name.length() );
		int a=name.length();
		System.out.println("Twoje nazwisko ma liter "+ name2.length());
		int b=name2.length();
		if (a>b)
		{
			System.out.println("Imi� jest wi�ksze od nazwiska");
		}
		else if (a<b)
		{
			System.out.println("Imi� jest mniejsze o nazwiska");	
		}
		else 
		{
			System.out.println("Imi� jest r�wne nazwisku");
		}
		
	}

}
