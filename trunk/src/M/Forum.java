package M;

import java.util.ArrayList;
import java.util.List;

public class Forum {

	private Tema[] listaTemas;

	public Forum(){

	}

	//Tema
	/** Busta um tema utilizado o nome, retorna o tema se econtrado ou null.
	 * @param lTemaTexto	Nome do Tema a ser pesquisado
	 * @return				Tema encontrado ou null
	 */
	public Tema buscaTema(String lTemaTexto){
		int i = 0;
		while ((i<listaTemas.length) && !listaTemas[i].getTexto().equals(lTemaTexto)){
			i++;
		}
		if(listaTemas[i].getTexto().equals(lTemaTexto)) {
			return listaTemas[i];
		}else {
			return null;
		}
	}
	public Tema[] getListaTemas(){
		return listaTemas;
	}
	/** Adiciona o Tema a lista de Temas.
	 * @param tema	Tema a ser adicionado
	 */
	public void addTema(Tema lTema){
		//TODO verificar se ja existe tema com o mesmo nome.
		if (listaTemas==null){
			//Lista vazia
			listaTemas = new Tema[1];
			listaTemas[0] = lTema;
		} else {
			//Lista com conteúdo
			Tema[] listaAuxiliar = new Tema[listaTemas.length+1];
			for (int i=0;i<listaTemas.length;i++){
				listaAuxiliar[i] = listaTemas[i];
			}
			listaAuxiliar[listaTemas.length] = lTema;
			listaTemas = listaAuxiliar;
		}
	}
}
