package unsumittedproblem2;

public class problems1097 {

	public static void main(String[] args) {
		
		int I,J,k=0;
		for(I=1;I<=9;I=I+2)
		{
			for(J=7+k;J>=5+k;J--)
			{
				System.out.printf("I=%d J=%d\n",I,J);
			}
			k=k+2;
		}
		
	}

}
