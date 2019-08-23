package dziedziczenie_konst_super;

public class Lekarz extends Pracownik {
	private double premia;
	public Lekarz (String imie,String nazwisko, double wyp³ata){
	super(imie,nazwisko,wyp³ata);
	premia=0;
	}
	public double getPremia()
	{
		return premia;
	}
	public void setPremia(double d)
	{
		premia=d;
	}

}
