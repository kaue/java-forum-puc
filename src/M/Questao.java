package M;

public class Questao {

	private Tema questaoTema;
	private String questaoTexto;


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
