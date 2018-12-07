package unsumittedproblem1;
//uncomplete.
import java.util.Scanner;

public class problems1116 {

	public static void main(String[] args) {
		
		int a,b;
		Scanner in =new Scanner(System.in);
		int i,N;
		float division;
		N=in.nextInt();
		for(i=0;i<N;i++)
		{
			a=in.nextInt();
			b=in.nextInt();
			if(b==0)
				System.out.println("divisao impossivel\n");
			else {
				division=(float)a/b;
				System.out.printf("%.1f\n",division);
			}
		}	
		in.close();
	}
	
}