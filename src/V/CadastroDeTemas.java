package V;

import java.util.Scanner;

import C.CadastrarTema;

public class CadastroDeTemas {

	private CadastrarTema cadastrarTema;
	
	private String temaTxt;
	
	public CadastroDeTemas(CadastrarTema controle){
		cadastrarTema = controle;
		System.out.print("Digite o nome do novo tema:");
		Scanner scan = new Scanner(System.in);
		temaTxt = scan.nextLine();
		gravarTema();
	}
	
	public void gravarTema(){
		cadastrarTema.gravarTema(temaTxt);
	}
	
}
