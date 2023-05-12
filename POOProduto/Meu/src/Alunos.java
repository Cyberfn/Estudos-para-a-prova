import java.util.ArrayList;
import java.util.List;

public class Alunos {

	private String nome;
	private int idade;
	private String facul;
	
	List<Disciplinas> diciplinas = new ArrayList<Disciplinas>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getFacul() {
		return facul;
	}

	public void setFacul(String facul) {
		this.facul = facul;
	}

	public List<Disciplinas> getDiciplinas() {
		return diciplinas;
	}

	public void setDiciplinas(List<Disciplinas> diciplinas) {
		this.diciplinas = diciplinas;
	}

	@Override
	public String toString() {
		return "Alunos [Nome:" + nome + ", Idade:" + idade + ", Facul:" + facul + ", Diciplinas:" + diciplinas + "]";
	}
	
	
	
}
