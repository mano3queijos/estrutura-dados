package teste.labs;

import java.util.ArrayList;

import domain.Lista;

public class Ex02 {

	public static void main(String[] args) {

		ArrayList<String> arraylist = new ArrayList<String>(5);
		arraylist.add("A");
		arraylist.add("A");
		arraylist.add("A");
		arraylist.add("A");

		System.out.println(arraylist.lastIndexOf("A"));

		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("A");
		lista.adiciona("IK");
		lista.adiciona("H");
		lista.adiciona("B");

		System.out.println(lista.ultimoIndice("H"));
	}

}
