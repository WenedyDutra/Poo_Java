package Escola;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Aluno aluno;
		Sala sala = new Sala();
		
		int qtdpos, opc;
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Sala> sal = new ArrayList<Sala>();
		
		String Alcpf,alunos;
		float nota;

		do {
			
			System.out.println("---===MENU===---");
			System.out.println("1. Inserir");
			System.out.println("2. Listar");
			System.out.println("3. Situação");
			System.out.println("4. Sair");
			
	        opc = teclado.nextInt();
	        teclado.nextLine();
	        
			switch (opc) {
			case 1:
				System.out.println("Aluno: ");
				alunos = teclado.nextLine();
				System.out.println("CPF: ");
				Alcpf = teclado.nextLine();
				System.out.println("Quantidade de notas: ");
				qtdpos = teclado.nextInt();
				
				aluno = new Aluno(alunos, Alcpf, qtdpos);			
				sala.insereAluno(aluno);
				
				
				teclado.nextLine();
				int pos2 = 0;
				pos2 = sala.listaAlunos.size() - 1;
				
				for (int i = 0 ; i <= qtdpos-1 ; i++) {
					int j = i+1;		
					System.out.println("Nota " + j);
					nota = teclado.nextFloat();
					sala.listaAlunos.get(pos2).insereNota(nota, i);
					
				}
			
				
				break;
			case 2:
				sala.listarTodos();
				break;
				
			case 3:
				
				for (int i=0 ; i < sala.listaAlunos.size() ; i++) {
					System.out.println("Aluno: " + sala.listaAlunos.get(i).nome);
					
					if (sala.listaAlunos.get(i).calculaNotas() <= 70) {
						System.out.println("Reprovado");
					} else {
						System.out.println("Aprovado");
					}
				}
				
				break;
			case 4:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opcao inválida");
				break;				
			}
			
		} while (opc != 4);
		
	}
	
}