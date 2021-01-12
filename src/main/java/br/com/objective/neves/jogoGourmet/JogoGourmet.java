package br.com.objective.neves.jogoGourmet;

public class JogoGourmet {

	private static JogoInterface jogoInterface = new JogoInterface();

	private static NodoGalho raizArvore;

	private static void inicializarArvore() {
		raizArvore = new NodoGalho("massa");

		NodoFolha comidaLasanha = new NodoFolha(raizArvore, "lasanha");
		NodoGalho comidaFria = new NodoGalho("fria");
		raizArvore.setSim(comidaLasanha);
		raizArvore.setNao(comidaFria);

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
