package br.com.objective.neves.jogoGourmet;

public class NodoFolha extends Nodo {

	private NodoGalho pai;

	public NodoFolha(NodoGalho pai, String dado) {
		super(dado);
		this.pai = pai;
	}

	public NodoGalho getPai() {
		return pai;
	}

	public void setPai(NodoGalho pai) {
		this.pai = pai;
	}

	@Override
	public boolean perguntar(JogoInterface jogoInterface) {
		int resposta = jogoInterface.perguntarComidaQuePensou(this.getDado());

		if (resposta == jogoInterface.RESPOSTA_SIM) {
			jogoInterface.mostrarMensagemAcertei();
			return true;
		} else if (resposta == jogoInterface.RESPOSTA_NAO) {
			String comida = jogoInterface.perguntarComidaCorreta();

			if (validarInformacaoDigitada(comida)) {
				String aspecto = jogoInterface.perguntarAspectoComidaCorreta(comida, this.getDado());

				if (validarInformacaoDigitada(aspecto)) {
					inserirNovoGalhoPai(comida, aspecto);
				}
			}
			return true;
		} else {
			return false;
		}
	}

	private void inserirNovoGalhoPai(String comida, String aspecto) {
		NodoGalho novoAspecto = new NodoGalho(aspecto);
		NodoFolha novaComida = new NodoFolha(novoAspecto, comida);

		novoAspecto.setSim(novaComida);
		novoAspecto.setNao(this);

		if (this.getPai().getSim().equals(this)) {
			this.getPai().setSim(novoAspecto);
		} else {
			this.getPai().setNao(novoAspecto);
		}
		
		this.setPai(novoAspecto);
	}

	private boolean validarInformacaoDigitada(String info) {
		return info != null && !info.trim().isEmpty();
	}

}