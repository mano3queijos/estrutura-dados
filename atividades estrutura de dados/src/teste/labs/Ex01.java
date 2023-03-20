package teste.labs;

import domain.Lista;

public class Ex01 {

	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("A");
		lista.adiciona("K");
		lista.adiciona("AWN");
		lista.adiciona("B");

		
		System.out.println(lista.contem("J"));
		System.out.println(lista.contem("A"));

	}

}
