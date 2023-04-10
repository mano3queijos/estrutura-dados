package br.ucsal.edu.Emanuelpc;

public class ListaDupla {

	No inicio;
	No fim;
	int tamanho;

	public void InseririNoInici(String info) {

		No no = new No();
		no.info = info;

		no.anterior = null;
		no.proximo = inicio;
		if (inicio != null) {
			inicio.anterior = no;

		}
		inicio = no;
		if (tamanho == 0) {
			fim = inicio;
		}
		tamanho++;
	}

	public void inserirFim(String info) {
		No no = new No();
		no.info = info;
		no.proximo = null; // O último nó aponta sempre para null
		no.anterior = fim; // o nó anterior vai ser o último nó.
		if (fim != null) {
			fim.proximo = no;
		}
		fim = no;
		// testa se não tem nada ainda
		if (tamanho == 0) {
			inicio = fim;
		}
		tamanho++;
	}

	@Override
	public String toString() {
		String str = "Tamanho(" + tamanho + ")" + "Elemento: ";
		No local = inicio;
		while (local != null) {
			str += local.info + " ";
			local = local.proximo;

		}

		return str;
	}

	public String revToString() {
		String str = "(" + (tamanho) + ")";

		No local = fim;
		while (local != null) {
			str += local.info + " ";
			local = local.anterior;
		}
		return str;

	}
//	public String toString() {
//		String str = "(" + tamanho + ")";
//		No local = inicio;
//		while (local != null) {
//			str += local.info + " ";
//			local = local.proximo;
//		}
//		return str;
//	}
//
//
//

}
