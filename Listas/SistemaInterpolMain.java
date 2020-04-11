package Listas;

public class SistemaInterpolMain {
	
	public static void main(String[] args) {
			
		SistemaInterpol procurado = new SistemaInterpol();
		
		procurado.adicionarProcurado("Phulano");
		procurado.adicionarProcurado("Syckrano");
		procurado.adicionarProcurado("Bheltranno");
		
		System.out.println(procurado.ehProcurado("Fulano"));
	}
	
	

}
//List <String> procurados = new ArrayList();
//
//procurados.add("Fulano");
//procurados.add("Syckrano");
//procurados.add("Bheltranno");