package M;

public class Questao {

	private Tema questaoTema;
	private String questaoTexto;


	public Questao(Tema tema, String texto){
		questaoTema = tema;
		questaoTexto = texto;
	}

	public void add(){

	}

	public void getListaRespostas(){

	}
	public Tema getTema(){
		return questaoTema;
	}

	public String getTexto(){
		return questaoTexto;
	}
}
