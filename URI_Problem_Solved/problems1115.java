package unsumittedproblem1;

import java.util.Scanner;

public class problems1115 {

	public static void main(String[] args) {
		int a,b;
		Scanner in = new Scanner(System.in);
		do
		{
			a=in.nextInt();
			b=in.nextInt();
			if(a>0 && b>0)
				System.out.println("primeiro\n");
			else if(a>0&&b<0)
				System.out.println("quarto\n");
			else if(a<0&&b<0)
				System.out.println("terceiro\n");
			else if(a<0&&b>0)
				System.out.println("segundo\n");
		}while((a!=0)&&(b!=0)&&(a!=0&&b!=0));
		in.close();
	}

}
