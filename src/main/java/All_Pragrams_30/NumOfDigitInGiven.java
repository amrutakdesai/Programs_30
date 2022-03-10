package All_Pragrams_30;

import java.util.Scanner;

public class NumOfDigitInGiven
{
	public static void main(String[] args) 
	{
		int a=0,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number->");
		num=sc.nextInt();
		sc.close();

		if(num<0)
		{
			num=num*-1;
		}
		else if(num==0)
		{
			num=1;
		}
		while(num>0)
		{
			num=num/10;
			a++;
		}
		System.out.println("digit in given number->"+a);
	}
}