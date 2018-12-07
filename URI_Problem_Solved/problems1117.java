
//complete.
package unsumittedproblem3;

import java.util.Scanner;

public class problems1117 {

	public static void main(String[] args) {
		double a,b=0.0;
		int count=0;
		Scanner in= new Scanner(System.in);
		do
		{
			
			a=in.nextDouble();
			System.out.println("nota invalida\n");
			
			if(a>=0&&a<=10) 
			{
				count++;
				b=b+a;
				if(count==2)
					System.out.printf("media = %.2f\n",b/count)
			}
			
		}while(count!=2);
			
		in.close();
	}

}
