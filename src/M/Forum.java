package M;

import java.util.ArrayList;
import java.util.List;

public class Forum {

	private Tema[] listaTemas;
	private Questao[] listaQuestoes;

	public Forum(){

	}

	//Tema
	/** Busta um tema utilizado o nome, retorna o tema se econtrado ou null.
	 * @param temaTxt	Nome do Tema a ser pesquisado
	 * @return			Tema encontrado ou null
	 */
	public Tema buscaTema(String temaTxt){
		int i = 0;
		while ((i<listaTemas.length) && !listaTemas[i].getTema().equals(temaTxt)){
			i++;
		}
		if(listaTemas[i].getTema().equals(temaTxt)) {
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
	public void addTema(Tema tema){
		//TODO verificar se ja existe tema com o mesmo nome.
		if (listaTemas==null){
			//Lista vazia
			listaTemas = new Tema[1];
			listaTemas[0] = tema;
		} else {
			//Lista com conteúdo
			Tema[] listaAuxiliar = new Tema[listaTemas.length+1];
			for (int i=0;i<listaTemas.length;i++){
				listaAuxiliar[i] = listaTemas[i];
			}
			listaAuxiliar[listaTemas.length] = tema;
			listaTemas = listaAuxiliar;
		}
	}

	//Questao
	public Questao buscaQuestao(String questaoTexto, String temaTexto){
		//TODO

		//int i = 0;
		//while ((i<listaTemas.length) && !listaTemas[i].getTema().equals(temaTxt)){
		//	i++;
		//}
		//if(listaTemas[i].getTema().equals(temaTxt)) {
		//	return listaTemas[i];
		//}else {
		//	return null;
		//}
		return null;
	}
	public Questao[] getListaQuestoes(){
		return listaQuestoes;
	}
	/** Adiciona o Questao a lista de Questoes.
	 * @param questao	Questao a ser adicionado
	 */
	public void addQuestao(Questao questao){
		if (listaQuestoes==null){
			//lista vazia
			listaQuestoes = new Questao[1];
			listaQuestoes[0] = questao;
		} else {
			//lista com conteúdo
			Questao[] listaAuxiliar = new Questao[listaTemas.length+1];
			for (int i=0;i<listaQuestoes.length;i++){
				listaAuxiliar[i] = listaQuestoes[i];
			}
			listaAuxiliar[listaQuestoes.length] = questao;
			listaQuestoes = listaAuxiliar;
		}
		System.out.print(listaQuestoes.length);
	}
}
