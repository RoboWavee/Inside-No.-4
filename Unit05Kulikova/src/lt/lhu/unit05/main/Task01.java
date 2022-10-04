package lt.lhu.unit05.main;

/*
 * Написать метод(методы), проверяющий, являются ли данные три числа
взаимно простыми.
 */
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		int a, b, c;
		a = inputNum("Введите число A");
		b = inputNum("Введите число B");
		c = inputNum("Введите число C");

		int nodAB, nodAC, nodBC;
		nodAB = findNOD(a, b);
		nodAC = findNOD(a, c);
		nodBC = findNOD(b, c);

		if (nodAB != 1 && nodAC != 1 && nodBC != 1) {
			System.out.println("Эти три числа не взаимнопростые");
		} else {
			System.out.println("Эти три числа взаимнопростые");
		}

	}

	public static int inputNum(String message) {

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

	public static int findNOD(int x, int y) {

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
}
