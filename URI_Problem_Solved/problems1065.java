//complete
package unsumittedproblem1;

import java.util.Scanner;

public class problems1065 {

	public static void main(String[] args) {
		int[] data = new int[5];
		Scanner in=new Scanner(System.in);
		int i,count=0;
		for(i=0;i<5;i++)
		{
			data[i]=in.nextInt();
			if(data[i]%2==0)
				count++;
		}
		System.out.printf("%d valores pares\n",count);

		in.close();
	}

}
