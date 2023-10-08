package Guess;

import java.util.Scanner;

public class Player {
		int number;
		
		void guess() {
			Scanner sc = new Scanner(System.in);
			number = sc.nextInt();
		}
}
