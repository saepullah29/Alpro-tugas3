package ExampleForeach;
public class Jawaban {
	public static void main(String[] args) {
		// Function to demonstrate printing pattern star
		int row;
		int maks_row = 6;
		int star;
		for(row=1; row< maks_row; row++) {
			for(star=1; star<=row; star++) {
				System.out.print("*");
				}
			System.out.println();
		}
		// Function to demonstrate printing pattern number
		int i;
		for(row=1; row< maks_row; row++) {
			for(i=1; i<=row; i++) {
				System.out.print(i + " ");
				}
			System.out.println();
		}
	}
}