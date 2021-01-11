package br.com.objective.neves.jogoGourmet;

public class NodoGalho extends Nodo {

	public NodoGalho(String dado) {
		super(dado);
	}

	private Nodo sim;
	private Nodo nao;

	public Nodo getSim() {
		return sim;
	}

	public void setSim(Nodo sim) {
		this.sim = sim;
	}

	public Nodo getNao() {
		return nao;
	}

	public void setNao(Nodo nao) {
		this.nao = nao;
	}

	@Override
	public boolean perguntar(JogoInterface jogoInterface) {
		int resposta = jogoInterface.perguntarComidaQuePensou(this.getDado());

		if (resposta == jogoInterface.RESPOSTA_SIM) {
			return (this.sim != null) && this.sim.perguntar(jogoInterface);
		} else if (resposta == jogoInterface.RESPOSTA_NAO) {
			return (this.nao != null) && this.nao.perguntar(jogoInterface);
		} else {
			return false;
		}
	}

}