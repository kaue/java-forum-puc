package V;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
	private JButton btnVoltar;
	private JTextField txtTema;
	private JLabel lbTema;
	private JLabel lbLogo;
	
	public CadastroDeTemas(CadastrarTema controle){
		cadastrarTema = controle;
		//Janela
		//setBounds(600, 400, 320, 120);
		setBounds(600, 400, 400, 400);
		setTitle("JFórum 1.0 - Cadastro de Temas");
		
		BufferedImage img;
		try {
			img = ImageIO.read(getClass().getResource("../include/logoPuc.jpg"));
			lbLogo = new JLabel(new ImageIcon(img));
			lbLogo.setBounds(0, 0, 400, 90);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		
		
		//Label Tema
		lbTema = new JLabel("Digite um tema");
		lbTema.setBounds(160,120,150,20);
		//TextField Tema
		txtTema = new JTextField(20);
		txtTema.setBounds(75, 140, 250, 20);
		//Button Salvar
		//btnSalvar = new JButton("Salvar");
		//btnSalvar.setBounds(70, 140, 200, 20);
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
		add(btnSalvar);
		add(btnVoltar);
		add(lbTema);
		add(txtTema);
		add(lbLogo);
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
