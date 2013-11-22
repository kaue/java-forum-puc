package M;

public class Tema {

	private String temaTxt;
	private Questao[] listaQuestoes;

	public Tema(String lTemaTexto){
		temaTxt = lTemaTexto;
		listaQuestoes = new Questao[0];
	}

	//Questao
	/** Busta uma questao utilizado o nome e o tema, retorna a questao se econtrada ou null.
	 * @param lTema		Nome do Tema a da Questao a ser pesquisada
	 ** @param lQuestao	Texto da Questao a ser pesquisada
	 * @return			Questao encontrada ou null
	 */
	public Questao buscaQuestao(String lQuestaoTexto){
		int i = 0;
		while ((i<listaQuestoes.length) && !listaQuestoes[i].getTexto().equals(lQuestaoTexto)){
			i++;
		}
		if(listaQuestoes[i].getTexto().equals(lQuestaoTexto)) {
			return listaQuestoes[i];
		}else {
			return null;
		}
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

	//Obter Propriedades
	public String getTexto(){
		return temaTxt;
	}

	public Questao[] getListaQuestoes(){
		return listaQuestoes;
	}
}
