package listaEncadeada;

public class ListaSimples {

	No inicio = null;
	int tamanho = 0;

	public void inserirInicio(String info) {

		No no = new No();
		no.info = info;
		no.proximo = inicio;
		inicio = no;
		tamanho++;
	}

	public void inserirFim(String info) {
		No no = new No();
		no.info = info;
		if (inicio == null) {
			inicio = no;
			no.proximo = null;
		} else {
			No local = inicio;
			while (local.proximo != null) {
				local = local.proximo;
			}
			local.proximo = no;
			no.proximo = null;
			tamanho++;
		}

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

}
