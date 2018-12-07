//complete.
package unsumittedproblem1;

import java.util.Scanner;

public class problems1072 {

	public static void main(String[] args) {
		int N,i;
		int count1=0,count2=0;
		int x;
		Scanner in = new Scanner(System.in);
		N=in.nextInt();
		for(i=1;i<=N;i++)
		{
			x=in.nextInt();
			if(x>=10 && x<=20)
				count1++;
			else
				count2++;
		}
		System.out.printf("%d in\n",count1);
		System.out.printf("%d out\n",count2);
		in.close();
	}

}
