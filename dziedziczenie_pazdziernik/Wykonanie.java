package dziedziczenie_pazdziernik;

public class Wykonanie {
	public static void main (String[] args)
	{
		Lekarz ee=new Lekarz("Ela","Pawlik", 0);
		System.out.println(ee.getImie());
		System.out.println(ee.getNazwisko());
		System.out.println(ee.getWyp³ata());
		ee.setpremia(1999);
		System.out.println(ee.getpremia());
		Pielegniarka gg=new Pielegniarka("Krzysztof", "Pitu³a", 90);
		gg.setnadgodziny(1290);
		System.out.println(gg.getnadgodziny());
		
	}

}
