

public class Assignment1 {

	public static void main(String[] args) {
		// Answer for Q1
		int n = 5;
		for (int i = 0; i < n; i++) {
			// for letter I
			for (int j = 0; j < n; j++) {
				if (j == (n - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// for letter N
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			// for letter E
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0 || i == (n - 1) / 2 || i == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			// for letter U
			for (int j = 0; j < n; j++) {
				if ((j == 0 && i < (n - 1)) || (i == n - 1 && j != 0 && j != (n - 1)) || (j == n - 1 && i < (n - 1))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			// for letter R
			for (int j = 0; j < n; j++) {
				if (j == 0 || (i == 0 && j != (n - 1)) || (j == n - 1 && i > 0 && i < (n - 1) / 2)
						|| (i == (n - 1) / 2 && j != n - 1) ||
						(i == j && i > (n - 1) / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			// for letter O
			for (int j = 0; j < n; j++) {
				if ((j == 0 && i != 0 && i != n - 1) || (i == 0 && j != 0 && j != n - 1)
						|| (i == n - 1 && j != 0 && j != n - 1) ||
						(j == n - 1 && i != 0 && i != n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			// for letter N
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// Answer for Q2
		int n2 = 5;
		for (int i = 1; i < n2; i++) {
			for (int j = 1; j < n2; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		// Answer for Q3
		int n3 = 14;
		for (int i = 0; i < n3; i++) {
			for (int j = 0; j < n3; j++) {
				if ((i + j <= (n3 - 1) / 2) || (j - i >= (n3 - 1) / 2) || i == 0 || i == n3 - 1 || j == 0
						|| j == n3 - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();
		// Answer for Q4
		int n4 = 14;
		for (int i = 0; i < n4; i++) {
			for (int j = 0; j < n4; j++) {
				if ((i - j >= (n4 - 1) / 2) || (i + j >= n4 + 5)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();
		// Answer for Q5
		int n5 = 14;
		for (int i = 0; i < n5; i++) {
			for (int j = 0; j < n5; j++) {
				if ((i - j >= (n5 - 1) / 2) || (i + j <= (n5 - 1) / 2) || i == 0 || i == n5 - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
