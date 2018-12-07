//complete.
package unsumittedproblem1;

import java.util.Scanner;

public class problems1113 {

	public static void main(String[] args) {
		
		int i,j;
		Scanner in= new Scanner(System.in);	
		do 
		{
			
			i=in.nextInt();
			j=in.nextInt();
			
			if(i>j)
				System.out.println("Decrescente\n");
			if(i<j)
				System.out.println("Crescente\n");
			
		}
		while(i!=j);
			in.close();
	}
}
