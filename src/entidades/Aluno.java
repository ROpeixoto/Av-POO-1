package entidades;

public class Aluno {
	private String matricula;
	private String nome;
	private Float nota1;
	private Float nota2;
	private Float nota3;
	private Float media;
	
	public Aluno(String matricula, String nome, Float nota1, Float nota2, Float nota3) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.media = calculaMedia();
	}

	public Float calculaMedia() {
		media = (nota1+nota2+nota3)/3;
		return media;
		
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getNota1() {
		return nota1;
	}
	public void setNota1(Float nota1) {
		this.nota1 = nota1;
	}
	public Float getNota2() {
		return nota2;
	}
	public void setNota2(Float nota2) {
		this.nota2 = nota2;
	}
	public Float getNota3() {
		return nota3;
	}
	public void setNota3(Float nota3) {
		this.nota3 = nota3;
	}
	public Aluno() {
		
	}

	public String toString() {
		return "Matrícula = "+ matricula + " - Nome = " + nome + " - Média = " + media;
			
	}
	
}
