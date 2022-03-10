package All_Pragrams_30;

import java.util.Scanner;

public class _13_Positive_negative {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number->");
		int num=sc.nextInt();
		sc.close();
		if(num>0)
		{
			System.out.println("Number is Positive;");
		}
		else if(num<0)
		{
			System.out.println("Number is Negative;");
		}
		else
		{
			System.out.println("Number is Zero;");	
		}
	}
}
