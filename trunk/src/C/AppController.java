package C;

import M.Forum;
import V.MenuPrincipal;
import C.CadastrarTema;
import C.CadastrarQuestao;
public class AppController {

	private MenuPrincipal vMenuPrincipal;

	private CadastrarTema cCadastrarTema;
	private CadastrarQuestao cCadastrarQuestao;

	private Forum forum;

	public AppController(){
		forum = new Forum();
		vMenuPrincipal = new MenuPrincipal(this);
	}

	public void cadastrarTema(){
		cCadastrarTema = new CadastrarTema(forum);
	}

	public void cadastrarQuestao(){
		cCadastrarQuestao = new CadastrarQuestao(forum);
	}

	public void cadastrarResposta(){

	}

	public void verForum(){

	}
}