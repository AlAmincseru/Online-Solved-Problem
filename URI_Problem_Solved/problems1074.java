//complete.
package unsumittedproblem1;

import java.util.Scanner;

public class problems1074 {

	public static void main(String[] args) {
		int N;
		long  i;
		 long k;
		 Scanner variable = new Scanner(System.in);
		 N=variable.nextInt();
		 for(k=0;k<N;k++)
		 {
			 i=variable.nextLong();
			 if(i<0&&i%2==0)
				 System.out.println("\nEVEN NEGATIVE");
			 else if(i>0&&(i%2)!=0)
				 System.out.println("ODD POSITIVE");
			 else if(i>0&&i%2==0)
				 System.out.println("EVEN POSITIVE");
			 else if(i==0)
				 System.out.println("NULL");
			 else
				 System.out.println("ODD NEGATIVE");
		 }
		 variable.close();

	}

}

