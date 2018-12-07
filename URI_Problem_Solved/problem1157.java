package unsumittedproblem4;

import java.util.Scanner;

public class problem1157 {

	public static void main(String[] args) {
		int a,i;
		Scanner input= new Scanner(System.in);
		a=input.nextInt();
		for(i=1;i<=a;i++)
		{
			if(a%i==0)
				System.out.printf("%d\n",i);
		}
		
		input.close();
	}

}
