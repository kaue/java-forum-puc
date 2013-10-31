package C;

import M.Forum;
import M.Tema;
import M.Questao;
import V.CadastroDeQuestoes;

public class CadastrarQuestao {

	Forum forum;
	private CadastroDeQuestoes vCadastroDeQuestoes;

	public CadastrarQuestao(Forum f){
		forum = f;
		Tema[] listaTemas = f.getListaTemas();
		vCadastroDeQuestoes = new CadastroDeQuestoes(this, listaTemas);
	}

	public void gravarQuestao(String lTemaTxt, String lQuestaoTxt){
		Tema tema = forum.buscaTema(lTemaTxt);
		Questao questao = new Questao(tema, lQuestaoTxt);
		forum.addQuestao(questao);

	}
}
