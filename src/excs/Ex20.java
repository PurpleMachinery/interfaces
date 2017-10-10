package excs;

import java.util.Scanner;

public class Ex20 {
	public static void main(String args[]){
		Scanner entrada=new Scanner(System.in);
		double areaTotal=entrada.nextDouble(),areaConstruida=entrada.nextDouble();
		double areaNaoConstruida=areaTotal-areaConstruida;
		areaNaoConstruida*=3.8;
		areaConstruida*=5;
		
		System.out.println("Saida: "+(areaNaoConstruida+areaConstruida));
	}
}
