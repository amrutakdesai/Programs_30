package All_Pragrams_30.Recurtion;

public class Factorial {
	//	public static void main(String ar[])
	//	{
	//		Factorial f=new Factorial();
	//		int res=f.fact(5);
	//		System.out.println();
	//	}
	//	public int fact(int n)
	//	{	int fact=1;
	//		for(int i=0;i<=n;i++)
	//		{
	//			while(n!=0)
	//			{
	//				fact=fact*i;
	//			}
	//		}
	//		return fact;
	//	}

	static int factorial(int n){      
		if (n == 1)      
			return 1;      
		else      
			return(n * factorial(n-1));      
	}      

	public static void main(String[] args) {  
		System.out.println("Factorial of 5 is: "+factorial(5));  
	}  
}  
