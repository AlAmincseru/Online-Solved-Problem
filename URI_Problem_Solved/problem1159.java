package unsumittedproblem4;

import java.util.Scanner;

public class problem1159 {

	public static void main(String[] args) {
		int a,i,sum=0;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		do
		{
			a=in.nextInt();
			for(i=1;i<=5;)
			{
				
				if(a%2==0)
				{
					sum=sum+a;
					i++;
				}
				a++;
			}
		}while(a=0);
		System.out.printf("%d\n",sum);

	}

}
