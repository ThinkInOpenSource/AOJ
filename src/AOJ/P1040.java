package AOJ;

import java.util.Scanner;

public class P1040 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			if (i % 2 != 0)
				sum += i;
		}
		System.out.println(sum);
		cin.close();
	}
}
