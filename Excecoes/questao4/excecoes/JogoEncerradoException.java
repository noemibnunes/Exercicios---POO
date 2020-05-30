package questao4.excecoes;

public class JogoEncerradoException extends Exception {
	
	public JogoEncerradoException(char letra) {
		super("Não é permitido tentar mais palpites, o jogo está encerrado");
	}

}
