package V;

import java.util.Scanner;

import C.CadastrarQuestao;
import M.Tema;

public class CadastroDeQuestoes {

	private CadastrarQuestao cadastrarQuestao;
	
	public CadastroDeQuestoes(CadastrarQuestao controle, Tema[] listaTemas){
		
		cadastrarQuestao = controle;
		
		for (int i=0;i<listaTemas.length;i++){
			System.out.println("["+(i+1)+"] "+listaTemas[i]);
		}
		System.out.println("\nEscolha o tema deejado:");
		Scanner scan = new Scanner(System.in);
		int numTema = scan.nextInt();
		System.out.print("\nDigite sua questão:");
		String questaoTxt = scan.nextLine();
		String temaTxt = listaTemas[numTema-1].getTema();
		cadastrarQuestao.gravarQuestao(temaTxt,questaoTxt);
	}
	
	public void gravarQuestao(){
		
	}

}
