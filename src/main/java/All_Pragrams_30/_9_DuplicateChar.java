package All_Pragrams_30;

public class _9_DuplicateChar {
	public static void main(String ar[])
	{
		String str="india is hindustan";
		char[] arr=str.toCharArray();
		int i,j;
		System.out.println("The string is:" + str);
	    System.out.print("Duplicate Characters in above string are: ");
	  
		for( i=0;i<str.length();i++)
		{
			for(j=i+1;j<str.length();j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[j]+" ");
					break;
				}
			}
		}
	}

}
