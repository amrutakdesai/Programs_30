package All_Pragrams_30;

import java.util.Scanner;

public class _18_FibonacciSeries {
	public static void main(String ar[]) 
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The Number ->");
//		int num=sc.nextInt();
//		sc.close();
		
		int count=9;
		int n1=0,n2=1;
		System.out.println("........Fibonacci Series-........");
		System.out.print(n1+" "+n2+" ");

		int res;
		for(int i=0;i<count;i++)
		{
			res=n1+n2;
			System.out.print(" "+res+" ");
			n1=n2;
			n2=res;

		}
	}

}
