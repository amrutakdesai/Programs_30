package All_Pragrams_30;

import java.util.Scanner;

public class _23_Palindrome {
	public static void main(String at[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number->");
		int n=sc.nextInt();
		sc.close();
		int rem,rev=0;
		
		int num=n;
		
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);

		if(num==rev)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome:");
		}
	}
}
