package C;

import M.Forum;
import V.MenuPrincipal;

public class AppController {

	private MenuPrincipal menuPrincipal;
	
	private Forum forum;
	
	public AppController(){
		forum = new Forum();
		menuPrincipal = new MenuPrincipal(this);
	}
	
	public void cadastrarTema(){
		new CadastrarTema(forum);
		
	}
	
	public void cadastrarQuestao(){
		new CadastrarQuestao(forum);
	}
	
	public void cadastrarResposta(){
		
	}
	
	public void verForum(){
		
	}
}