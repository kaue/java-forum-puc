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
		Questao[] listaQuestoes = forum.getListaQuestoes();
		vCadastroDeRespostas = new CadastroDeRespostas(this, listaTemas, listaQuestoes);
	}

	public void gravarResposta(String lTema, String lQuestao, String lResposta){
		Tema tema = forum.buscaTema(lTema);
		Questao questao = forum.buscaQuestao(lTema,lQuestao);
		Resposta resposta = new Resposta(tema, questao, lResposta);
		forum.addResposta(resposta);

	}
}
