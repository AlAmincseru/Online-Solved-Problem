package unsumittedproblem3;

import java.util.Scanner;

//complete.
//wrong ans 5%
public class problems1133 {

	public static void main(String[] args) {
		int a ,b;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		if(a>=b)
		{
			for(int i=b-1;i<a;i++)
			{
				if(i%5==2||i%5==3)
					System.out.printf("%d\n",i);
			}
		}
		else
		{
			for(int i=a-1;i<b;i++)
			{
				if(i%5==2||i%5==3)
					System.out.printf("%d\n",i)
			}
		}
		in.close();
	}

}
