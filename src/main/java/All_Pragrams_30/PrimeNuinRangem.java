package All_Pragrams_30;

public class PrimeNuinRangem {
	public static void main(String ar[])
	{
		int arr[]= {20,45,3,7};
		for(int i=0;i<arr.length;i++)
		{
			int  j = 2;
			boolean flag=false;
			while (j <= arr[i] / 2) {
				// condition for nonprime number
				if (arr[i] % j == 0) {
					flag = true;
					break;
				}

				++j;
			}

			if (!flag)
				System.out.println(arr[i] + " is a prime number.");
			else
				System.out.println(arr[i] + " is not a prime number.");
		}
	}

}
