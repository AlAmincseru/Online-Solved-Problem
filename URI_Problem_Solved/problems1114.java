package unsumittedproblem1;

import java.util.Scanner;

public class problems1114 {

	public static void main(String[] args) {
		int i;
		Scanner in= new Scanner(System.in);	
		do 
		{
			i=in.nextInt();
			if(i==2002)
				System.out.println("Acesso Permitido\n");
			else
				System.out.println("Senha Invalida\n");
		}
		while(i!=2002);
		in.close();
	}

}
