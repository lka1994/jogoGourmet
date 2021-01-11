package br.com.objective.neves.jogoGourmet;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class JogoGourmetTest {

	private JogoInterface jogoInterface;

	@Before
	public void inicializarInterface() {
		jogoInterface = new JogoInterface();
	}

	@Test
	public void controlarInicioFimJogo() {
		boolean fecharJogo = false;
		Assert.assertEquals(fecharJogo, jogoInterface.comecarJogo());
	}

	@Test
	public void escreverNomeComida() {
		String comida = "bolo";
		Assert.assertEquals(comida, jogoInterface.perguntarComidaCorreta());
	}

	@Test
	public void escreverNomeAspecto() {
		String comidaCorreta = "bolo";
		String comidaIncorreta = "sorvete";
		String aspecto = "fofo";
		Assert.assertEquals(aspecto, jogoInterface.perguntarAspectoComidaCorreta(comidaCorreta, comidaIncorreta));
	}
}
