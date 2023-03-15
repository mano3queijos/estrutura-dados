package biblioteca.domain;

public class Biblioteca {

	private String titulo;
	private String editora;
	private String anoDePublicacao;


	public Biblioteca(String titulo, String editora, String anoDePublicacao) {
		super();
		this.titulo = titulo;
		this.editora = editora;
		this.anoDePublicacao = anoDePublicacao;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	public String getAnoDePublicacao() {
		return anoDePublicacao;
	}


	public void setAnoDePublicacao(String anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}


	@Override
	public String toString() {
		return "Biblioteca [titulo=" + titulo + ", editora=" + editora + ", anoDePublicacao=" + anoDePublicacao + "]";
	}
	
	
	
}
