package questao6.excecoes;

public class ValorMinimoParcelaException extends Exception{
	
	public ValorMinimoParcelaException () {
		super ("O valor da parcela � menor que o m�nimo");
	}
}
