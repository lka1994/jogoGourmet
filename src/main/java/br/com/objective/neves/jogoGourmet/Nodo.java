package br.com.objective.neves.jogoGourmet;

public abstract class Nodo {

	private String dado;

	public Nodo(String dado) {
		this.dado = dado;
	}

	public abstract boolean perguntar(JogoInterface jogoInterface);

	public String getDado() {
		return dado;
	}

	public void setDado(String dado) {
		this.dado = dado;
	}

}
