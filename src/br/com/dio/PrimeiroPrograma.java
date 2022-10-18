package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato(null, null, null);
		livros livros = new livros ();
		
		System.out.println(gato);
		System.out.println(livros);
	

		/*int a = 5;
		int b = 2;
		System.out.println("Hello World " + (a + b));*/
	}
}


class livros {
	private String nome;
	private String npag;
}