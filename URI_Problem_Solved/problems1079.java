package BeginnerProblems;

import java.util.Scanner;

public class problems1079 {

	public static void main(String[] args) {
		int i,N;
		double a,b,c,wighted_average;
		Scanner alamin=new Scanner(System.in);
		N=alamin.nextInt();
		for(i=0;i<N;i++)
		{
			a=alamin.nextDouble();
			b=alamin.nextDouble();
			c=alamin.nextDouble();
			wighted_average=((a*2)+(b*3)+(c*5))/10;
			
			System.out.printf("%.1f\n",wighted_average);
		}
		alamin.close();


	}

}
