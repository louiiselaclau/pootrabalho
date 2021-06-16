package view;

import bo.Aluno;
import controller.AlunoController;

public class Read{
	public Read()
	{
		AlunoController controller = new AlunoController();

		System.out.println("Listagem de alunos");
		System.out.println("******************");
		
		for(Aluno aluno:controller.read())
		{
			System.out.println("Aluno matricula: " + aluno.getMatricula());
			System.out.println("Aluno nome: " + aluno.getNome());
			System.out.println("Aluno cidade: " + aluno.getCidade());
			System.out.println("-------------------------------------");
		}
	}
}
