package dziedziczenie_konst_super;

public class Pracownik {
	private String imie;
	private String nazwisko;
	private double wyp³ata;
	public Pracownik(String imie, String nazwisko, double wyplata){
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.wyp³ata=wyp³ata;
	}
	String getImie()
	{
		return imie;
	}
	String getNazwisko()
	{
		return nazwisko;
	}
	double getWyp³ata()
	{
		return wyp³ata;
	}

}
