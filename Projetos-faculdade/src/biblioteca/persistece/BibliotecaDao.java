package biblioteca.persistece;

import java.util.ArrayList;
import java.util.List;

import biblioteca.domain.Biblioteca;

public class BibliotecaDao {
	
	private static List<Biblioteca> livros = new ArrayList<>();

	public static void adicionar(Biblioteca biblioteca){
		livros.add(biblioteca);
	}
}
