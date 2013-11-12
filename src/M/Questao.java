package M;

public class Questao {

	private String questaoTexto;
	private Resposta[] listaResposta;

	public Questao(Tema lTema, String lQuestaoTexto){
		questaoTema = lTema;
		questaoTexto = lQuestaoTexto;
	}

	public void add(){

	}

	public void getListaRespostas(){

	}
	//Obter Propriedades
	public Tema getTema(){
		return questaoTema;
	}
	public String getTexto(){
		return questaoTexto;
	}
}
