package dziedziczenie_konst_super;

public class Pracownik {
	private String imie;
	private String nazwisko;
	private double wyp�ata;
	public Pracownik(String imie, String nazwisko, double wyplata){
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.wyp�ata=wyp�ata;
	}
	String getImie()
	{
		return imie;
	}
	String getNazwisko()
	{
		return nazwisko;
	}
	double getWyp�ata()
	{
		return wyp�ata;
	}

}
