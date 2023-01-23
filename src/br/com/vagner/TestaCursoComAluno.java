package br.com.vagner;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Paulo Silveira", 34571);
		Aluno a3 = new Aluno("Mauricio Aniche", 34561);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os alunos matriculados: ");
		//forEach para iterar e mostrar os alunos matriculados
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		//criando novo aluno, testar método equals/hashCode
		Aluno turini = new Aluno("Rodrigo Turini", 34762);
		System.out.println("E esse Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O a1 é equals ao Turini?");
		System.out.println(a1.equals(turini));
		
		//obrigatoriamente o seguinte é true
		
		System.out.println(a1.hashCode() == turini.hashCode());
		
		System.out.println("O aluno " + a1.getNome() + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		System.out.println("----------------------");
		// outras formas mais antigas de iterar
		for(Aluno a : javaColecoes.getAlunos()) {
			System.out.println(a);
		}
		System.out.println("----------------------2");
		//método Iterator...mais antiga
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador =alunos.iterator();
		
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		//Vector<Aluno> vetor = new Vector<>();...antes das Collections
		
	}
}
