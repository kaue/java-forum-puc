package V;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import C.CadastrarQuestao;
import M.Tema;

public class CadastroDeQuestoes extends JFrame{

	private CadastrarQuestao cadastrarQuestao;

	//Componentes Swing
	private JComboBox comboListaTemas;
	private JButton btnSalvar;
	private JLabel lbTemas;
	private JLabel lbQuestao;
	private JTextArea txtQuestao;

	public CadastroDeQuestoes(CadastrarQuestao controle, Tema[] listaTemas){

		cadastrarQuestao = controle;

		//Criar Array de String para Popular ComboBox
		String[] strListaTemas = null;
		if((listaTemas != null) &&(listaTemas.length > 0)){
			strListaTemas = new String[listaTemas.length];
			for (int i=0;i<listaTemas.length;i++){
				strListaTemas[i] = listaTemas[i].getTexto();
			}
		}else {
			JOptionPane.showMessageDialog(null, "Não é possível cadastrar uma questão sem antes cadastrar pelo menos um tema!", "Erro", JOptionPane.ERROR_MESSAGE);
			return;
		}
		//Janela
		setBounds(600, 400, 320, 200);
		setTitle("JFórum 1.0 - Cadastro de Questões");
		//ComboBox Temas
		comboListaTemas = new JComboBox(strListaTemas);
		comboListaTemas.setBounds(70,10,220,20);
		//Label Temas
		lbTemas = new JLabel("Tema:");
		lbTemas.setBounds(20,10,50,20);
		//TextArea Questao
		txtQuestao = new JTextArea("Digite sua questão aqui");
		txtQuestao.setLineWrap(true);
		txtQuestao.setWrapStyleWord(true);
		txtQuestao.setBounds(70, 40, 220, 80);
		txtQuestao.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent arg0) {
				if(txtQuestao.getText().equals("")){
					txtQuestao.setText("Digite sua questão aqui");
				}
			}

			@Override
			public void focusGained(FocusEvent arg0) {
				if(txtQuestao.getText().equals("Digite sua questão aqui")){
					txtQuestao.setText("");	
				}
			}
		});
		//Label Questao
		lbQuestao = new JLabel("Questão:");
		lbQuestao.setBounds(20,40,80,20);
		//Button Salvar
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(70, 140, 220, 20);
		btnSalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnSalvar();
			}
		});
		//Adicionar Componentes na View.
		add(comboListaTemas);
		add(lbTemas);
		add(txtQuestao);
		add(lbQuestao);
		add(btnSalvar);
		//Configurar Layout
		setLayout(null);
		setResizable(false);
		setVisible(true);
	}

	private void btnSalvar(){
		String tTema = (String)comboListaTemas.getSelectedItem();
		String tQuestao = txtQuestao.getText();
		if(tQuestao.equals("Digite sua questão aqui")){
			JOptionPane.showMessageDialog(null, "Digite sua questão!", "Erro", JOptionPane.ERROR_MESSAGE);
			return;
		} else {
			cadastrarQuestao.gravarQuestao(tTema,tQuestao);
			JOptionPane.showMessageDialog(null, "Questão cadastrada com sucesso!");
			dispose();
		}
	}
}
