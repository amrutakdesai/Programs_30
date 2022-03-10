package All_Pragrams_30;

import java.util.Scanner;

public class _17_Multiplication {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number Multiplication Table->");
		int num=sc.nextInt();
		sc.close();
		int mult=0;
		for(int i=1;i<=10;i++)
		{
			mult=num*i;
			System.out.println("\t|"+num+"|*|"+i+"| = |"+mult+"|");
		}
		
	}
}
