package V;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

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
	private JLabel lbResposta;
	private JTextArea txtResposta;

	private Questao[] listaQuestoes;

	public CadastroDeRespostas(CadastrarResposta lControle, Tema[] lListaTemas, Questao[] lListaQuestoes){
		listaQuestoes = lListaQuestoes;
		cadastrarResposta = lControle;
		String[] strListaTemas;
		//Criar Array de String para Popular ComboBox
		if((lListaTemas != null) &&(lListaTemas.length > 0)){
			strListaTemas = new String[lListaTemas.length];
			for (int i=0;i<lListaTemas.length;i++){
				strListaTemas[i] = lListaTemas[i].getTexto();
			}
		}else {
			JOptionPane.showMessageDialog(null,"Aviso: Nao e possivel adicionar uma resposta sem Tema.\n","Resposta",JOptionPane.WARNING_MESSAGE);
			return;
		}

		if((lListaQuestoes == null) && (lListaQuestoes.length == 0)){
			System.out.print("Aviso: Nao e possivel adicionar uma resposta sem Questao.\n");
		}

		//Janela
		setBounds(200, 200, 280, 300);
		setTitle("JFórum 1.0 - Cadastro de Resposta");
		//Label Temas
		lbTemas = new JLabel("Tema");
		lbTemas.setBounds(0,10,50,20);
		//ComboBox Temas
		comboListaTemas = new JComboBox(strListaTemas);
		comboListaTemas.setBounds(50,10,100,20);
		comboListaTemas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
        		String temaSelecionado = (String)cb.getSelectedItem();
        		PreencherComboQuestoes(temaSelecionado);
			}
		});
		//Label Questoes
		lbQuestoes = new JLabel("Questoes");
		lbQuestoes.setBounds(0,40,50,20);
		//ComboBox Questoes
		comboListaQuestoes = new JComboBox(new String[] {"Selecione um Tema!"});
		comboListaQuestoes.setBounds(50,40,100,20);
		//TextArea Questao
		txtResposta = new JTextArea("Digite sua resposta aqui");
		txtResposta.setLineWrap(true);
		txtResposta.setWrapStyleWord(true);
		txtResposta.setBounds(50, 80, 200, 60);
		//Label Questao
		lbResposta = new JLabel("Resposta");
		lbResposta.setBounds(0,80,80,20);
		//Button Salvar
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(10, 120, 260, 20);
		btnSalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnSalvar();
			}
		});
		//Adicionar Componentes na View.
		add(lbTemas);
		add(comboListaTemas);
		add(lbQuestoes);
		add(comboListaQuestoes);
		add(btnSalvar);
		add(txtResposta);
		//Configurar Layout
		setLayout(null);
		setResizable(false);
		setVisible(true);
	}

	private void PreencherComboQuestoes(String lTemaSelecionado){
		comboListaQuestoes.removeAllItems();
		for (int i=0;i<listaQuestoes.length;i++){
			if(listaQuestoes[i].getTema().getTexto() == lTemaSelecionado){
				comboListaQuestoes.addItem(listaQuestoes[i].getTexto());
			}
		}
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
