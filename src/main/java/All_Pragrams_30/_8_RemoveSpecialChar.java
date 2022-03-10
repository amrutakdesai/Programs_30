package All_Pragrams_30;

public class _8_RemoveSpecialChar {

	public static void main(String ar[])
	{
		String str="India@Is@My@Country";
		String ReplaceString=str.replace("@", " ");
		System.out.println(ReplaceString);
	
		System.out.println("--------------------------");
		
		String str1="Ind$ia";
		String ReplaceString1=str1.replace("$", "");
		System.out.println(ReplaceString1);
		
	}
}
