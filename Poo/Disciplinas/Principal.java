package Poo.Disciplinas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Aluno a = new Aluno();

		System.out.println("Informe seu nome:");
		a.setNome(sc.nextLine());

		System.out.println("Informe a idade do aluno:");
		a.setIdade(sc.nextInt());

		System.out.println("Informe a faculdade do aluno:");
		a.setFaculdade(sc.next());

		Disciplinas disciplinas1 = new Disciplinas();
		disciplinas1.setDiciplina("Banco de Dados");
		disciplinas1.setNota(9);

		Disciplinas disciplinas2 = new Disciplinas();
		disciplinas2.setDiciplina("Progarmação");
		disciplinas2.setNota(8);

		Disciplinas disciplinas3 = new Disciplinas();
		disciplinas3.setDiciplina("Compiladores");
		disciplinas3.setNota(10);

		a.getDiciplinas().add(disciplinas1);
		a.getDiciplinas().add(disciplinas2);
		a.getDiciplinas().add(disciplinas3);

		System.out.println(a.toString());
		
	}

}
