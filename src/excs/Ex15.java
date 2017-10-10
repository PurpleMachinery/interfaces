package excs;

import java.util.Scanner;

public class Ex15 {
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		double a = entrada.nextDouble();
		System.out.println("Volume: "+((4/3)*3.14*Math.pow(a,3)));
		System.out.println("Area: "+(4*3.14*Math.pow(a, 2)));
	}
}
