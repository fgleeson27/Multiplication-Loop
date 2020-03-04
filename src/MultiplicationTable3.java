import java.util.Scanner;

public class MultiplicationTable3 {

	public static void main(String[] args) {

		//	Takes user input 
		int n;
		System.out.println("Enter a number greater than 0: ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		System.out.printf("     ");
		for (int x = 1; x <= n; x++) {

			System.out.printf("%5d",x);
		}
		//		Prints multiplication table
		System.out.println();
		System.out.println("_________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		for (int i = 1; i <= n; i++) {

			System.out.printf("%2d | ",i);
			for (int a = 1; a <= n; a++) {

				System.out.printf("%5d",converter(a , i));
			}
			System.out.println();
		}

	}
	static int converter (int d, int b) {
		return (d * b);

	}

}


