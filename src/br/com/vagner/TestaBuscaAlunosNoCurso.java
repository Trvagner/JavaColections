package br.com.vagner;

//implantando o HashMap
public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Paulo Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 34561);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem é o aluno com matricula 5617?");
		//na classe Curso implemente HashMap nos atributos
		//altere também o método de buscaMatriculado.
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		
		System.out.println("aluno: " + aluno);
	}
}
