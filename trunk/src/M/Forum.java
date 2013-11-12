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

	//Questao
	/** Busta uma questao utilizado o nome e o tema, retorna a questao se econtrada ou null.
	 * @param lTema		Nome do Tema a da Questao a ser pesquisada
	 ** @param lQuestao	Texto da Questao a ser pesquisada
	 * @return			Questao encontrada ou null
	 */
	public Questao buscaQuestao(String lQuestaoTexto, String lTemaTexto){
		int i = 0;
		while ((i<listaQuestoes.length) && !listaQuestoes[i].getTema().equals(lTemaTexto) && !listaQuestoes[i].getTexto().equals(lQuestaoTexto)){
			i++;
		}
		if(listaQuestoes[i].getTema().equals(lTemaTexto) && listaQuestoes[i].getTexto().equals(lQuestaoTexto)) {
			return listaQuestoes[i];
		}else {
			return null;
		}
	}
	public Questao[] getListaQuestoes(){
		return listaQuestoes;
	}
	/** Adiciona o Questao a lista de Questoes.
	 * @param questao	Questao a ser adicionado
	 */
	public void addQuestao(Questao lQuestao){
		if (listaQuestoes==null){
			//Lista vazia
			listaQuestoes = new Questao[1];
			listaQuestoes[0] = lQuestao;
		} else {
			//Lista com conteúdo
			Questao[] listaAuxiliar = new Questao[listaQuestoes.length+1];
			for (int i=0;i<listaQuestoes.length;i++){
				listaAuxiliar[i] = listaQuestoes[i];
			}
			listaAuxiliar[listaQuestoes.length] = lQuestao;
			listaQuestoes = listaAuxiliar;
		}
	}


	//Resposta
	public Resposta buscaResposta(String lQuestaoTexto, String lTemaTexto){
		//TODO
		return null;
	}
	public Resposta[] getListaRespostas(){
		return listaRespostas;
	}
	public void addResposta(Resposta lResposta){
		if (listaRespostas==null){
			//lista vazia
			listaRespostas = new Resposta[1];
			listaRespostas[0] = lResposta;
		} else {
			//lista com conteúdo
			Resposta[] listaAuxiliar = new Resposta[listaRespostas.length+1];
			for (int i=0;i<listaRespostas.length;i++){
				listaAuxiliar[i] = listaRespostas[i];
			}
			listaAuxiliar[listaRespostas.length] = lResposta;
			listaRespostas = listaAuxiliar;
		}
	}

}
