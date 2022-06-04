package testpr;
import java.util.Scanner;

public class Main {

	public static int totalstudent(int a, int b, int c, int d) {
		int s = (a + b) - 3;

		int result = s + d;

		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int b = sc.nextInt();

		int c = sc.nextInt();

		int d = sc.nextInt();
		int totalstudent = Main.totalstudent(a, b, c, d);
		System.out.println(totalstudent);

	}
}
