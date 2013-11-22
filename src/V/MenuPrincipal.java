package V;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import C.AppController;

public class MenuPrincipal extends JFrame{

	private AppController appController;
	private JLabel lbLogo;
	private JButton cadastrarTema;
	private JButton cadastrarQuestao;
	private JButton cadastrarResposta;
	private JButton consultarForum;
	private JButton sair;

	public MenuPrincipal(AppController controle) throws IOException{
		appController = controle;
		
		//Janela
		setBounds(600, 400, 400, 400);
		setTitle("JFórum 1.0 - Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Logo PUC	
		BufferedImage img = ImageIO.read(getClass().getResource("../include/logoPuc.jpg"));	
		lbLogo = new JLabel(new ImageIcon(img));
		lbLogo.setBounds(0, 0, 400, 90);
		
		//View CadastroDeTemas
		cadastrarTema = new JButton(new ImageIcon(getClass().getResource("../include/btnTema.png")));
		cadastrarTema.setBounds(0, 90, 128, 128);
		cadastrarTema.setOpaque(false);
		cadastrarTema.setContentAreaFilled(false);
		cadastrarTema.setBorderPainted(false);
		//View CadastroDeQuestoes
		cadastrarQuestao = new JButton(new ImageIcon(getClass().getResource("../include/btnPergunta.png")));
		cadastrarQuestao.setBounds(128, 90, 128, 128);
		cadastrarQuestao.setOpaque(false);
		cadastrarQuestao.setContentAreaFilled(false);
		cadastrarQuestao.setBorderPainted(false);
		//View CadastroDeRespostas
		cadastrarResposta = new JButton(new ImageIcon(getClass().getResource("../include/btnResposta.png")));
		cadastrarResposta.setBounds(256, 90, 128, 128);
		cadastrarResposta.setOpaque(false);
		cadastrarResposta.setContentAreaFilled(false);
		cadastrarResposta.setBorderPainted(false);
		//View ConsultaDoForum
		consultarForum = new JButton(new ImageIcon(getClass().getResource("../include/btnForum.png")));
		consultarForum.setBounds(0, 218, 128, 128);
		consultarForum.setOpaque(false);
		consultarForum.setContentAreaFilled(false);
		consultarForum.setBorderPainted(false);
		//Botão Sair
		sair = new JButton(new ImageIcon(getClass().getResource("../include/btnSair.png")));
		sair.setBounds(128, 218, 128, 128);
		sair.setOpaque(false);
		sair.setContentAreaFilled(false);
		sair.setBorderPainted(false);	
		
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