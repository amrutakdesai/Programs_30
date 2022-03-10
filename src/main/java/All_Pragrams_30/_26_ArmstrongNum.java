package All_Pragrams_30;
import java.util.*;
public class _26_ArmstrongNum 
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		sc.close();
		int sum=0,rem;
		//int res1=0;
		int temp=num;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		System.out.println("sum->"+sum);

		if(sum==temp)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
		
	}
}
