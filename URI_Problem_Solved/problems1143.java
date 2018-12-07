package unsumittedproblem2;

import java.util.Scanner;

public class problems1143 {

	public static void main(String[] args) {
		int a,b;
		long c;
		Scanner in = new Scanner(System.in);
		a=in.nextInt();
		for(int i=1;i<=a;i++)
		{
			b=(int) Math.pow(i, 2);
			c=(long) b*i;
			System.out.printf("%d %d %d\n",i,b,c);
			
		}
		in.close();
		
		

	}

}
