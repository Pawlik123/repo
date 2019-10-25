package dziedziczenie_pazdziernik;

public class Lekarz extends Pracownik {
	int premia;
	public Lekarz(String i, String n, int w) {
		super(i, n, w);
	}

	public void setpremia(int f)
	{
		premia=f;
	}
	public int getpremia()
	{
		return premia;
	}
	
}
