package AULASDAUDEMI;

public class FELIZ_NATAL {

	public static void main(String[] args) {

		System.out.print("FELIZ NATAL!");
		System.out.println(" ");
		System.out.println(" ");
		int rows = 6;

		for (int i=0; i<rows; i++) {
			for (int j=rows-i; j>=1; j--)
				System.out.print(" ");
			for (int j = 0; j <= i; j++)
				System.out.print("* ");
				System.out.println();
		}
	}

}
