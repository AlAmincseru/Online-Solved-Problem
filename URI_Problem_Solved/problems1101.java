package unsumittedproblem3;

import java.util.Scanner;

public class problems1101 {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner in = new Scanner(System.in)
		do
		{
			int sum=0;
			a=in.nextInt();
			b=in.nextInt();
			if(a>=b)
			{
				for(int i=b;i<=a;i++)
				{
					sum=sum+i;
					System.out.printf("%d ",i);
				}
				System.out.printf("sum=%d\n",sum);
			}
			else
			{
				for(int i=a;i<=b;i++)
				{
					sum=sum+i;
					System.out.printf("%d ",i);
				}
				System.out.printf("sum=%d\n",sum);
			}
				
		}while((a!=0)&&(b!=0)||a<0||b<0);
	}

}
