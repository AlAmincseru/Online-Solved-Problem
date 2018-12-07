package BeginnerProblems;

import java.util.Scanner;

public class problems1070 {

	public static void main(String[] args) {
		int b,i;
		Scanner in = new Scanner(System.in);
		b = in.nextInt();
		if(b%2==0)
		{
			for(i=b+1;i<b+12;i=i+2)
				System.out.printf("%d\n",i);
		}
		else
		{
			for(i=b;i<b+11;i=i+2)
				System.out.printf("%d\n",i);
		}
		in.close();

	}

}
