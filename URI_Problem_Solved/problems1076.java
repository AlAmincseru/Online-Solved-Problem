package BeginnerProblems;

import java.util.Scanner;

public class problems1076 {

	public static void main(String[] args) {
		int i,N;
		Scanner variable1=new Scanner(System.in);
		N= variable1.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.printf("%d x %d = %d\n",i,N,(i*N));
		}
		variable1.close();

	}

}
