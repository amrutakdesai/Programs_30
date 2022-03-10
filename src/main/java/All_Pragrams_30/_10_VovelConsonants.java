package All_Pragrams_30;

import java.util.Scanner;

public class _10_VovelConsonants 
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the charecter->");
		char ch=sc.next().charAt(0);

		//char ch='a';
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("its Vowel");
		}
		else
		{
			System.out.println("its Consonants");

		}
	}

}
