package unsumittedproblem3;

import java.util.Scanner;

public class problems1151 {

	public static long main(String[] args) {
		int i,j;
		long a;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		for(i=0;i<n;i++)
		{
			a = fib(i);
			System.out.printf("%d ",a);
		}
		
		long fib(long n) 
		{
			if(n==0||n==1)
				return n;
			else
				return fib(n-1)+fib(n-2);
			
		}
	}

	private static int fib(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
