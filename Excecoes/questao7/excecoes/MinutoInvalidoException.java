package questao7.excecoes;

public class MinutoInvalidoException extends Exception {
	public MinutoInvalidoException() {
		super ("Minutos invalidos!" + "\n" + "Os minutos informados precisam est� no intervalo entre [0,59]");
	}
}
