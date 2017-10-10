package excs;

import java.util.Scanner;

public class Ex18 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		double s0 = entrada.nextDouble(), v0 = entrada.nextDouble(), t = entrada.nextDouble(), a = entrada.nextDouble();
		double S = s0 + v0 * t + (a / 2) * Math.pow(t, 2);
		System.out.print("Result: " + S);
	}
}
