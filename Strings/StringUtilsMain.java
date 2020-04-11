package Strings;

public class StringUtilsMain {
	public static void main(String[] args) {
		
		System.out.println(StringUtils.formataAtributo("quantidade de questoes"));
		System.out.println("\n");
		
		System.out.println(StringUtils.formataMetodo( "get quantidade de questoes"));
		System.out.println("\n");

		System.out.println(StringUtils.formataClasse("formatador de identificadores"));
		System.out.println("\n");
		
		System.out.println(StringUtils.ordenaStrings("volkswagen", "ford"));
		System.out.println("\n");
		
		System.out.println(StringUtils.ehPalindromo("arara"));
		System.out.println("\n");
		
		System.out.println(StringUtils.transformaParaCaixaAlta("\"PhUlaNo dEtHal\""));
		System.out.println("\n");
		
		System.out.println(StringUtils.contaVogais("In God We Trust"));
		System.out.println("\n");
		
		System.out.println(StringUtils.removeEspacosSuperfluos("  Hay que endurecerse, pero sin perder la ternura jamás " ));
		System.out.println("\n");
		
		System.out.println(StringUtils.ocorrencias("O doce perguntou para o doce, qual o doce mais doce?", "doce"));
		System.out.println("\n");
				
		System.out.println(StringUtils.binarioPraDecimal("1100110011"));
		System.out.println("\n");
		
		System.out.println(StringUtils.getQtdadePalavras("programar é muito fácil"));
		System.out.println("\n");
		
		System.out.println(StringUtils.histogramaLetras("the quick brown fox jumps over the lazy dog" ));
	
	}
		
		
}

