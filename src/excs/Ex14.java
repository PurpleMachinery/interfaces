package excs;

import java.util.Scanner;

public class Ex14 {
	public static void main(String args[]){
		Scanner entrada=new Scanner(System.in);
		double a=entrada.nextDouble(), b=(3.14*a);
		b*=b;
		a*=2*3.14;
		System.out.println("Area: "+b);
		System.out.println("Comprimento: "+a);
	}
}
