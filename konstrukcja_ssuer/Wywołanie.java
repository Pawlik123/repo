package konstrukcja_ssuer;

public class Wywołanie {
	public static void main(String[] args){
	Pracownik ee=new Pracownik("Stanisław","Nowak",100);
	ee.getImie();
	ee.getNazwisko();
	ee.getWypłata();
	Lekarz ela=new Lekarz("Kazimierz","Pawlik",400);
	
	ela.setPremia(70);
	System.out.println(ela.getPremia());
	Pielegniarka ww=new Pielegniarka("Stanisława","Nowak",30);
	ww.getNadgodziny();
	ww.setNadgodziny(34);
	System.out.println(ww.getNadgodziny());
	
	}
}
