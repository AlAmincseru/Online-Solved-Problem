//uncomplete.
package BeginnerProblems;

import java.util.Scanner;

public class problems1099 {

	public static void main(String[] args) {
		int sum=0,i,j,k,a,b,N;
		Scanner in=new Scanner(System.in);
		N=in.nextInt();
		for(i=0;i<N;i++)
		{
			a=in.nextInt();
			b=in.nextInt();
			if(a>b)
			{
				for(j=b+1;j<a;j++)
				{
					if((j%2)!=0)
					{
						sum=sum+i;
					}
					
				}
				System.out.printf("%d\n",sum);
			}
			else
			{
				for(k=a+1;k<b;k++)
				{
					if((k%2)!=0)
					{
						sum=sum+i;
					}
					
				}
				System.out.printf("%d\n",sum);
			}	
		}

	}

}
