package br.ucsal.edu.Emanuelpc;

public class teste {

	public static void main(String[] args) {

		ListaDupla lt = new ListaDupla();

		lt.InseririNoInici("A");
		System.out.println(lt);

		lt.InseririNoInici("B");
		System.out.println(lt);

		lt.InseririNoInici("C");
		System.out.println(lt);

		lt.InseririNoInici("D");
		System.out.println(lt);
//
//		lt.inserirFim("1");
//		System.out.println(lt);
//
//		lt.inserirFim("2");
//		System.out.println(lt);
//
//		lt.inserirFim("3");
//		System.out.println(lt);
//
//		lt.inserirFim("4");
//		System.out.println(lt);

		System.out.println(lt);

		System.out.println(lt.revToString());

	}
}
