package V;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
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
		//Janela
		setBounds(200, 200, 280, 300);
		setTitle("JF�rum 1.0 - Cadastro de Temas");
		String[] strListaTemas;
		//Criar Array de String para Popular ComboBox
		if((listaTemas != null) &&(listaTemas.length > 0)){
			strListaTemas = new String[listaTemas.length];
			for (int i=0;i<listaTemas.length;i++){
				strListaTemas[i] = listaTemas[i].getTema();
			}
		}else {
			System.out.print("Aviso: N�o � possivel adicionar uma quest�o tem Tema.\n");
			return;
		}

		//ComboBox Temas
		comboListaTemas = new JComboBox(strListaTemas);
		comboListaTemas.setBounds(50,10,100,20);
		//Label Temas
		lbTemas = new JLabel("Tema");
		lbTemas.setBounds(0,10,50,20);
		//TextArea Questao
		txtQuestao = new JTextArea("Digite sua quest�o aqui");
		txtQuestao.setLineWrap(true);
		txtQuestao.setWrapStyleWord(true);
		txtQuestao.setBounds(50, 40, 200, 60);
		//Label Questao
		lbQuestao = new JLabel("Quest�o");
		lbQuestao.setBounds(0,40,80,20);
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
		if(tTema == null){
			System.out.print("Aviso: Voc� deve selecionar um Tema!");
			return;
		}
		if(tQuestao == null){
			System.out.print("Aviso: Voc� deve digitar uma Quest�o!");
			return;
		}

		cadastrarQuestao.gravarQuestao(tTema,tQuestao);
		//for (int i=0;i<listaTemas.length;i++){
		//	System.out.println("["+(i+1)+"] "+listaTemas[i]);
		//}
		//System.out.println("\nEscolha o tema deejado:");
		//Scanner scan = new Scanner(System.in);
		//int numTema = scan.nextInt();
		//System.out.print("\nDigite sua quest�o:");
		//String questaoTxt = scan.nextLine();
		//String temaTxt = listaTemas[numTema-1].getTema();
		//cadastrarQuestao.gravarQuestao(temaTxt,questaoTxt);
	}

	public void gravarQuestao(){

	}

}
