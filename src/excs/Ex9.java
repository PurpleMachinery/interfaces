package excs;

import java.util.Scanner;

public class Ex9 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		double raio, intervalo, velocidade;
		System.out.print("Digite o raio: ");
		raio = entrada.nextDouble();
		System.out.print("Digite o intervalo: ");
		intervalo = entrada.nextDouble();
		velocidade = (2*3.14*raio)/intervalo;
		System.out.println("Velocidade média: "+velocidade);
	}
}
