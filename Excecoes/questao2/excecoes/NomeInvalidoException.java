package questao2.excecoes;

public class NomeInvalidoException extends Exception{
	
	public NomeInvalidoException (String nome) {
		super("O nome fornecido n�o pode ser nulo ou vazio" + nome);
	}
	
	

}
