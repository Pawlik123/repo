package zadanie_11_11;

public class Zadanie {
	public static void main(String[] args)
	{
		int[] bla = tablica(8765);
		for(int f: bla){
			System.out.println(f);
		}
			
	}
	public static int[] tablica(int a)	
	{
		int c=0;
		
		for(int b=0; b<=a; b++)
		{
			if(b%2==0)
			{
				c++;
			}
		}
		int[] aaa=new int[c];
		int g=0;
		for(int b=0; b<=a; b++)
		{
			if(b%2==0)
			{
				aaa[g]=b;
				g++;
			}
	
		}
		return aaa;
}
}
