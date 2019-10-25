package dziedziczenie_pazdziernik;

class Pielegniarka extends Pracownik {
	int nadgodziny;
	public Pielegniarka(String i, String n, int w) {
		super(i, n, w);
	}
public void setnadgodziny(int a)
{
	nadgodziny = a;
}
public int getnadgodziny()
{
	return nadgodziny;
}
}
