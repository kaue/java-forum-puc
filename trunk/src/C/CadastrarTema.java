package C;

import M.Forum;
import M.Tema;
import V.CadastroDeTemas;

public class CadastrarTema {

	Forum forum;
	
	public CadastrarTema(Forum f){
		forum = f;
		new CadastroDeTemas(this);
	}
	
	public void gravarTema(String texto){
		Tema tema = new Tema(texto);
		forum.add(tema);
	}
	
}
