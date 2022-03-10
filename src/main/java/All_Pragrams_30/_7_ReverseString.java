//7. Reverse a string
package All_Pragrams_30;

public class _7_ReverseString {
	public static void main(String ar[])
	{
		String str="INDIA";
		System.out.println(str.length());
		System.out.println("Original String->"+str);
		System.out.print("reverse String is->");
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}
