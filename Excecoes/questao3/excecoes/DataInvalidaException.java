package questao3.excecoes;

public class DataInvalidaException extends Exception{
	
	public DataInvalidaException () {
		super("Os par�metros fornecidos n�o representam uma data v�lida");
	}

}
