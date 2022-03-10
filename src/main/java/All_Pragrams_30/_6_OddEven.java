//6. Odd & even number check
package All_Pragrams_30;

import java.util.Scanner;

public class _6_OddEven {
	public static void main(String ar[])
	{
		System.out.println("Enter the number->");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.close();
		if(a%2==0)
		{
			System.out.println("Number is Even->"+a);
		}
		else if(a%2==1)
		{
			System.out.println("Number is Odd->"+a);
		}
		else
		{
			System.out.println("Number is zero;");
		}
	}
}
