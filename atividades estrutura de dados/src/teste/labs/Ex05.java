package teste.labs;

import java.util.ArrayList;

import domain.Lista;

public class Ex05 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>(5);
		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("h");
		lista.adiciona("b");
		lista.adiciona("s");
		lista.adiciona("l");
		lista.adiciona("k");

		System.out.println(lista);
		System.out.println("\r\n");

		System.out.println(lista.pegar(2));

		System.out.println("\r\n");

		arrayList.add("a");
		arrayList.add("f");
		arrayList.add("j");
		arrayList.add("ç");
		arrayList.add("a");

		System.out.println(arrayList);
		System.out.println("\r\n");
		System.out.println(arrayList.get(4));

		System.out.println(arrayList);
		arrayList.clear();
		System.out.println(arrayList);
		
		System.out.println("\r\n");

		System.out.println(lista);
		lista.limpar();
		System.out.println(lista);

		

	}
}
