package dziedziczenie;

public class Wykonanie{
	public static void main(String[] args)
	{
		Podstawy ee=new Podstawy();
		System.out.println(ee.suma(3,5));
		Rozszerzenie qq=new Rozszerzenie();
		System.out.println(qq.iloczyn(5,8));
		System.out.println(qq.suma(3, 5));
	}
}
