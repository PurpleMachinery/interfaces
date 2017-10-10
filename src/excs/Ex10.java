package excs;

import java.util.Scanner;

public class Ex10 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		double massa = entrada.nextDouble(), calor = entrada.nextDouble(), variacao = entrada.nextDouble();
		double a = massa * calor * variacao;
		System.out.println("Calor sensivel: " + a);
	}
}
