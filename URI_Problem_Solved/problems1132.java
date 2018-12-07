//complete.
package unsumittedproblem3;

import java.util.Scanner;

public class problems1132 {

	public static void main(String[] args) {
		long a,b,i,sum=0;
		Scanner input = new Scanner(System.in);
		a=input.nextLong();
		b=input.nextLong();
		if(a>b)
		{
			for(i=b;i<=a;i++)
			{
				if((i%13)!=0)
				sum=sum+i;
				
			}
			System.out.printf("%d",sum)
		}
		else
		{
			for(i=a;i<=b;i++)
			{
				if((i%13)!=0);
					sum=sum+i;
			}
		}
		System.out.printf("%d",sum);
		input.close();
	}
	
}
