package konstrukcja_ssuer;

public class Pielegniarka extends Pracownik{
	private int nadgodziny;
	public Pielegniarka(String imie, String nazwisko,double wyp�ata){
		super(imie,nazwisko,wyp�ata);
		nadgodziny=0;
	}
	public int getNadgodziny()
	{
		return nadgodziny;
	}
		public void setNadgodziny(int n)
		{
			nadgodziny +=n;
	}

}
