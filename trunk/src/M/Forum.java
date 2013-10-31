package M;

import java.util.ArrayList;
import java.util.List;

public class Forum {

	private Tema[] listaTemas;
	private Questao[] listaQuestoes;

	public Forum(){

	}

	//Tema
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
	public void addTema(Tema tema){
		if (listaTemas==null){
			//lista vazia
			listaTemas = new Tema[1];
			listaTemas[0] = tema;
		} else {
			//lista com conteúdo
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
