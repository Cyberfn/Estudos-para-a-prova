import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Alunos a = new Alunos();
		
		System.out.println("Digite o nome do aluno:");
		a.setNome(sc.next());
	
		System.out.println("Digite a idade do aluno:");
		a.setIdade(sc.nextInt());
		
		System.out.println("Digite a faculdade do aluno:");		
		a.setFacul(sc.next());
		
		Disciplinas disciplina1 = new Disciplinas();
		
		System.out.println("Digite o nome da disciplina:");
		disciplina1.setDisciplinas(sc.next());
		System.out.println("Digite a nota:");
		disciplina1.setNote(sc.nextDouble());
		
		Disciplinas disciplina2 = new Disciplinas();	
		
		System.out.println("Digite o nome da disciplina:");
		disciplina2.setDisciplinas(sc.next());
		System.out.println("Digite a nota:");
		disciplina2.setNote(sc.nextDouble());
		
		Disciplinas disciplinas3 = new Disciplinas();
		
		System.out.println("Digite o nome da disciplina:");
		disciplinas3.setDisciplinas(sc.next());
		System.out.println("Digite a nota:");
		disciplinas3.setNote(sc.nextDouble());
		
		sc.close();
		
	}

}
