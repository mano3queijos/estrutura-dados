package teste;

import domain.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adicionar("elemento 1");
		vetor.adicionar("elemento 2");
		vetor.adicionar("elemento 3");
		vetor.adicionar("elemento 4");
		System.out.println(vetor.busca(2));

		
	}
}
