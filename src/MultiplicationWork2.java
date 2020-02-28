
public class MultiplicationWork2{

	public static void main(String[] args) {

		System.out.printf("     ");
		for (int x = 1; x <= 10; x++) {

			System.out.printf("%5d",x);
		}
		System.out.println();
		System.out.println("_______________________________________________________");
		for (int i = 1; i <= 10; i++) {

			System.out.printf("%2d | ",i);
			for (int a = 1; a <= 10; a++) {

				System.out.printf("%5d",converter(a , i));
			}
			System.out.println();
		}

	}
	static int converter (int d, int b) {
		return (d * b);

	}
} 
