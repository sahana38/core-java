package com.xworkz.interview;

public class TechnicalPrograms {
	

		public static void main(String[] args) {
			// Words and num;
			for (int i = 1; i <= 3; i++) {
				for (int j = 1; j <= 2; j++) {
					System.out.print(i);
					// System.out.print("Hello World");
				}
				System.out.println("Sahana");
			}
			/* ========================================================== */
			System.out.println("===============================");
			// another way for words and num
			for (int i = 0; i <= 3; i++) {
				for (int j = 0; j <= 3; j++) {
					if (j == 3) {
						System.out.print("d");
					} else {
						System.out.print(i);
					}
				}
				System.out.println("");
			}
			/* ========================================================== */
			System.out.println("===============================");
			// num & words & num
			for (int i = 0; i <= 3; i++) {
				for (int j = 0; j <= 3; j++) {
					if (i == 2) {
						System.out.print("Sahana");
					} else {
						System.out.print(i);
					}
				}
				System.out.println("");
			}
			/* ========================================================== */
			System.out.println("===============================");
			// Pyramid
			/*
			 * # ## ### ####
			 */
			for (int i = 0; i <= 3; ++i) {
				for (int j = 0; j <= i; ++j) {
					System.out.print(" " + "#");
				}
				System.out.println("");
			}
			/* ========================================================== */
			System.out.println("===============================");
			/*
			 * 0 11 222 3333
			 */
			for (int i = 0; i <= 3; ++i) {
				for (int j = 0; j <= i; ++j) {
					System.out.print(" " + "" + i);
				}
				System.out.println("");
			}
			/* ========================================================== */
			System.out.println("===============================");

			for (int i = 0; i <= 3; i++) {
				for (int j = i; j <= 3; j++) {
					System.out.print(j);
				}
				System.out.println("");
			}

			System.out.println("===============================");
			// ===================================================
			int n = 4;
			// printing the dollars in rectangle triangle
			// main loop
			for (int i = 1; i <= n; i++) {
				// printting sapce
				for (int j = n - 1; j >= i; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print("$");
				}
				System.out.println("");
			}
			System.out.println("===============================");
			// ===================================================
			int a = 4;
			// printing the dollars in triangle
			// main loop
			for (int i = 1; i <= a; i++) {
				// printting sapce
				for (int j = a - 1; j >= i; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print("$ ");
				}
				System.out.println("");
			}
			System.out.println("===============================");
			// ===================================================

			int b = 4;
			// printing the dollars in triangle
			// main loop
			for (int i = 1; i <= b; i++) {
				// printting sapce
				for (int j = a - 1; j >= i; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print(i);
				}
				System.out.println("");
			}
			System.out.println("===============================");
			// ===================================================
			int c = 4;
			// printing the num in triangle
			// main loop
			for (int i = 1; i <= c; i++) {
				// printting sapce
				for (int j = c - 1; j >= i; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print(k);
				}
				System.out.println("");
			}
			System.out.println("===============================");
			// ===================================================
			int d = 4;
			// printing the num in triangle
			// main loop
			for (int i = 1; i <= d; i++) {
				// printting sapce
				for (int j = d - 1; j >= i; j--) {
					System.out.print(j);
				}
				for (int k = 1; k <= i; k++) {
					System.out.print(k);
				}
				System.out.println("");
			}
			System.out.println("===============================");
			// ===================================================
			int e = 4;
			// printing the num in triangle
			// main loop
			for (int i = 1; i <= e; i++) {
				// printting sapce
				for (int j = c - 1; j >= i; j--) {
					if (j == 2) {
						System.out.print("Sahana");
					} else {
						System.out.print(j);
					}
				}
				for (int k = 1; k <= i; k++) {
					if (k == 2) {
						System.out.print(" " + "Sahana" + " ");
					} else {
						System.out.print(k);
					}
				}
				System.out.println("");
			}
			System.out.println("===============================");
			// ===================================================

			int g = 4;

			for (int i = g; i >= 1; i--) {

				for (int j = g - 1; j >= i; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print("& ");
				}
				System.out.println("");
			}

			// ===================================================
			System.out.println("===============================");

			int h = 4;
			// printing the num in triangle
			// main loop
			for (int i = 1; i <= h; i++) {
				// printting sapce
				for (int j = h - 1; j >= i; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print("% ");
				}
				System.out.println("");
			}

			System.out.println("______________");

			for (int row = 1; row <= 5; row++) {
				for (int col = 1; col <= 5; col++) {
					if (row == 1 && col == 5) {
						System.out.print("Xworkz");
					} else {
						System.out.print(col);
					}
				}
				System.out.println();
			}

			System.out.println("______________");
			for (int row = 1; row <= 5; row++) {
				for (int col = 1; col <= 5; col++) {
					if (col == 1 || col == 5 || row == 1 || row == 5) {
						System.out.print("@");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println("______________");

			for (int row = 1; row <= 5; row++) {
				for (int col = 1; col <= 5; col++) {
					if (col == 1 || col == 5 || row == 1) {
						System.out.print("@");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println("_______________");
			for (int row = 1; row <= 5; row++) {
				for (int col = 1; col <= 5; col++) {
					if (col == 5 || row == 1 || row == 5) {
						System.out.print("@");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println("_______________");
			for (int row = 1; row <= 5; row++) {
				for (int col = 1; col <= 5; col++) {
					if (col == 1 || row == 1 || row == 5) {
						System.out.print("@");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println("_______________");
			for (int row = 1; row <= 5; row++) {
				for (int col = 1; col <= 5; col++) {
					if (col == 1 || row == 1 || col == 5 || row == 5 || row == 3 || col == 3) {
						System.out.print("@");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println("_______________");
			for (int row = 1; row <= 5; row++) {
				for (int col = 1; col <= 5; col++) {
					if (col == 1 || row == 1 || col == 5 || row == 5 || row == 2 && col == 2 || row == 2 & col == 4
							|| row == 3 && col == 3 || row == 4 && col == 2 || row == 4 && col == 4) {
						System.out.print("@");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println("_______________");

			for (int row = 1; row <= 5; row++) {
				for (int col = 1; col <= 5; col++) {
					if (col == 1 || row == 1 || col == 2 && row == 2 || col == 3 && row == 3 || col == 4 && row == 4
							|| col == 5 && row == 5) {
						System.out.print("@");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println("_______________");
			for (int row = 1; row <= 6; row++) {
				for (int col = 1; col <= 5; col++) {
					if (row == 1 || row == 5 && col == 3 || row == 4 && col == 4 || row == 3 && col == 5
							|| row == 2 && col == 1 || row == 2 && col == 5 || row == 4 && col == 2
							|| row == 3 && col == 1) {
						System.out.print("@");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println("_______________");
			for (int row = 1; row <= 6; row++) {
				for (int col = 1; col <= 6; col++) {
					if (row == 5 && col == 3 || row == 4 && col == 4 || row == 3 && col == 5
							|| row == 2 && col == 1 || row == 2 && col == 5 || row == 4 && col == 2
							|| row == 3 && col == 1) {
						System.out.print("@");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println("_______________");
			for (int row = 1; row <= 6; row++) {
				for (int col = 1; col <= 6; col++) {
					if (row == 5 && col == 3 || row == 4 && col == 4 || row == 3 && col == 5
							|| row == 2 && col == 1 || row == 2 && col == 5 || row == 4 && col == 2
							|| row == 3 && col == 1) {
						System.out.print("@");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}


