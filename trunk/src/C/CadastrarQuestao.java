package C;

import M.Forum;
import M.Tema;
import V.CadastroDeQuestoes;

public class CadastrarQuestao {

	Forum forum;
	private CadastroDeQuestoes cadastroDeQuestoes;

	public CadastrarQuestao(Forum f){
		forum = f;
		Tema[] listaTemas = f.getListaTemas();
		cadastroDeQuestoes = new CadastroDeQuestoes(this, listaTemas);
	}

	public void gravarQuestao(String temaTxt, String QuestaoTxt){
		Tema tema = forum.buscaTema(temaTxt);
	}
}
