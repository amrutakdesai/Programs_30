package All_Pragrams_30.Recurtion;

public class NaturalSum {
	int sum1=0;
	public int sum(int n)
	{
		if(n==1)
			return 1;
		else
		{
			sum1=sum1+sum(n-1);
		}
		return sum1;
	}
	
	public static void main(String ar[])
	{
		NaturalSum ns=new NaturalSum();
		ns.sum(4);
	}
}