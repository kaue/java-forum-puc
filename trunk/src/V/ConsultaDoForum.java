package V;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import C.CadastrarQuestao;
import M.*;

public class ConsultaDoForum extends JFrame{

	private CadastrarQuestao cadastrarQuestao;

	//Componentes Swing
	private JComboBox comboListaTemas;
	private JTextArea txtForum;
	private JScrollPane scpScroll;

	public ConsultaDoForum(Tema[] listaTemas){
//		//Criar Array de String para Popular ComboBox
//		if((listaTemas == null) && (listaTemas.length == 0)){
//			System.out.print("Aviso: Nao e possivel adicionar uma questao sem Tema.\n");
//			return;
//		}

		String textoCompletoForum = "";
		if(listaTemas == null){
			textoCompletoForum = "(fórum vazio)";
		} else {
			for (int i=0;i<listaTemas.length;i++){
				textoCompletoForum += "Tema " + (i+1) + ": " + listaTemas[i].getTexto() + "\n";
				Questao[] listaQuestoes = listaTemas[i].getListaQuestoes();
				if (listaQuestoes == null){
					textoCompletoForum += "\t(não há questões para este tema)\n";
				} else {
					for(int i2=0;i2<listaQuestoes.length;i2++){
						textoCompletoForum += "\tQuestão " + (i2+1) + ": " + listaQuestoes[i2].getTexto() + "\n";
						Resposta[] listaResposta = listaQuestoes[i2].getListaRespostas();
						if(listaResposta == null){
							textoCompletoForum += "\t\t(não há respostas para esta questão)\n";
						} else {
							for(int i3=0;i3<listaResposta.length;i3++){
								textoCompletoForum += "\t\tResposta " + (i3+1) + ": " + listaResposta[i3].getTexto() + "\n";
							}
						}
					}
				}
			}
		}

		//Janela
		//setBounds(600, 400, 800, 600);
		setBounds(600, 400, 400, 400);
		setTitle("JFórum 1.0 - Consultar Fórum");


		//TextArea Questao
		txtForum = new JTextArea(textoCompletoForum);
		txtForum.setLineWrap(true);
		txtForum.setWrapStyleWord(true);
		txtForum.setBounds(0, 0, 800, 600);
		txtForum.setEditable(false);

		//Adicionar Componentes na View.
		add(txtForum);
		//Configurar Layout
		setLayout(null);
		setVisible(true);
		setResizable(false);
	}
}
