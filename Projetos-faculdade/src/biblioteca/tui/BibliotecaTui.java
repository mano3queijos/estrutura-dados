package biblioteca.tui;

import java.util.InputMismatchException;
import java.util.Scanner;

import biblioteca.domain.Biblioteca;
import biblioteca.exception.BibliotecaException;

public class BibliotecaTui {

	static Scanner scan = new Scanner(System.in);

	public static void recebeDadosLivros() {

		try {
			System.out.println("Informe o Titulo do Livro");
			String titulo = scan.next();
			System.out.println("Informe o nome da editora");
			String nomeEditora = scan.nextLine();
			scan.nextLine();
			System.out.println("Informe o ano de publicação");
			String anoPublicacao = scan.next();
			Biblioteca biblioteca = new Biblioteca(titulo, nomeEditora, anoPublicacao);
			
		} catch (InputMismatchException e) {
			System.out.println("Valor invalido");
		}

	}
}
