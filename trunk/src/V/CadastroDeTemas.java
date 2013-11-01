package V;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;

import C.CadastrarTema;
import C.AppController;

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
		setBounds(200, 200, 300, 120);
		setTitle("JFórum 1.0 - Cadastro de Temas");
		//Label Tema
		lbTema = new JLabel("Tema:");
		lbTema.setBounds(0,10,100,20);
		//TextField Tema
		txtTema = new JTextField(20);
		txtTema.setBounds(50, 10, 200, 20);
		//Button Salvar
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(50, 50, 200, 20);
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
		}else {
			System.out.print("Aviso: Nao e possivel adicionar um tema sem nome.\n");
		}
	}
	public void gravarTema(String lTextoTema){
		cadastrarTema.gravarTema(lTextoTema);
	}

}
