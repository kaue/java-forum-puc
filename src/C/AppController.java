package C;

import M.Forum;
import M.Tema;
import V.MenuPrincipal;
import V.ConsultaDoForum;

public class AppController {

	private MenuPrincipal vMenuPrincipal;

	private CadastrarTema cCadastrarTema;
	private CadastrarQuestao cCadastrarQuestao;
	private CadastrarResposta cCadastrarResposta;

	private ConsultaDoForum vConsultaDoForum;

	private Forum forum;

	public AppController(){
		//Iniciar Programa e abrir Menu Principal
		forum = new Forum();
		vMenuPrincipal = new MenuPrincipal(this);
	}

	public void cadastrarTema(){
		//Abrir View de Cadastro de Temas
		cCadastrarTema = new CadastrarTema(forum);
	}

	public void cadastrarQuestao(){
		//Abrir View de Cadastro de Questoes
		cCadastrarQuestao = new CadastrarQuestao(forum);
	}

	public void cadastrarResposta(){
		//Abrir View de Cadastro de Respostas
		cCadastrarResposta = new CadastrarResposta(forum);
	}

	public void verForum(){
		//Abrir View de Consulta do Forum
		Tema[] listaTemas = forum.getListaTemas();
		vConsultaDoForum = new ConsultaDoForum(listaTemas);
	}
}