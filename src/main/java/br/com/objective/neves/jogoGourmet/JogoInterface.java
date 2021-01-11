package br.com.objective.neves.jogoGourmet;

import static javax.swing.JOptionPane.*;

public class JogoInterface {

	private static String TITULO_JOGO = "Jogo Gourmet";
	private static String ENUNCIADO = "Pense em uma comida que gosta";
	public int RESPOSTA_SIM = YES_OPTION;
	public int RESPOSTA_NAO = NO_OPTION;

	public boolean comecarJogo() {
		int resposta = showConfirmDialog(null, ENUNCIADO, TITULO_JOGO, DEFAULT_OPTION, INFORMATION_MESSAGE);
		return resposta == YES_OPTION;
	}

	public int perguntarComidaQuePensou(String comida) {
		return showConfirmDialog(null, "A comida que você pensou é " + comida + "?", TITULO_JOGO, YES_NO_OPTION);
	}

	public void mostrarMensagemAcertei() {
		showConfirmDialog(null, "Acertei de novo!", TITULO_JOGO, DEFAULT_OPTION, INFORMATION_MESSAGE);
	}

	public String perguntarComidaCorreta() {
		return showInputDialog("Qual comida você pensou?");
	}

	public String perguntarAspectoComidaCorreta(String comidaCorreta, String comidaIncorreta) {
		return showInputDialog(comidaCorreta + " é _____, mas " + comidaIncorreta + " não é.");
	}
}
