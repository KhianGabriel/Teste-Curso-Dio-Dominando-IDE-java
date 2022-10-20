package br.com.dio.metodos;

import java.util.Scanner;

public class Calculadora {
	
	static Scanner leia = new Scanner(System.in);

	public static void somar(double a, double b) {
		double resultado = a + b;
		System.out.println("O resultado da soma de : " + a + " mais " + b + " é = " + resultado);
	}

	public static void subtrair(double a, double b) {
		double resultado = a - b;
		System.out.println("O resultado da subtracao de : " + a + " menos " + b + " é = " + resultado);
	}

	public static void multiplicar(double a, double b) {
		double resultado = a * b;
		System.out.println("O resultado da multiplicação de : " + a + " vezes " + b + " é = " + resultado);
	}

	public static void divisao(double a, double b) {
		double resultado = a / b;
		if (b == 0) {
			System.out.println("divisao invalida");
			System.out.println("Novo valor de b :");
			b = leia.nextDouble();
		}
		System.out.println("O resultado da multiplicação de : " + a + " dividido " + b + " é = " + resultado);
	}

}
