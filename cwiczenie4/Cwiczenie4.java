package cwiczenie4;

import java.util.Scanner;

public class Cwiczenie4 {
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	System.out.println("Podaj swoje imiê");
	String name=in.nextLine();	
	System.out.println("Ile masz lat");
	int age=in.nextInt();
	System.out.println("Witaj u¿ytkowniku " + name+ " W przysz³ym oku bêdziesz mieæ " + (age+1)+ " lat");
}
}

