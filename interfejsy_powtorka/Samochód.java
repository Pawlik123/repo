package interfejsy_powtorka;

public class Samochód implements Pojazd {
	public void jazda(int v)
	{
		System.out.println("Jedziesz z predkoscia +v+ km");
	}
	public void stop()
	{
		System.out.println("stop");
		
	}
	
	public void drift(int r)
	{
		System.out.println("Drift");
	}

}
