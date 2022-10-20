package br.com.dio.metodos;

public class Quadrilatero {

	/*
	 * Atividade de sobrecarga Criar uma aplicacao que calcula a área dos 3
	 * quadrilateros notaveis : quadrado, retangulo e trapezio
	 */

	public static void calcularArea(double lado) {
		System.out.println("Valor da Area do Quadrado : " + Math.pow(lado, 2));
	}
	public static void calcularArea(double lado, double altura) {
		System.out.println("Valor da Area do Retangulo : " + lado * altura);
	}
	public static void calcularArea(double Bmaior, double bmenor, double altura) {
		System.out.println("Valor da Area do Trapezio : " + ((Bmaior + bmenor) * altura) / 2);
	}
	
	/*
	 * Recrie a aplicacao que calcula a area dos 3 quadrilateros notaveis. Agora faca
	 * os metodos retornarem valores
	*/
	
	public static double calcularAreaReturn(double lado) {
		 
		return Math.pow(lado, 2);
	}
	public static double calcularAreaReturn(double lado, double altura) {
		 
		return lado * altura;
	}
	public static double calcularAreaReturn(double Bmaior, double bmenor, double altura) {
		 
		return ((Bmaior + bmenor) * altura) / 2;
	}
	
}
