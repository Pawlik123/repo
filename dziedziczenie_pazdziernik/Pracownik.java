package dziedziczenie_pazdziernik;

public class Pracownik {
	String imie;
	String nazwisko;
	int wyplata;
	public Pracownik(String i,String n,int w) {
	imie=i;
	nazwisko=n;
	wyplata=0;
	
	}
	public String getImie()
	{
		return imie;
	}
	public String getNazwisko()
	{
		return nazwisko;
	}
	public int getWyp³ata()
	{
		return wyplata;
	}
}
