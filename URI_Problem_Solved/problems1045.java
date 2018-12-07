package BeginnerProblems;

import java.util.Scanner;

public class problems1045 {

	public static void main(String[] args) {
		double temp;
		double[] data = new double[3];
		Scanner in = new Scanner(System.in);
		int i,k;
		for(i=0;i<3;i++)
		{
			data[i]=in.nextDouble();
		}
		for(i=0;i<3;i++)
		{	k=0;
			while(k<2)
			{
				if(data[k]>data[k+1])
				{
					temp=data[k];
					data[k]=data[k+1];
					data[k+1]=temp;
				}
				k++;
			}
			in.close();
		}
		if(data[2]>=(data[1]+data[0]))
			System.out.printf("NAO FORMA TRIANGULO\n");
		 if((data[2]*data[2])==((data[1]*data[1])+(data[0]*data[0])))
			System.out.printf("TRIANGULO RETANGULO\n");
		 if((data[2]*data[2])>((data[1]*data[1])+(data[0]*data[0])))
			System.out.printf("TRIANGULO OBTUSANGULO\n");
		 if((data[2]*data[2])<((data[1]*data[1])+(data[0]*data[0])))
			System.out.printf("TRIANGULO ACUTANGULO\n");
		 if(data[2]==data[1]&&data[1]==data[0])
			System.out.printf("TRIANGULO EQUILATERO\n");
		 if(((data[2]==data[1])&&(data[2]!=data[0]))||((data[2]==data[0])&&(data[2]!=data[1]))||((data[1]==data[0])&&(data[1]!=data[2])))
			System.out.printf("TRIANGULO ISOSCELES\n");
			  }
	}
	

