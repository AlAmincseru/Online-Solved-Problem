package BeginnerProblems;

import java.util.Scanner;

public class problems1067 {

	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		for(int i=1;i<=a;i=i+2)
		{
			if(i==a && (a%2)!=0)
			{
				System.out.printf("%d\n",a);
			}
			else
				System.out.printf("%d\n",i);
		}
		in.close();

	}

}
