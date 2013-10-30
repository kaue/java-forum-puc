package M;

import java.util.ArrayList;
import java.util.List;

public class Forum {

	private Tema[] listaTemas;
	
	public Forum(){
		
	}
	
	public void buscaTema(String temaTxt){
		int i = 0;
		while ((i<listaTemas.length) && !listaTemas[i].equals(temaTxt)){
			i++;
		}
		//CONTINUAR A PARTIR DAQUI
	}
	
	public Tema[] getListaTemas(){
		return listaTemas;
	}
	
	public void add(Tema tema){
		
		if (listaTemas==null){
			//lista vazia
			listaTemas = new Tema[1];
			listaTemas[0] = tema;
		} else {
			//lista com conteúdo
			Tema[] listaAuxiliar = new Tema[listaTemas.length+1];
			for (int i=0;i<listaTemas.length;i++){
				listaAuxiliar[i] = listaTemas[i];
			}
			listaAuxiliar[listaTemas.length] = tema;
			listaTemas = listaAuxiliar;
		}
		
	}
	
}
