package br.com.vagner;

public class Aula implements Comparable <Aula> {

	private String titulo;
	private int tempo;
	
	//tendo escrito acima
	//uso Ctrl + 3
	//GCUF- Construtor abaixo com os campos acima
	public Aula(String título, int tempo) {
		this.titulo = título;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " +  this.tempo + " minutos]";
	}

	@Override
	public int compareTo(Aula outraAula) {
			return this.titulo.compareTo(outraAula.titulo);
		
		}

	}


