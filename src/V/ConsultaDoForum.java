package V;

import javax.swing.tree.*;
import javax.swing.JTree;
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
    private JTree listaForum;
    
	public ConsultaDoForum(Tema[] listaTemas){

	    DefaultMutableTreeNode forum = new DefaultMutableTreeNode("Forum");
	    DefaultMutableTreeNode tema = null;
	    DefaultMutableTreeNode pergunta = null;
	    DefaultMutableTreeNode resposta = null;
	    
		String textoCompletoForum = "";
		if(listaTemas != null){
			for (int i=0;i<listaTemas.length;i++){
				//textoCompletoForum += "Tema " + (i+1) + ": " + listaTemas[i].getTexto() + "\n";
				tema = new DefaultMutableTreeNode(listaTemas[i].getTexto());
			    forum.add(tema);
				Questao[] listaQuestoes = listaTemas[i].getListaQuestoes();
				
				if (listaQuestoes != null){
					for(int i2=0;i2<listaQuestoes.length;i2++){
						//textoCompletoForum += "\tQuestão " + (i2+1) + ": " + listaQuestoes[i2].getTexto() + "\n";
						pergunta = new DefaultMutableTreeNode(listaQuestoes[i2].getTexto());
					    tema.add(pergunta);

						Resposta[] listaResposta = listaQuestoes[i2].getListaRespostas();
						if(listaResposta != null){
							for(int i3=0;i3<listaResposta.length;i3++){
								//textoCompletoForum += "\t\tResposta " + (i3+1) + ": " + listaResposta[i3].getTexto() + "\n";
								resposta = new DefaultMutableTreeNode(listaResposta[i3].getTexto());
								pergunta.add(resposta);
							}
						}
					}
				}
			}
		}

		listaForum = new JTree(forum);
		
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

		listaForum.setBounds(0, 0, 800, 600);

		//Adicionar Componentes na View.
		//add(txtForum);
		add(listaForum);
		//Configurar Layout
		setLayout(null);
		setVisible(true);
		setResizable(false);
	}
}
