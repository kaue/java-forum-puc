package V;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import C.CadastrarQuestao;
import M.*;

public class ConsultaDoForum extends JFrame{

	private CadastrarQuestao cadastrarQuestao;

	//Componentes Swing
	private JComboBox comboListaTemas;
	private JButton btnVoltar;
	private JTextArea txtForum;

	public ConsultaDoForum(Tema[] listaTemas){
		//Criar Array de String para Popular ComboBox
		if((listaTemas == null) && (listaTemas.length == 0)){
			System.out.print("Aviso: Nao e possivel adicionar uma questao sem Tema.\n");
			return;
		}


		String textoCompletoForum = "";

		for (int i=0;i<listaTemas.length;i++){
			textoCompletoForum += listaTemas[i].getTexto() + "\n";
			Questao[] listaQuestoes = listaTemas[i].getListaQuestoes();
			for(int i2=0;i2<listaQuestoes.length;i2++){
				textoCompletoForum += "\t" + listaQuestoes[i2].getTexto() + "\n";
				Resposta[] listaResposta = listaQuestoes[i2].getListaRespostas();
				for(int i3=0;i3<listaResposta.length;i3++){
					textoCompletoForum += "\t\t" + listaResposta[i3].getTexto() + "\n";
				}
			}
		}

		//Janela
		setBounds(200, 200, 280, 300);
		setTitle("JFórum 1.0 - Cadastro de Temas");


		//TextArea Questao
		txtForum = new JTextArea(textoCompletoForum);
		txtForum.setLineWrap(true);
		txtForum.setWrapStyleWord(true);
		txtForum.setBounds(5, 5, 260, 280);
		txtForum.setEditable(false);

		//Button Salvar
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 120, 260, 20);
		btnVoltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		//Adicionar Componentes na View.
		add(txtForum);
		add(btnVoltar);
		//Configurar Layout
		setLayout(null);
		setResizable(false);
		setVisible(true);
	}



}
