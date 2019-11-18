package zadanie_11_11;

public class Przyk³ad_2 {
	public static void main(String[] args)
	{
		int[] abb=new int[10];
		for(int b=0;b<abb.length; b++)
		{
			abb[b]=b+1;
		}
		for(int x: abb)
		{
			System.out.println(x);
		}
	}

}
