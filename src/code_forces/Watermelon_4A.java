package code_forces;

import java.util.Scanner;

public class Watermelon_4A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		if(i%2 == 0 && (i/2)%2==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
