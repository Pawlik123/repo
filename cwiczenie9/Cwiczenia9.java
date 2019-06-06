package cwiczenie9;

import java.util.Scanner;

public class Cwiczenia9 {
	public static void main(String[] args)
	{
		System.out.println("Podaj liczbe");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int taaabb[]=new int[n];
		System.out.println(n);
		for (int v=0; v<n; v++)
		{
			if (v>3)
			{
				taaabb[v]=2;
			}
			else if (v==3)
			{
				taaabb[v]=3;
			}
			else 
			{
				taaabb[v]=1;	
			}
		}
		for (int f: taaabb)
		{
			System.out.println(f);
		}
		
	}
	}
