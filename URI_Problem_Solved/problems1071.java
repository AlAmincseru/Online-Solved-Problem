//complete
package unsumittedproblem1;

import java.util.Scanner;

public class problems1071 {

	public static void main(String[] args) {
		int a,b,i;
		int sum=0;
		Scanner in= new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		if(a>=b)
		{
			for(i=b+1;i<=a-1;i++)
			{
				if((i%2)!=0)
				{
					sum=sum+i;	
				}
			}
			System.out.printf("%d\n",sum);
		}
		else
		{
			for(i=a+1;i<b-1;i++)
			{
				if((i%2)!=0)
				{
					sum=sum+i;	
				}
			}
			System.out.printf("%d\n",sum);
		}
		in.close();

	}

}
