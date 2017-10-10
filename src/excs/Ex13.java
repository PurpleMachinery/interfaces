package excs;

import java.util.Scanner;

public class Ex13 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("A: ");
		double a = entrada.nextDouble();
		System.out.print("B: ");
		double b = entrada.nextDouble();
		System.out.println("A = "+(a*b));
		System.out.println("P = "+(2*a+2*b));
	}
}
