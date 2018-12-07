//uncomplete
package unsumittedproblem3;

import java.util.Scanner;

public class problems1047 {

	public static void main(String[] args) {
		int a,b,c,d,e,f,s;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		d=in.nextInt();
		
		if(a>=c)
		{
			e=24-a;
			f=e+c;
			c=f*60;
			if(b>=d)
			{
				s=60-b;
				h=s+d;
				e=(h+c)/60;
				h=(h+c)-(e*60);
				System.out.println("%d %d\n",e,h);
			}
			else
			{
				
			}
			
			
		}
	}

}
