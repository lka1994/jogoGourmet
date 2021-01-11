package br.com.objective.neves.jogoGourmet;

public class JogoGourmet {

	private static JogoInterface jogoInterface = new JogoInterface();

	private static NodoGalho raizArvore;

	private static void inicializarArvore() {
		raizArvore = new NodoGalho("massa");

		NodoGalho comidaCarne = new NodoGalho("carne");
		NodoGalho comidaFria = new NodoGalho("fria");
		raizArvore.setSim(comidaCarne);
		raizArvore.setNao(comidaFria);

		NodoFolha comidaLasanha = new NodoFolha(comidaCarne, "lasanha");
		NodoFolha comidaNhoque = new NodoFolha(comidaCarne, "nhoque");
		comidaCarne.setSim(comidaLasanha);
		comidaCarne.setNao(comidaNhoque);

		NodoFolha comidaSorvete = new NodoFolha(comidaFria, "sorvete");
		NodoFolha comidaArroz = new NodoFolha(comidaFria, "arroz");
		comidaFria.setSim(comidaSorvete);
		comidaFria.setNao(comidaArroz);
	}

	private static void iniciarJogo() {
		inicializarArvore();
		while (jogoInterface.comecarJogo()) {
			raizArvore.perguntar(jogoInterface);
		};
	}

	public static void main(String[] args) {
		iniciarJogo();
	}

}
