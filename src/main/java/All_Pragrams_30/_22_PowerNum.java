package All_Pragrams_30;

import java.util.Scanner;

public class _22_PowerNum {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		sc.close();
		int res=0;
		//int num=4;
		res=num*num;
		System.out.println("Power of->"+num+"^"+num+" "+res);
	}
}
