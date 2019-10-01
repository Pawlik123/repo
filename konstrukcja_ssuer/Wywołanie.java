package konstrukcja_ssuer;

public class Wywo³anie {
	public static void main(String[] args){
	Pracownik ee=new Pracownik("Stanis³aw","Nowak",100);
	ee.getImie();
	ee.getNazwisko();
	ee.getWyp³ata();
	Lekarz ela=new Lekarz("Kazimierz","Pawlik",400);
	
	ela.setPremia(70);
	System.out.println(ela.getPremia());
	Pielegniarka ww=new Pielegniarka("Stanis³awa","Nowak",30);
	ww.getNadgodziny();
	ww.setNadgodziny(34);
	System.out.println(ww.getNadgodziny());
	
	}
}
