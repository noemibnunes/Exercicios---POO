package Listas;

import java.util.ArrayList;
import java.util.List;

public class SistemaInterpol {
	
	List <String> procurados = new ArrayList();
	
	public void adicionarProcurado(String nome) {
		procurados.add(nome);
	}
	
	public boolean ehProcurado(String nome) {
		for (int i = 0; i < procurados.size(); i++) {
			if(procurados.contains(nome)) {
				return true;
			}
		} return false;
	}
	
	
}

