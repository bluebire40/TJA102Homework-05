package hw2;

public class NineNineLoop {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}

		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}			
			System.out.println();
			i++;
		}

		int i = 1;
		do {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			i++;
			System.out.println();
		} while (i <= 9);

	}

}
