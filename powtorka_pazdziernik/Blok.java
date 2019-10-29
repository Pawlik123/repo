package powtorka_pazdziernik;

import java.util.Scanner;

public class Blok {
	public static void main(String[] args){
		int tab[]={1,2,3,4,5};
		Scanner odczyt=new Scanner(System.in);
		int index=-1;
		System.out.println("Podaj indeks który ma siê pojawiæ");
		index=odczyt.nextInt();
		if(index>=0&&index<tab.length)
		System.out.println(tab[index]);
		else 
			System.out.println("Niepoprawna wartoœæ,rozmiar tablicy to "+ tab.length);
	}

}
