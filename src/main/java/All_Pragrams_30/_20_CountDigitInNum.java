package All_Pragrams_30;

import java.util.Scanner;

public class _20_CountDigitInNum {

	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number->");
		int num=sc.nextInt();
		sc.close();
		int count=0;
		while(num!=0)
		{
			num=num/10;
			++count;
		}
		System.out.println("Number of digit in integer:->"+count);
	}
}
