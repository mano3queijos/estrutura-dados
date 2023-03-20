package teste.labs;

import java.util.Scanner;

import domain.Contact;
import domain.Lista;

public class Ex06 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

//		criar vetor com 20 de capacidade 
		Lista<Contact> lista = new Lista<Contact>(20);

//		criar e adiicionar x quantidades de contatos 
		criarContatosDinamicamente(5, lista);

//		criar um menu para acesso de funcionalidades

		int opcao = 1;
		while (opcao != 0) {
			opcao = obterOpcaoMenu();
			switch (opcao) {
			case 1:
				adicionarContatoFinal(lista);
				break;
			case 2:
				adicionarContatoPosicao(lista);
				break;
			case 3:
				obtemContatoPosicao(lista);
				break;
			case 4:
				obtemContato(lista);
				break;
			case 5:
				pesquisarUltimoContatoIndice(lista);
				break;
			case 6:
				verificarSeContatoExiste(lista);
				
				break;

			case 7:
				excluirPorPosicao(lista);
				break;
			case 8:
				excluirContato(lista);
				break;
			case 9:
				imprimeTamanhoVetor(lista);

				break;
			case 10:
				limparVetor(lista);
				break;
			case 11:
				imprimirVetor(lista);
				break;
			default:

				break;
			}

		}

		System.out.println("O ususario apertou 0 e o programa terminou");

	}

	private static void imprimirVetor(Lista<Contact> lista) {

		System.out.println(lista);
	}

	private static void limparVetor(Lista<Contact> lista) {
		lista.limpar();
		System.out.println("Todos os contatos do vetor foram excluidos");

	}

	private static void imprimeTamanhoVetor(Lista<Contact> lista) {

		System.out.println("Tamanho do vetor é de: " + lista.tamanho());

	}

	private static void excluirContato(Lista<Contact> lista) {

		int pos = lerInformacaoInt("Entre com a posição a ser removida");
		try {
			Contact contact = lista.busca(pos);
			lista.remove(contact);
			System.out.println("Contato excluido");
		} catch (Exception e) {

		}
	}

	private static void excluirPorPosicao(Lista<Contact> lista) {

		int pos = lerInformacaoInt("Entre com a posição a ser excluida");
		try {
			lista.remove(pos);
			System.out.println("Contato excluido");
		} catch (Exception e) {

		}

	}

	private static void obtemContato(Lista<Contact> lista) {
		int pos = lerInformacaoInt("Entre com a poisição a ser pesquisada");

		try {
			Contact contact = lista.busca(pos);
			System.out.println("Fazendo pesquisa do contato encontrado");
			pos = lista.busca(contact);
			System.out.println("Contato encontrado na posição: " + pos);

		} catch (Exception e) {
		}
	}

	private static void obtemContatoPosicao(Lista<Contact> lista) {
		int pos = lerInformacaoInt("Entre com a posição a ser pesquisada");

		try {
			Contact contact = lista.busca(pos);
			System.out.println("Contato existe, segue dados: ");
			System.out.println(contact);
		} catch (Exception e) {
			System.out.println("Posição invalida");
		}

	}

	private static void adicionarContatoFinal(Lista<Contact> lista) {

		System.out.println("Criando um contato, Entre com as informações");
		String nome = lerInformacao("Entre com o nome");
		String telefone = lerInformacao("Entre com o telefone");
		String email = lerInformacao("Entre com o email");

		Contact contact = new Contact(nome, telefone, email);
		lista.adiciona(contact);
		System.out.println("Contato adiciona com sucesso");
		System.out.println(contact);

	}

	private static void adicionarContatoPosicao(Lista<Contact> lista) {

		System.out.println("Criando um contato, Entre com as informações");
		String nome = lerInformacao("Entre com o nome");
		String telefone = lerInformacao("Entre com o telefone");
		String email = lerInformacao("Entre com o email");

		Contact contact = new Contact(nome, telefone, email);
		int pos = lerInformacaoInt("Entre com a posição a adicionar o contato");
		lista.adiciona(pos, contact);

		try {
			lista.adiciona(pos, contact);

		} catch (Exception e) {
			System.out.println("Posição invalida, contato não adicionado");

		}

		System.out.println("Contato adiciona com sucesso");
		System.out.println(contact);

	}

	private static String lerInformacao(String message) {

		System.out.println(message);
		String entrada = scan.nextLine();
		return entrada;

	}

	private static int lerInformacaoInt(String message) {

		boolean entradaValida = false;
		int num = 0;

		while (!entradaValida) {

			try {
				System.out.println(message);
				String entrada = scan.nextLine();
				num = Integer.parseInt(entrada);
				entradaValida = true;

			} catch (Exception e) {
				System.out.println("Entrada Invalida, digite novamente");

			}

		}

		return num;
	}

	private static int obterOpcaoMenu() {

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;
		while (entradaValida != true) {

			System.out.println("Digite a opção desejada");
			System.out.println("1: Adiciona contato ao final do vetor");
			System.out.println("2: Adiciona contato em uma posição especifica");
			System.out.println("3: Consulta contato de uma posição especifica");
			System.out.println("4: Consulta contato");
			System.out.println("5: Consulta ultimo indice do contato");
			System.out.println("6: Verifica se o contato existe");
			System.out.println("7: remove por posição");
			System.out.println("8: excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contatos do vetor");
			System.out.println("11: imprime vetor");
			System.out.println("0: sair");
			try {
				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				if (opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				} else {
					throw new Exception();
				}

			} catch (Exception e) {
				System.out.println("Entrada Invalida Digite Novamente\n\n");

			}

		}
		return opcao;

	}

	private static void pesquisarUltimoContatoIndice(Lista<Contact> lista) {

		int pos = lerInformacaoInt("Entre com a posição a ser perseguida");
		try {
			Contact contact = lista.busca(pos);

			System.out.println("Fazendo pesquisa do último indice do contato encontrado: ");
			pos = lista.ultimoIndice(contact);
			System.out.println("Contato encontrado na posição: " + pos);
		} catch (Exception e) {

		}

	}

	private static void verificarSeContatoExiste(Lista<Contact> lista) {

		int pos = lerInformacaoInt("Entre com a posição a ser perseguida");
		try {
			Contact contact = lista.busca(pos);

			boolean existe = lista.contem(contact);
			if (existe) {
				System.out.println(contact);
			} else {
				System.out.println("Contato não existe");
			}

			lista.contem(contact);
		} catch (Exception e) {

		}

	}

	private static void criarContatosDinamicamente(int qtdContacts, Lista<Contact> lista) {

		Contact contact;
		for (int i = 1; i < qtdContacts; i++) {
			contact = new Contact();
			contact.setNome("Contato " + i);
			contact.setTelefone("38427920" + i);
			contact.setEmail("contato" + i + "@email.crom");

			lista.adiciona(contact);

		}
	}
}
