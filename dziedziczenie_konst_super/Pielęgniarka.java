package dziedziczenie_konst_super;

public class Pielęgniarka extends Pracownik{
	private int nadgodziny;
	public Pielęgniarka(String imie, String nazwisko, double wypłata){
		super(imie,nazwisko,wypłata);
		nadgodziny=0;
	}
	public int getNadgodziny(){return nadgodziny;}
	public void setNadgodziny(int n){
		nadgodziny+=n;
	}
}
