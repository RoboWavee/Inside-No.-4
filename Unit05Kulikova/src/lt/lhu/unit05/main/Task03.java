package lt.lhu.unit05.main;
/*
 * Натуральное число, в записи которого n цифр, называется числом
Армстронга, если сумма его цифр, возведенная в степень n, равна самому
числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать
декомпозицию
 */

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		long k = inputLong("Введите число");

		for (long i = 1; i <= k; i++) {
			long n = findExp(i);
			long sum = findSum(i, n);

			if (i == sum) {
				System.out.println(i);
			}
		}

	}

	public static long findSum(long x, long y) {

		long sum = 0;

		while (x != 0) {
			sum = sum + (long) Math.pow(x % 10, y);
			x = x / 10;
		}

		return sum;

	}

	public static long findExp(long x) {

		long exp = 0;

		while (x != 0) {
			x = x / 10;
			exp++;

		}

		return exp;
	}

	public static long inputLong(String message) {

		long num;
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextLong()) {
			sc.nextLine();
			System.out.println("Вы не ввели число\n> " + message);
		}
		num = sc.nextLong();

		return num;
	}

}
