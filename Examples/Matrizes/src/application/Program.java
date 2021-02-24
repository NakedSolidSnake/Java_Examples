package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Size of Matriz:");
		int n = scanner.nextInt();
		
		int [][]mat = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = scanner.nextInt();
			}			
		}
		
		System.out.println("Main diagonal:");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");			
		}
		
		System.out.println("");
		scanner.close();
	}

}
