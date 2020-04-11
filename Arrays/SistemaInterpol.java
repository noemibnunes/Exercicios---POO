package Arrays;

public class SistemaInterpol {
	String [] procurados = new String[1];
	int pos = 0;
	
	public void adicionarProcurados(String nomes) {
		nomes.split(" ");
		if(pos == procurados.length) {
    		String [] novoProcurado = new String [procurados.length + 1];	
    		for (int i = 0; i < pos; i++) {
    			novoProcurado[i] = procurados[i];
			}
    		procurados = novoProcurado;
    	}
		procurados[pos] = nomes;
		pos++;
	
	}
	
	public boolean ehProcurado(String nome) {
		for (int i = 0; i < pos; i++) {
			if(procurados[i].contains(nome)) {
				return true;
			} 
		}return false;
	}
}
