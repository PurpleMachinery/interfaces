package excs;

import java.util.Scanner;

public class Ex7 {
	public static void main(String args[]){
		Scanner entrada=new Scanner(System.in);
		double a[]=new double[3];
		for(int i=0;i<3;i++){
			a[i]=entrada.nextDouble();
		}
		System.out.println("Seno: "+(a[0]/a[2]));
		System.out.println("Coseno: "+(a[1]/a[2]));
	}
}
