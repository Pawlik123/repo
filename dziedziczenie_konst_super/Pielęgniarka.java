package dziedziczenie_konst_super;

public class Piel�gniarka extends Pracownik{
	private int nadgodziny;
	public Piel�gniarka(String imie, String nazwisko, double wyp�ata){
		super(imie,nazwisko,wyp�ata);
		nadgodziny=0;
	}
	public int getNadgodziny(){return nadgodziny;}
	public void setNadgodziny(int n){
		nadgodziny+=n;
	}
}
