package Arrays;

public class SistemaInterpolMain {
	public static void main(String[] args) {
		
		SistemaInterpol procurados = new SistemaInterpol();
		
		procurados.adicionarProcurados("Phulano Syckrano Bheltranno");
		System.out.println(procurados.ehProcurado("Bheltranno"));
		System.out.println(procurados.ehProcurado("Fulano"));

	}

}
