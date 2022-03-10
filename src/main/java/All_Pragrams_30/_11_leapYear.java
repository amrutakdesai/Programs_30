package All_Pragrams_30;

import java.util.Scanner;

public class _11_leapYear {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year->");
		int year=sc.nextInt();
		sc.close();
		if(year%4==0)
		{
			System.out.println("leap year->"+year);
		}
		else 
		{
			System.out.println("Not leap year->"+year);
		}
		
	}
}
