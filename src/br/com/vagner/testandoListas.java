package br.com.vagner;

import java.util.ArrayList;
import java.util.Collections;

public class testandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		// método de adição de elementos .add
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		// método de remoção elementos
		aulas.remove(0);

		System.out.println(aulas);

		// Percorrendo uma lista/Arraylist
		// Listando os elementos da lista
		for (String aula : aulas) { // usando foreach(palavra chave)
			System.out.println("Aula: " + aula);

			// usando método .get
		String primeiraAula = aulas.get(0); //retorna  nome  elemento correspondente ao indice
			System.out.println("A primeira aula é " + primeiraAula);

		for (int i = 0; i < aulas.size(); i++) {
				System.out.println("aula: " + aulas.get(i));

			// método .forEach
//		aulas.forEach(aula -> {
//					System.out.println("percorrendo: " + aula);
//				});
		
		aulas.add("Aumentando nosso conhecimento");		
		Collections.sort(aulas);
			}
		}
	}

}
