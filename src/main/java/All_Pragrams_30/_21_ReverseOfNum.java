package All_Pragrams_30;

import java.util.Scanner;

public class _21_ReverseOfNum {

	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number->");
		int num=sc.nextInt();
		sc.close();

		int rem,rev=0;

		while(num!=0)
		{
			rem=num%10;//=3
			System.out.println("Reminder is->"+rem);
			System.out.println("------------------------------------");
		
			rev=rev*10+rem; //2)5*10+4=54,54*10+3=543
			System.out.println("Reverse Order->"+rev);
			System.out.println("------------------------------------");
			
			System.out.println("numberis->"+num);
			num=num/10;//1234/10=123
			System.out.println("after calculation number is->"+num);

		}
		System.out.println(rev);

	}
}
