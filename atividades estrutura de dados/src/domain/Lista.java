package domain;

public class Lista<T> {

	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {

		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;

	}

	public boolean adiciona(T elemento) {

		this.aumentaCapacidade();

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}

	}

	public int tamanho() {
		return this.tamanho;
	}

	public boolean adiciona(int posicao, T elemento) {

		// mover todos os elementos

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}

		this.aumentaCapacidade();

		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return false;

	}

	public int ultimoIndice(T elemento) {

		int ultimaPos = -1;
		for (int i = this.tamanho - 1; i > 0; i--) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}

		return -1;

	}

	public boolean contem(T elemento) {

		return busca(elemento) > -1;

	}

	public T busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}

	public int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	// B G D E F -> posição a ser removida é 1 (G)
	// 0 1 2 3 4
	// vetor[1] = vetor[2]
	// vetor[2] = vetor[3]

	// .....

	public void remove(T elemento) {

		int pos = this.busca(elemento);
		if (pos > -1) {
			this.remove(pos);
		} else {
			System.out.println("Elemento(" + elemento + ") não exise na lista");
		}

	}

	public T pegar(int posicao) {

		return this.busca(posicao);

	}

	public void limpar() {
//		 opção 1 
//		this.elementos = (T[]) new Object[this.elementos.length];

//		opçao 2
//		this.tamanho = 0;

//		opção 3
		for (int i = 0; i < this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho=0;
	}

	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}

		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];

		}
		this.tamanho--;

	}

	private void aumentaCapacidade() {

		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;

		}

	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(" , ");
		}
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		s.append("]");

		return s.toString();

	}
}
