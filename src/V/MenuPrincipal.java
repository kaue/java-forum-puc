package V;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import C.AppController;

public class MenuPrincipal extends JFrame{

	private AppController appController;
	private ImageIcon img;
	private JLabel lbLogo;
	private JButton cadastrarTema;
	private JButton cadastrarQuestao;
	private JButton cadastrarResposta;
	private JButton consultarForum;
	private JButton sair;

	public MenuPrincipal(AppController controle) throws IOException{
		appController = controle;

		setBounds(600, 400, 400, 350);
		setTitle("JFórum 1.0 - Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		BufferedImage img = ImageIO.read(getClass().getResource("../include/logoPuc.jpg"));
		
		//Logo PUC
		lbLogo = new JLabel(new ImageIcon(img));
		lbLogo.setBounds(0, 0, 400, 90);
		
		//BufferedImage img = ImageIO.read(getClass().getResource("../include/logoPuc.jpg"));
		
		//View CadastroDeTemas
		//cadastrarTema = new JButton(new ImageIcon(getClass().getResource("../include/btnResposta.png")));
		cadastrarTema = new JButton("Cadastrar Tema");
		cadastrarTema.setBounds(100, 90, 200, 20);
		//cadastrarTema.setOpaque(false);
		//cadastrarTema.setContentAreaFilled(false);
		//cadastrarTema.setBorderPainted(false);
		//View CadastroDeQuestoes
		cadastrarQuestao = new JButton("Cadastrar Questão");
		cadastrarQuestao.setBounds(100, 150, 200, 20);
		//View TODO
		cadastrarResposta = new JButton("Cadastrar Resposta");
		cadastrarResposta.setBounds(100, 190, 200, 20);
		//View TODO
		consultarForum = new JButton("Consultar Fórum");
		consultarForum.setBounds(100, 230, 200, 20);
		//Botão Sair
		sair = new JButton("Sair");
		sair.setBounds(100, 270, 200, 20);

		cadastrarTema.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				appController.cadastrarTema();
			}
		});

		cadastrarQuestao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				appController.cadastrarQuestao();
			}
		});

		cadastrarResposta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				appController.cadastrarResposta();
			}
		});

		consultarForum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				appController.consultarForum();
			}
		});

		sair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		//Adicionar Componentes na View.
		add(lbLogo);
		add(cadastrarTema);
		add(cadastrarQuestao);
		add(cadastrarResposta);
		add(consultarForum);
		add(sair);
		//Configurar Layout
		setLayout(null);
		setResizable(false);
		setVisible(true);
	}
}