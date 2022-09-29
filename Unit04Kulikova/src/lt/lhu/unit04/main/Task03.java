package lt.lhu.unit04.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		int a, b;
		a = inputInt("Vvedite chislo");
		b = inputInt("Vvedite vtoroe chislo");

		int countA = 0, countB = 0;
		countA = countDigits(a);
		countB = countDigits(b);

		if (countA > countB) {
			System.out.println("В числе " + a + " больше цифр, чем в числе " + b);
		} else {
			System.out.println("В числе " + b + " больше цифр, чем в числе " + a);
		}

	}

	public static int countDigits(int x) {

		int count = 0;

		while ((x / 10) != 0) {
			count++;
			x = x / 10;
		}
		count++;

		return count;
	}

	public static int inputInt(String message) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Вы не ввели число\n> " + message);
		}
		num = sc.nextInt();

		return num;
	}

}
