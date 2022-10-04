package lt.lhu.unit05.main;
/*
 * Реализовать сложение двух чисел неограниченной длины. Для хранения
чисел использовать тип String
 */

import java.util.Scanner;
import java.math.BigInteger;

public class Task02 {

	public static void main(String[] args) {

		String x = inputNum("Введите число");
		String y = inputNum("Введите второе число");

		BigInteger num1 = new BigInteger(x);
		BigInteger num2 = new BigInteger(y);

		BigInteger summa = num1.add(num2);

		System.out.println(summa.toString());

	}

	public static String inputNum(String message) {

		String num;
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		num = sc.nextLine();

		return num;
	}

}
