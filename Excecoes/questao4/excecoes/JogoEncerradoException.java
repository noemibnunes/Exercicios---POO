package questao4.excecoes;

public class JogoEncerradoException extends Exception {
	
	public JogoEncerradoException(char letra) {
		super("N�o � permitido tentar mais palpites, o jogo est� encerrado");
	}

}
