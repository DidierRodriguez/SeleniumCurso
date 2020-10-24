package JavaBasic;

import java.util.ArrayList;
import java.util.List;

public class Metodos2 {

	static String heredar = "Mensaje de texto Heredado";

	public static List<String> listaDeNombres() {
		List<String> listaNombres = new ArrayList<>();

		listaNombres.add("Didier");
		listaNombres.add("Didier");
		listaNombres.add("Marcos");
		listaNombres.add("Carlos");
		return listaNombres;
	}

	public static List<Integer> listaNumeros() {
		List<Integer> listaNumeros = new ArrayList<>();

		listaNumeros.add(1);
		listaNumeros.add(1);
		listaNumeros.add(1);
		listaNumeros.add(6);
		listaNumeros.add(78);
		listaNumeros.add(12);

		return listaNumeros;

	}

}
