package All_Pragrams_30;

public class PalindromeString {
	public static void main(String ar[])
	{
//		String str="MADAM welcome";
//		String word[]=str.split(" ");
//		//System.out.println(str);
//		for(int i=word.length-1;i>=0;i--)
//		{
//			System.out.println(word[i]);
//		}
		String str="Madam ";
		String temp=str;
		char revString = 0;
		for(int i=str.length()-1;i>=0;i--)
			{
				 revString=str.charAt(i);
				System.out.println(revString);
			}
		String rev = String.valueOf(revString);
		String rev1 = Character.toString(revString);
		if(temp==rev1)
		{
			System.out.println("String is Palindrome");
		}
	}
}
