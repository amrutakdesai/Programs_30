//4.Quotient & reminder finder
package All_Pragrams_30;
import java.util.*;

public class _4_QuestiontReminder {
	public static void main(String ar[])
	{
		System.out.println("Enter the two number->");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();

		int que=0,rem=0;
		que=a/b;
		System.out.println("Quotient is->"+que);
		
		rem=a%b;
		System.out.println("Reminder is->"+rem);

	}
}
