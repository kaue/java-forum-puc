package C;

import M.Forum;
import M.Tema;
import V.CadastroDeTemas;

public class CadastrarTema {

	Forum forum;
	private CadastroDeTemas vCadastroDeTemas;

	public CadastrarTema(Forum f){
		forum = f;
		vCadastroDeTemas = new CadastroDeTemas(this);
	}

	public void gravarTema(String texto){
		Tema tema = new Tema(texto);
		forum.addTema(tema);
	}

}
