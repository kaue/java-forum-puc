package M;

public class Questao {

	private String questaoTexto;
	private Resposta[] listaRespostas;

	public Questao(String lQuestaoTexto){
		questaoTexto = lQuestaoTexto;
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


	//Obter Propriedades
	public Resposta[] getListaRespostas(){
		return listaRespostas;
	}
	public String getTexto(){
		return questaoTexto;
	}
}
