package unsumittedproblem3;

import java.util.Scanner;

public class problems1118 {

	public static void main(String[] args) {
		double a,x,b=0.0,c=0.0;
		int i,count=0,count1=0;
		Scanner in= new Scanner(System.in);
		do
		{
			
			a=in.nextDouble();
			System.out.println("nota invalida\n");
			
			if(a>=0&&a<=10) 
			{
				count++;
				b=b+a;
				if(count==2)
					System.out.printf("media = %.2f\n",b/count)
			}
			
		}while(count!=2);
			
		do
		{
			System.out.println("novo calculo (1-sim 2-nao)\n");
			i=in.nextInt();
			if(i==1)
			{
				
				x=in.nextDouble();
				if(x<1||x>2) 
				{
					
					System.out.println("novo calculo (1-sim 2-nao)\n");
					c=c+x;
					count1++;
				}
				System.out.printf("%.2f\n",c/count1);
			}
			
		}while(i!=2);

	}

}
