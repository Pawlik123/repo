package konstrukcja_ssuer;

public class Wywo�anie {
	public static void main(String[] args){
	Pracownik ee=new Pracownik("Stanis�aw","Nowak",100);
	ee.getImie();
	ee.getNazwisko();
	ee.getWyp�ata();
	Lekarz ela=new Lekarz("Kazimierz","Pawlik",400);
	
	ela.setPremia(70);
	System.out.println(ela.getPremia());
	Pielegniarka ww=new Pielegniarka("Stanis�awa","Nowak",30);
	ww.getNadgodziny();
	ww.setNadgodziny(34);
	System.out.println(ww.getNadgodziny());
	
	}
}
