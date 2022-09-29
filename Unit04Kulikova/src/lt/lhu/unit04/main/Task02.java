package lt.lhu.unit04.main;

/*
 * Написать метод(методы) для нахождения суммы большего и меньшего из
трех чисел
 */
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		double a, b, c, min, max, sum;
		a = inputDouble();
		b = inputDouble();
		c = inputDouble();
		min = 0;
		max = 0;
		sum = 0;

		min = findMinNum(a, b, c);
		max = findMaxNum(a, b, c);
		sum = findSum(min, max);

		System.out.println(sum);
	}

	public static double findMinNum(double x, double y, double z) {

		double min;
		min = 0;

		if (x < y && x < z) {
			min = x;
		} else if (y < x && y < z) {
			min = y;
		} else if (z < x && z < y) {
			min = z;
		}
		return min;

	}

	public static double findMaxNum(double x, double y, double z) {

		double max;
		max = 0;

		if (x > y && x > z) {
			max = x;
		} else if (y > x && y > z) {
			max = y;
		} else if (z > x && z > y) {
			max = z;
		}
		return max;

	}

	public static double findSum(double x, double y) {

		double sum;
		sum = x + y;

		return sum;
	}

	public static double inputDouble() {

		double num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число\n> ");

		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("Вы не ввели число\n> ");
		}
		num = sc.nextDouble();
		
		return num;
	}
}
