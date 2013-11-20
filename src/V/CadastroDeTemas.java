package V;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;

import C.CadastrarTema;

public class CadastroDeTemas extends JFrame{

	private CadastrarTema cadastrarTema;

	private String temaTxt;

	//Componentes Swing
	private JButton btnSalvar;
	private JTextField txtTema;
	private JLabel lbTema;

	public CadastroDeTemas(CadastrarTema controle){
		cadastrarTema = controle;
		//Janela
		setBounds(600, 400, 320, 120);
		setTitle("JFórum 1.0 - Cadastro de Temas");
		//Label Tema
		lbTema = new JLabel("Tema:");
		lbTema.setBounds(20,10,50,20);
		//TextField Tema
		txtTema = new JTextField(20);
		txtTema.setBounds(70, 10, 200, 20);
		//Button Salvar
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(70, 50, 200, 20);
		btnSalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnSalvar();
			}
		});

		//Adicionar Componentes na View.
		add(btnSalvar);
		add(lbTema);
		add(txtTema);
		//Configurar Layout
		setLayout(null);
		setResizable(false);
		setVisible(true);
	}

	public void btnSalvar(){
		//Validar campo
		if(!txtTema.getText().equals("")){
			gravarTema(txtTema.getText());
			JOptionPane.showMessageDialog(null, "Tema cadastrado com sucesso!");
			dispose();
		}else {
			JOptionPane.showMessageDialog(null, "Digite o nome do tema!", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
	public void gravarTema(String lTextoTema){
		cadastrarTema.gravarTema(lTextoTema);
	}

}
