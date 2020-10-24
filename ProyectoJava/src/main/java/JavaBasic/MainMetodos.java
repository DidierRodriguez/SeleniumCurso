package JavaBasic;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MainMetodos extends Metodos2 {

	public static void main(String[] args) {

		Metodos nombreObjeto = new Metodos();
		Metodos nombreObjeto2 = new Metodos(9, 3);
		Metodos2 objeto = new Metodos2();

		System.out.println("Sumatoria");
		System.out.println(nombreObjeto2.sumatoria());
		System.out.println("Metodo Inicializado en 0");
		System.out.println(nombreObjeto.sumatoria());
		System.out.println("Texto heredado de Metodo2: " + heredar);

		nombreObjeto.mostrarMensaje();

		String elementoGuardado = nombreObjeto.mostrarNombre("Didier");
		System.out.println(elementoGuardado);

		Metodos.prueba();

		List<String> listaNombres = listaDeNombres();
		List<Integer> listaNumeros = listaNumeros();

		for (String nombre : listaNombres) {
			System.out.println(nombre);
		}

		for (int indice = 0; indice < listaNombres.size(); indice++) {
			System.out.println(listaNombres.get(indice));

		}
		System.out.println("For con Index");

		for (int numero : listaNumeros) {
			System.out.println(numero);
		}

		List<String> NombresSinElementosDuplicados = listaNombres.stream().distinct().collect(Collectors.toList());
		Collections.sort(NombresSinElementosDuplicados);
		System.out.println(NombresSinElementosDuplicados);
		Collections.sort(NombresSinElementosDuplicados, Collections.reverseOrder());
		System.out.println(NombresSinElementosDuplicados);

		System.out.println(Collections.max(listaNumeros));
		System.out.println(Collections.min(listaNumeros));
		Collections.sort(listaNumeros);
		System.out.println(listaNumeros);
		Collections.sort(listaNumeros, Collections.reverseOrder());
		System.out.println(listaNumeros);

		// Codigo para eliminar elementos duplicados de una lista, iterando la lista;
		// Code to delete elements from a list;

		Object last = null;
		int numCount = 0;
		Iterator<Integer> i = listaNumeros.iterator();

		while (i.hasNext()) {
			Object temp = i.next();
			if (temp.equals(last)) {
				i.remove();
				numCount++; // numCount = numCount + 1;
			} else {
				last = temp;
			}
		}
		System.out.println("Repeating Number Counter: " + numCount);
		System.out.println("Number list without repeating: " + listaNumeros);
	}
}
