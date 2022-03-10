package All_Pragrams_30;

import java.util.Scanner;

public class CheckAlphabatOrNot {
	public static void main(String ar[])
	{
		int digit,spchar,alph;
		alph=digit=spchar=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabate");
		char ch=sc.next().charAt(0);
		sc.close();
		
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			System.out.println("Its alphabate-"+ch);
		}
		else
		{
			System.out.println("Its Not alphabate-"+ch);
		}
	}
	
}
//--------------------------------------------------------------------------------------------
//	int digit,spchar,alph,i;
//	alph=digit=spchar=0;
//	
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the alphabate");
//	//String str=sc.nextLine();
//	char str=
//	sc.close();
//	for(i=0;i<str.length();i++)
//	{
//		ch=str.charAt(i);
//		if(Character.isAlphabatic(ch))
//		{
//			System.out.println("Its alphabate-"+ch);
//		}
