package All_Pragrams_30;

import java.util.Scanner;

public class CoumtNumberOfWord {

	public static void main(String[] args) 
	{
		int count=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String->");
		String str=sc.nextLine();
		sc.close();
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Number Of Word in Given String-> "+count);
	}
}
