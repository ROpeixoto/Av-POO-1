package aplicacao;
import java.util.Scanner;
import entidades.Aluno;
import entidades.Disciplina;


//Rodrigo Peixoto e Emanuele Santos
public class Main {

	public static void main(String[] args) {
		
		Disciplina disciplina = new Disciplina();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o código da disciplina:");
		String codigoDisciplina = sc.nextLine();
		disciplina.setCodigo(codigoDisciplina);
		
		System.out.println("Informe o nome da disciplina:");
		String nomeDisciplina = sc.nextLine();
		disciplina.setNome(nomeDisciplina);
		
		System.out.println("Informe o número de alunos: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			int j = 0;
			j = i+1;
			System.out.println("Informe os Dados do Aluno "+ j + ":");
			System.out.println("Matrícula: ");
			String matricula = sc.next();
			
			System.out.println("Nome: ");
			String nome = sc.next();
			
			System.out.println("Nota 1: ");
			Float nota1 = sc.nextFloat();
			
			System.out.println("Nota 2: ");
			Float nota2 = sc.nextFloat();
			
			System.out.println("Nota 3: ");
			Float nota3 = sc.nextFloat();
			
			disciplina.addAluno(new Aluno(matricula,nome,nota1,nota2,nota3));

		}
		System.out.println();
		System.out.println("Alunos Aprovados:");
		System.out.println(disciplina.mostraAprovados());
		System.out.println("Melhor Aluno:");
		System.out.println(disciplina.achaMelhor());
		sc.close();
	}

}
