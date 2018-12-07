//submitted.
package BeginnerProblems;

import java.util.Scanner;

public class problems1075 {

	public static void main(String[] args) {
		int N,i;
		Scanner a = new Scanner(System.in);
		i=a.nextInt();
		//System.out.printf("%d\n",b);
		for(N=2;N<=10000;N=N+i)
		{
			System.out.printf("%d\n",N);
		}
		a.close();
	}

}
