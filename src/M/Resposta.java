package M;

public class Resposta {

	private String respostaTexto;

	public Resposta(Tema lTema, Questao lQuestao, String lRespostaTexto){
		respostaTema = lTema;
		respostaQuestao = lQuestao;
		respostaTexto = lRespostaTexto;
	}

	public void add(){

	}

	public void getListaRespostas(){

	}
	//Obter Propriedades
	public Tema getTema(){
		return respostaTema;
	}
	public Questao getQuestao(){
		return respostaQuestao;
	}
	public String getTexto(){
		return respostaTexto;
	}
}
