package lt.lhu.unit04.main;
/*
 * Написать метод(методы) для нахождения наибольшего общего делителя и
наименьшего общего кратного двух натуральных чисел
 */

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		int a, b;
		a = inputInt("Vvedite chislo");
		b = inputInt("Vvedite vtoroe chislo");

		int nok, nod;
		nok = 0;
		nod = findNODEvklid(a, b);

		nok = (a * b) / nod;

		System.out.println(nok);

	}

	public static int findNODEvklid(int x, int y) {

		int nod = 0;

		while (y != 0 && x != 0) {
			if (x > y) {
				x %= y;
			} else {
				y %= x;
			}
			nod = x + y;
		}
		return nod;

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