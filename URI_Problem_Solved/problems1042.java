package BeginnerProblems;

import java.util.Scanner;

public class problems1042 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner in = new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if(a<b&&b>c) 
		{
			if(a>c)
				System.out.printf("%d\n%d\n%d\n",c,a,b);
			else
				System.out.printf("%d\n%d\n%d\n",a,c,b);	
		}
		else if(b<c&&c>a)
		{
			if(b<a)
				System.out.printf("%d\n%d\n%d\n",b,a,c);
			else
				System.out.printf("%d\n%d\n%d\n",a,b,c);
		}
		else if(b<a&&a>c)
		{
			if(b<c)
				System.out.printf("%d\n%d\n%d\n",b,c,a);
			else
				System.out.printf("%d\n%d\n%d\n",c,b,a);
		}
		System.out.printf("\n%d\n%d\n%d\n",a,b,c);
		in.close();
		
	}

}
