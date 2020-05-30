package questao1.excecoes;

public class Mes {
	private int numero;

	public Mes(int numero) throws MesInvalidoException {
		if (numero < 0 || numero > 12) {
			throw new MesInvalidoException(numero);
		}
		this.numero = numero;
	}

	public String getNome() {
		String nome = null;
		switch (numero) {
		case 1:
			nome = "janeiro";
			break;
		case 2:
			nome = "fevereiro";
			break;
		case 3:
			nome = "mar�o";
			break;
		case 4:
			nome = "abril";
			break;
		case 5:
			nome = "maio";
			break;
		case 6:
			nome = "junho";
			break;
		case 7:
			nome = "julho";
			break;
		case 8:
			nome = "agosto";
			break;
		case 9:
			nome = "setembro";
			break;
		case 10:
			nome = "outubro";
			break;
		case 11:
			nome = "novembro";
			break;
		case 12:
			nome = "dezembro";
			break;
		}
		return nome;
	}
	
	/*  RESPOSTAS DAS QUEST�ES TE�RICAS
	 
	 * 1) Try e Catch
	   No try se coloca o trecho do c�digo que pode lan�ar uma exce��o
	   No catch � colocado o c�digo que manipula a exce��o, ou seja, acontece o tratamento do erro 
	   Tamb�m existe o finally, que � sempre executado ap�s o try ou catch, � mais utilizado com arquivos (abertura e leitura)
	   
	   2) Checada - S�o subclasses de Exception, obriga o desenvolvedor a trat�-la, fazer a captura e o tratamento da exce��o
	      N�o checada - S�o subclasses de RuntimeException, acontece em tempo de execu��o, e o tratamento da exce��o � opcional
	      
	   3) Checadas herdam os metodos de Throwable, e podemos criar uma classe de exce��o. Basta criar uma classe com o nome da
	   exce��o e usar o extends Exception. As n�o checadas voc� herda os metodos de RuntimeException.
	   
	   4) N�o, pois elas s�o muito gen�ricas, n�o consegue fazer um tratamento adequado para exce��o. 
	 *  */
	
}