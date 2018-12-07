//complete.
package unsumittedproblem1;

import java.util.Scanner;

public class problems1142 {

	public static void main(String[] args) {
		int i,j,n,k=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1+k;j<=3+k;j++)
			{
				System.out.printf("%d ",j);
			}
			System.out.println("PUM");
			k=j;
		}
		in.close();

	}

}
