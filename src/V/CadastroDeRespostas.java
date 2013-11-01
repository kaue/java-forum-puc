package V;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import C.CadastrarResposta;
import M.Tema;
import M.Questao;

public class CadastroDeRespostas extends JFrame{

	private CadastrarResposta cadastrarResposta;

	//Componentes Swing
	private JLabel lbTemas;
	private JComboBox comboListaTemas;
	private JLabel lbQuestoes;
	private JComboBox comboListaQuestoes;
	private JButton btnSalvar;
	private JTextArea txtResposta;

	public CadastroDeRespostas(CadastrarResposta lControle, Tema[] lListaTemas, Questao[] lListaQuestoes){
		cadastrarResposta = lControle;

		//Criar Array de String para Popular ComboBox
		if((lListaTemas != null) &&(lListaTemas.length > 0)){
			String[] strListaTemas = new String[lListaTemas.length];
			for (int i=0;i<lListaTemas.length;i++){
				strListaTemas[i] = lListaTemas[i].getTema();
			}
		}else {
			System.out.print("Aviso: Nao e possivel adicionar uma resposta sem Tema.\n");
			return;
		}
		if((lListaQuestoes != null) &&(lListaQuestoes.length > 0)){
			String[] strListaQuestoes = new String[lListaQuestoes.length];
			for (int i=0;i<lListaQuestoes.length;i++){
				strListaQuestoes[i] = lListaQuestoes[i].getTexto();
			}
		}else {
			System.out.print("Aviso: Nao e possivel adicionar uma resposta sem Questao.\n");
			return;
		}
//
//		//Janela
//		setBounds(200, 200, 280, 300);
//		setTitle("JFórum 1.0 - Cadastro de Resposta");
//		String[] strListaTemas;
//		//ComboBox Temas
//		comboListaTemas = new JComboBox(strListaTemas);
//		comboListaTemas.setBounds(50,10,100,20);
//		//Label Temas
//		lbTemas = new JLabel("Tema");
//		lbTemas.setBounds(0,10,50,20);
//		//ComboBox Questoes
//		comboListaTemas = new JComboBox(strListaQuestoes);
//		comboListaTemas.setBounds(50,10,100,20);
//		//Label Questoes
//		lbTemas = new JLabel("Questoes");
//		lbTemas.setBounds(0,10,50,20);
//		//TextArea Questao
//		txtQuestao = new JTextArea("Digite sua resposta aqui");
//		txtQuestao.setLineWrap(true);
//		txtQuestao.setWrapStyleWord(true);
//		txtQuestao.setBounds(50, 40, 200, 60);
//		//Label Questao
//		lbQuestao = new JLabel("Questão");
//		lbQuestao.setBounds(0,40,80,20);
//		//Button Salvar
//		btnSalvar = new JButton("Salvar");
//		btnSalvar.setBounds(10, 120, 260, 20);
//		btnSalvar.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				btnSalvar();
//			}
//		});
//		//Adicionar Componentes na View.
//		add(lbTemas);
//		add(comboListaTemas);
//		add(lbQuestoes);
//		add(comboListaQuestoes);
//		add(btnSalvar);
//		add(txtResposta);
//		//Configurar Layout
//		setLayout(null);
//		setResizable(false);
//		setVisible(true);
	}

	private void btnSalvar(){
//		String tTema = (String)comboListaTemas.getSelectedItem();
//		String tQuestao = txtQuestao.getText();
//		if(tTema == null){
//			System.out.print("Aviso: Voce deve selecionar um Tema!\n");
//			return;
//		}
//		if(tQuestao == null){
//			System.out.print("Aviso: Voce deve digitar uma Questao!\n");
//			return;
//		}
//
//		cadastrarResposta.gravarQuestao(tTema,tQuestao);
	}

	public void gravarQuestao(){

	}

}
