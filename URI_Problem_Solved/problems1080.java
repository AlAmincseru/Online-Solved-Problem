//uncomplete.
package unsumittedproblem3;

import java.util.Scanner;

public class problems1080 {

	public static void main(String[] args) {
			int[] values = new int[100];
			int j,k;
			long i=-1089248;
			Scanner sc = new Scanner(System.in);
			for(j=0;j<10;j++)
			{
				values[j]=sc.nextInt();
			}
			for(k=0;k<10;k++)
			{
				if(values[k]>=i)
				{
					i=values[k];
				}
			}
			System.out.printf("%d\n",i)
			sc.close();
	}

}
