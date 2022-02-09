package practicaEuler;

import java.util.Scanner;

import java.math.*;
public class euler {

	public static void main(String[] args) {

		double n;
		int dimA;
		double result;
		int cont = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introdueix quants numeros ha de contenir l'array");
		dimA = sc.nextInt();
		sc.nextLine();
		
		double[] arrayEuler = new double[dimA];


		while(cont<dimA) {
			System.out.println("Introdueix els numero que vols convertir a euler");
			n = sc.nextInt();
			
			sc.nextLine();
			result = Math.pow((1+(1/n)), n);
			arrayEuler[cont] = result; 
			cont++;
		}
		
		for (int i=0;i<arrayEuler.length; i++) {
			System.out.println(arrayEuler[i]);
		}

		
		

	




	














	}

}
