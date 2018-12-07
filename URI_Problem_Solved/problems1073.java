//complete.
package unsumittedproblem1;

import java.util.Scanner;

public class problems1073 {
	
	public static void main(String[] args) {
		long i,j;
		int N;
		Scanner in = new Scanner(System.in);
		N=in.nextInt();
		for(i=1;i<=N;i++)
		{
			if(i%2==0) {
				j=(long) Math.pow(i, 2);
			System.out.printf("%d^2 = %d\n",i,j);
			}
		}
		
		in.close();

	}

}
