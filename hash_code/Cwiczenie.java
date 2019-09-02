package hash_code;

public class Cwiczenie {
	public static void main(String[] args){
		Product prod1=new Product("Czekolada", 2.99);
		Product prod2=new Product("Czekolada", 2.99);
		System.out.println(prod1.equals(prod2));
		System.out.println(prod1.hashcode());
		System.out.println(prod2.hashcode());
	}
}
