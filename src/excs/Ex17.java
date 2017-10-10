package excs;

import java.util.Scanner;

public class Ex17 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		double a[] = new double[3];
		for (int i = 0; i <= 2; i++) {
			a[i] = entrada.nextDouble();
		}
		a[0] = ((a[0] * 4) + (a[1] * 4) + (a[2] * 2)) / 10;
		System.out.println("Média: "+a[0]);
	}
}
