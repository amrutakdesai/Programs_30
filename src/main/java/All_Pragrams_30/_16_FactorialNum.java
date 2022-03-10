package All_Pragrams_30;

import java.util.Scanner;

public class _16_FactorialNum {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for find factor->");
		int num=sc.nextInt();
		sc.close();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of->"+num+"!="+fact);
	}
	
}
