package excs;

import java.util.Scanner;

public class Ex12 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("R$ ");
		double a = entrada.nextDouble();
		System.out.print("U$ " + (a / 2));
	}
}
