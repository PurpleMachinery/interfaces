package excs;

import java.util.Scanner;

public class Ex16 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		double a=0, b;
		for (int i = 1; i <= 4; i++) {
			b=entrada.nextDouble();
			a+=b;
		}
		a/=4;
		System.out.println("Media: "+a);
	}
}
