package br.com.dio.metodos;

public class Main {

	public static void main(String[] args) {

		// Calculadora
		System.out.println("Calculadora :");
		Calculadora.somar(5, 2);
		Calculadora.subtrair(5, 2);
		Calculadora.multiplicar(5, 2);
		Calculadora.divisao(5, 2);
		System.out.println();

		// Mensagem
		System.out.println("Mensagem de horário : ");
		Mensagem.obterMensagem(8);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(20);
		System.out.println();

		// Emprestimo
		System.out.println("Emprestimo : ");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);
		System.out.println();

		// Calcular Quadrilateros
		System.out.println("Quadrilateros : ");
		Quadrilatero.calcularArea(3);
		Quadrilatero.calcularArea(5, 5);
		Quadrilatero.calcularArea(7, 8, 9);
		System.out.println();

		// Calcular Quadrilateros com Return
		System.out.println("Quadrilateros com return : ");
		double areaQuadrado = Quadrilatero.calcularAreaReturn(3);
		System.out.println("Area do quadrado " + areaQuadrado);
		double areaRetangulo = Quadrilatero.calcularAreaReturn(5, 5);
		System.out.println("Area do retangulo " + areaRetangulo);
		double areaTrapezio = Quadrilatero.calcularAreaReturn(7, 8, 9);
		System.out.println("Area do trapezio " + areaTrapezio);

	}

}
