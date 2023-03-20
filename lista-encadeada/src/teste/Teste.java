package teste;

import listaEncadeada.ListaSimples;

public class Teste {

	public static void main(String[] args) {
		ListaSimples i = new ListaSimples();

		System.out.println(i);

		i.inserirInicio("Emanuel");
		System.out.println(i);
		i.inserirInicio("Fabricio");
		System.out.println(i);
		i.inserirInicio("Porfessor");
		System.out.println(i);

		i.inserirFim("joão");
		System.out.println(i);
		i.inserirFim("hamilton");
		System.out.println(i);
		i.inserirFim("lorena");
		System.out.println(i);

	}
}
