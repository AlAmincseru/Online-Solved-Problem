package unsumittedproblem2;

import java.util.Scanner;

public class problems1144 {

	public static void main(String[] args) {
		int a,i,j;
		long c,b;
		Scanner in = new Scanner(System.in);
		a=in.nextInt();
		for(i=1;i<=a;i++)
		{
			for(j=0;j<2;j++)
			{
				b=(long) Math.pow(i, 2);
				c=(long) b*i;
				System.out.printf("%d %d %d\n",i,b+j,c+j);
			}
		}
		in.close();

	}

}
