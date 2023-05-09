package Poo.Disciplinas;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String nome;
	private int idade;
	private String faculdade;
	
	List<Disciplinas> disciplinas = new ArrayList<Disciplinas>();
	
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
	public String getFaculdade() {
		return faculdade;
	}
	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}
	
	public List<Disciplinas> getDiciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(List<Disciplinas>disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public double calcularMedia() {
		double somaNotas = 0.0;
		for(Disciplinas disciplinas : disciplinas) {
			somaNotas += disciplinas.getNota();
		}
		return somaNotas / disciplinas.size();
	}
	
	public String situacaoAluno() {
		String situacao;
		if(calcularMedia() >= 7.0) {
			situacao = "Aprovado";
		}else {
			situacao = "Reprovado";
		}
		return situacao;
	}
	
	@Override
	public String toString() {
		return "Aluno :" + nome + ", Nota :" + calcularMedia() + ", situacao :" + situacaoAluno()+ "]";
	}
	
	
	
	
	
}
