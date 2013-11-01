package C;

import M.Forum;
import M.Tema;
import M.Questao;
import V.CadastroDeQuestoes;

public class CadastrarQuestao {

	private Forum forum;
	private CadastroDeQuestoes vCadastroDeQuestoes;

	public CadastrarQuestao(Forum lForum){
		forum = lForum;
		Tema[] listaTemas = forum.getListaTemas();
		vCadastroDeQuestoes = new CadastroDeQuestoes(this, listaTemas);
	}

	public void gravarQuestao(String lTema, String lQuestaoTexto){
		Tema tema = forum.buscaTema(lTema);
		Questao questao = new Questao(tema, lQuestaoTexto);
		forum.addQuestao(questao);

	}
}
