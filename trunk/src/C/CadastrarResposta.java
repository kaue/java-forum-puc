package C;

import M.Forum;
import M.Tema;
import M.Questao;
import M.Resposta;
import V.CadastroDeRespostas;


public class CadastrarResposta {

	private Forum forum;
	private CadastroDeRespostas vCadastroDeRespostas;

	public CadastrarResposta(Forum lForum){
		forum = lForum;
		Tema[] listaTemas = forum.getListaTemas();
		vCadastroDeRespostas = new CadastroDeRespostas(this, listaTemas);
	}

	public void gravarResposta(Questao lQuestao, String lResposta){
		//Tema tema = forum.buscaTema(lTema);
		//Questao questao = tema.buscaQuestao(lQuestao);
		Resposta resposta = new Resposta(lResposta);
		lQuestao.addResposta(resposta);
	}
}
