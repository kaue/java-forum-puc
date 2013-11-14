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

	private final Tema[] listaTemas;

	public CadastroDeRespostas(CadastrarResposta lControle, Tema[] lListaTemas){
		cadastrarResposta = lControle;
		listaTemas = lListaTemas;
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
				int index = cb.getSelectedIndex();
        		Tema temaSelecionado = listaTemas[index];
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

		//Preencher Questoes primeiro Tema
		Tema temaSelecionado = listaTemas[0];
		PreencherComboQuestoes(temaSelecionado);
	}

	private void PreencherComboQuestoes(Tema lTemaSelecionado){
		comboListaQuestoes.removeAllItems();
		Questao[] listaQuestoes = lTemaSelecionado.getListaQuestoes();
		for (int i=0;i<listaQuestoes.length;i++)
			comboListaQuestoes.addItem(listaQuestoes[i].getTexto());
	}

	private void btnSalvar(){
		Tema temaSelecionado = listaTemas[comboListaTemas.getSelectedIndex()];
		String txtQuestao = (String)comboListaQuestoes.getSelectedItem();
		Questao questaoSelecionada = temaSelecionado.buscaQuestao(txtQuestao);
		String tResposta = txtResposta.getText();
		//if(tTema == null){
		//	System.out.print("Aviso: Voce deve selecionar um Tema!\n");
		//	return;
		//}
		//if(tQuestao == null){
		//	System.out.print("Aviso: Voce deve digitar uma Questao!\n");
		//	return;
		//}

		cadastrarResposta.gravarResposta(questaoSelecionada,tResposta);
	}
}
