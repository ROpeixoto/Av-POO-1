package entidades;
import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String codigo;
	private String nome;
	private ArrayList<Aluno> aluno = new ArrayList<>();
	
	public Aluno achaMelhor() {
		Aluno melhor = aluno.get(0);
		for(Aluno i : aluno) {
			if (i.calculaMedia() > melhor.calculaMedia()) {
			melhor = i;
		}}
		return melhor;
	}
	
	public List<Aluno> mostraAprovados() {
		ArrayList<Aluno> aprovado = new ArrayList<>();
		for(Aluno i : aluno) {
			if(i.calculaMedia()>= 7) {
				aprovado.add(i);
			}
		}
		return aprovado;
	}
	
	public void addAluno(Aluno aluno){
		this.aluno.add(aluno);
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Aluno> getAluno() {
		return aluno;
	}
	public void setAluno(ArrayList<Aluno> aluno) {
		this.aluno = aluno;
	}
	
	
}
