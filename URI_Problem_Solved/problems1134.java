//complete.
package unsumittedproblem1;

import java.util.Scanner;

public class problems1134 {

	public static void main(String[] args) {
		int x,count1=0,count2=0,count3=0;
		Scanner in = new Scanner(System.in);
		System.out.println("MUITO OBRIGADO\n");
		do
		{
			
			x=in.nextInt();
			if(x==1)
				count1++;
			else if(x==2)
				count2++;
			else if(x==3)
				count3++;
		}while(x!=4);
		System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d\n",count1,count2,count3);
		in.close();

	}

}
