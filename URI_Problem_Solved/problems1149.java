package unsumittedproblem2;

import java.util.Scanner;

public class problems1149 {

	public static void main(String[] args) {
		int i,a,count,sum=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		do
		{
			i=in.nextInt();
			for(count=1;count<=i;count++)
			{
				sum=sum+a;
				a++;
				
			}
		}while(i<=0);
		System.out.printf("%d\n",sum);
		in.close();

	}

}
