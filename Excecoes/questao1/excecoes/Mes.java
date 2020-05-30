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
			nome = "março";
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
	
	/*  RESPOSTAS DAS QUESTÕES TEÓRICAS
	 
	 * 1) Try e Catch
	   No try se coloca o trecho do código que pode lançar uma exceção
	   No catch é colocado o código que manipula a exceção, ou seja, acontece o tratamento do erro 
	   Também existe o finally, que é sempre executado após o try ou catch, é mais utilizado com arquivos (abertura e leitura)
	   
	   2) Checada - São subclasses de Exception, obriga o desenvolvedor a tratá-la, fazer a captura e o tratamento da exceção
	      Não checada - São subclasses de RuntimeException, acontece em tempo de execução, e o tratamento da exceção é opcional
	      
	   3) Checadas herdam os metodos de Throwable, e podemos criar uma classe de exceção. Basta criar uma classe com o nome da
	   exceção e usar o extends Exception. As não checadas você herda os metodos de RuntimeException.
	   
	   4) Não, pois elas são muito genéricas, não consegue fazer um tratamento adequado para exceção. 
	 *  */
	
}