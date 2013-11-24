package V;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

import C.CadastrarResposta;
import M.Tema;
import M.Questao;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class CadastroDeRespostas extends JFrame{

	private CadastrarResposta cadastrarResposta;

	//Componentes Swing
        private JLabel lbLogo;
	private JLabel lbTemas;
        private JButton btnVoltar;
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
		int numeroQuestoes = 0;
		if((lListaTemas != null) &&(lListaTemas.length > 0)){
			strListaTemas = new String[lListaTemas.length];
			for (int i=0;i<lListaTemas.length;i++){
				numeroQuestoes += lListaTemas[i].getListaQuestoes().length;
				strListaTemas[i] = lListaTemas[i].getTexto();
			}
		}else {
			JOptionPane.showMessageDialog(null,"Não é possível cadastrar uma resposta sem antes cadastrar um tema!", "Erro", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if(numeroQuestoes== 0){
			JOptionPane.showMessageDialog(null,"Não é possível cadastrar uma resposta sem antes cadastrar uma questão!", "Erro", JOptionPane.ERROR_MESSAGE);
			return;
		}
		//Janela
		//setBounds(600, 400, 320, 250);
		setBounds(600, 400, 400, 400);
		setTitle("JFórum 1.0 - Cadastro de Resposta");
                
                BufferedImage img;
		try {
			img = ImageIO.read(getClass().getResource("../include/logoPuc.jpg"));
			lbLogo = new JLabel(new ImageIcon(img));
			lbLogo.setBounds(0, 0, 400, 90);
		} catch (IOException e1) {
		}	
                
                
		//Label Temas
		lbTemas = new JLabel("Tema:");
		lbTemas.setBounds(20,100,50,20);
		//ComboBox Temas
		comboListaTemas = new JComboBox(strListaTemas);
		comboListaTemas.setBounds(90,100,270,20);
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
		lbQuestoes = new JLabel("Questão:");
		lbQuestoes.setBounds(20,130,70,20);
		//ComboBox Questoes
		comboListaQuestoes = new JComboBox(new String[] {"Selecione um Tema!"});
		comboListaQuestoes.setBounds(90,130,270,20);
		//TextArea Questao
		txtResposta = new JTextArea("Digite sua resposta aqui");
		txtResposta.setLineWrap(true);
		txtResposta.setWrapStyleWord(true);
		txtResposta.setBounds(90, 160, 260, 60);
		txtResposta.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent arg0) {
				if(txtResposta.getText().equals("")){
					txtResposta.setText("Digite sua resposta aqui");
				}
			}

			@Override
			public void focusGained(FocusEvent arg0) {
				if(txtResposta.getText().equals("Digite sua resposta aqui")){
					txtResposta.setText("");	
				}
			}
		});
		//Label Questao
		lbResposta = new JLabel("Resposta:");
		lbResposta.setBounds(20,160,80,20);
		//Button Salvar
		btnSalvar = new JButton(new ImageIcon(getClass().getResource("../include/btnSalvar.png")));
		btnSalvar.setBounds(272, 230, 128, 128);
		btnSalvar.setOpaque(false);
		btnSalvar.setContentAreaFilled(false);
		btnSalvar.setBorderPainted(false);
                
                btnVoltar = new JButton(new ImageIcon(getClass().getResource("../include/btnVoltar.png")));
		btnVoltar.setBounds(0, 230, 128, 128);
		btnVoltar.setOpaque(false);
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorderPainted(false);	
		
		
		btnSalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnSalvar();
			}
		});
                
                btnVoltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		//Adicionar Componentes na View.
		add(lbTemas);
                add(lbLogo);
                add(btnVoltar);
		add(comboListaTemas);
		add(lbQuestoes);
		add(comboListaQuestoes);
		add(btnSalvar);
		add(txtResposta);
                add(lbResposta);
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
		JOptionPane.showMessageDialog(null, "Resposta cadastrada com sucesso!");
		dispose();
	}
}