package Escola;

import java.util.ArrayList;

public class Sala {
//	Aluno aluno;
	ArrayList<Aluno> listaAlunos;
	
	public Sala () {
		listaAlunos = new ArrayList<Aluno>();
	}
	
	void insereAluno(Aluno aluno) {
		listaAlunos.add(aluno);
	}
	
	void listarTodos() {
		for (Aluno al:listaAlunos) {
			al.listar();
			al.calculaNotas();
		}
	}
	
}