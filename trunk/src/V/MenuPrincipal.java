package V;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import C.AppController;

public class MenuPrincipal extends JFrame{

	private AppController appController;
	private JButton cadastrarTema;
	private JButton cadastrarQuestao;
	private JButton cadastrarResposta;
	private JButton verForum;
	private JButton sair;

	public MenuPrincipal(AppController controle){
		appController = controle;

		setBounds(200, 200, 400, 350);
		setTitle("JFórum 1.0 - Menu Principal");
		//View CadastroDeTemas
		cadastrarTema = new JButton("Cadastrar Tema");
		cadastrarTema.setBounds(100, 90, 200, 20);
		//View CadastroDeQuestoes
		cadastrarQuestao = new JButton("Cadastrar Questão");
		cadastrarQuestao.setBounds(100, 130, 200, 20);
		//View TODO
		cadastrarResposta = new JButton("Cadastrar Resposta");
		cadastrarResposta.setBounds(100, 170, 200, 20);
		//View TODO
		verForum = new JButton("Visualizar Fórum");
		verForum.setBounds(100, 210, 200, 20);
		//Botão Sair
		sair = new JButton("Sair");
		sair.setBounds(100, 250, 200, 20);

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

		verForum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				appController.verForum();
			}
		});

		sair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		//Adicionar Componentes na View.
		add(cadastrarTema);
		add(cadastrarQuestao);
		add(cadastrarResposta);
		add(verForum);
		add(sair);
		//Configurar Layout
		setLayout(null);
		setResizable(false);
		setVisible(true);
	}
}