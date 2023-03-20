package domain;

public class Contact {

	private String nome;
	private String telefone;
	private String Email;
	
	

	
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	public Contact(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		Email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Contact [nome=" + nome + ", telefone=" + telefone + ", Email=" + Email + "]";
	}
	
	

}
