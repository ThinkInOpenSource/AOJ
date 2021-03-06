package AOJ;

import java.util.Scanner;

public class P1261 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int num = 0;
		for (int i = 0; i < a; i++) {
			if (isPrime(i) && isPrime(i + 1)) {
				num++;
			} else if (isPrime(i) && isPrime(i + 2)) {
				num++;
			}
		}
		System.out.println(num);
	}

	private static boolean isPrime(int n) {
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int c = 3; c * c <= n; c += 2) {
			if (n % c == 0)
				return false;
		}
		return true;
	}
}