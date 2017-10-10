package excs;

import java.util.Scanner;

public class Ex11 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("U$ ");
		double a = entrada.nextDouble();
		System.out.print("R$ " + (a + a));
	}
}
