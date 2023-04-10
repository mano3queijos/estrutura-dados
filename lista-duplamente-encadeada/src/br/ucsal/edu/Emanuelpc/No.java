package br.ucsal.edu.Emanuelpc;

public class No {

	String info;
	No proximo;
	No anterior;

	public No() {
		// TODO Auto-generated constructor stub
	}

	public No(String info, No proximo, No anterior) {
		super();
		this.info = info;
		this.proximo = proximo;
		this.anterior = anterior;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

}
