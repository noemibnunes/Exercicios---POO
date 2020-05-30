package questao1.excecoes;


public class MesInvalidoException extends Exception{
	
	public MesInvalidoException(int mesEscolhido) {
		super("O n�mero do m�s deve estar contido no intervalo [1, 12]\n"
				+ "M�s escolhido: "+mesEscolhido);
	}

}
