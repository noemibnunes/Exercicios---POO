package Listas;

import java.util.ArrayList;
import java.util.List;

public class ListaMathUtilsMain {
	public static void main(String[] args) {
		
		List<Double> numeros = new ArrayList();
		numeros.add(12.4);
		numeros.add(43.1);
		numeros.add(4.3);
		numeros.add(54.0);
		numeros.add(6.7);

		System.out.println(ListaMathUtils.calculaDivisores(12));
		System.out.println(ListaMathUtils.computaMaior(numeros));
		System.out.println(ListaMathUtils.computaMenor(numeros));
		System.out.println(ListaMathUtils.computaMedia(numeros));
		System.out.println(ListaMathUtils.temNumRepetido(numeros));
	}

}
