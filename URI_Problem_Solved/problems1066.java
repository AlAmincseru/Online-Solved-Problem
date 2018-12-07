//complete.

package unsumittedproblem1;

import java.util.Scanner;

public class problems1066 {

	public static void main(String[] args) {
		int[] data = new int[5];
		Scanner ini=new Scanner(System.in);
		int i,count1=0,count2=0,count3=0,count4=0;
		for(i=0;i<5;i++)
		{
			data[i]=ini.nextInt();
			if(data[i]%2==0)
				count1++;
			if((data[i]%2)!=0)
				count2++;
			if(data[i]>0)
				count3++;
			if(data[i]<0)
				count4++;
		}
		
		System.out.printf("%d valor(es) par(es)\n",count1);
		System.out.printf("%d valor(es) impar(es)\n",count2);
		System.out.printf("%d valor(es) positivo(s)\n",count3);
		System.out.printf("%d valor(es) negativo(s)\n",count4);
		ini.close();

	}

}
