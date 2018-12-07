//complete.
package unsumittedproblem4;

import java.util.Scanner;

public class problem1158 {

	public static void main(String[] args) {
		int a,count,i,testcase,j;
		@SuppressWarnings("resource")
		Scanner t = new Scanner(System.in);
		testcase=t.nextInt();
		for(i=0;i<testcase;i++)
		{	
			int sum=0;
			a=t.nextInt();
			count=t.nextInt();
			for(j=0;j<count;)
			{
				if((a%2)!=0)
				{
					sum = sum+a;
					j++;
				}
				a++;
				
			}
			System.out.printf("%d\n",sum);
			
		}

	}
	
}
