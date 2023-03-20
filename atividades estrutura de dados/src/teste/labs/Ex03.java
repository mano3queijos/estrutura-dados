package teste.labs;

import domain.Lista;

public class Ex03 {

	public static void main(String[] args) {

		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("A");
		lista.adiciona("L");
		lista.adiciona("Q");
		lista.adiciona("G");
		lista.adiciona("F");

		System.out.println(lista);

		lista.remove("A");

		System.out.println(lista);

		lista.remove("v");

		System.out.println(lista);

	}
}
