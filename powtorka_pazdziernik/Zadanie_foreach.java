package powtorka_pazdziernik;

public class Zadanie_foreach {
	public static void main(String[] args){
		String[] imie={"Marcin","Kasia", "Andrzej"};
		for (int i=0; i<imie.length; i++){
			String name=imie[i];
			System.out.println(name);
		}
		for( String x : imie)
		{
		System.out.println(x);
	}

}
}
