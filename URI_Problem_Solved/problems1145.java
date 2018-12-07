package unsumittedproblem3;

import java.util.Scanner;

public class problems1145 {

	public static void main(String[] args) {
				int X,Y;
				Scanner input =new Scanner(System.in);
				X = input.nextInt();
				Y = input.nextInt();
				for (int i = 1; i <= (Y); i+=3) {
					for (int j = i; j <= i+(X - 1); j++) {
						System.out.print(j+" ");
					}
					System.out.print("\n")
				}
				input.close();

			}

}
