package Blok_trycatch;

import java.util.Scanner;

public class Zadanie {
public static void main (String[] args){
	int tab[]={1,2,3,4,5};
	Scanner zadanie=new Scanner(System.in);
	int index=-1;
	System.out.println("Podaj indeks który chcesz zobaczyæ:");
	index=zadanie.nextInt();
	System.out.println(tab[index]);
}
}
