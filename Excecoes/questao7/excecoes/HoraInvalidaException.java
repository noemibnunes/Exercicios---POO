package questao7.excecoes;

public class HoraInvalidaException extends Exception{
	public HoraInvalidaException() {
		super ("Hora invalida!" + "\n" +  "A hora informada precisa está no intervalo entre [0,23]");
	}

}
