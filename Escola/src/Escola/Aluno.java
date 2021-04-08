
package Escola;

import java.util.ArrayList;

public class Aluno {
	
	
	String nome, cpf;
	int qtd;	
	float nota[];

	public Aluno(String nome, String cpf, int qtd) {
		this.nome = nome;
		this.cpf = cpf;
		this.qtd = qtd;
		this.nota = new float[qtd];
	}
	
	public Aluno(String nome) {
		System.out.println(this.nome);
//		System.out.println(this.cpf);
//		System.out.println(this.nota);
	}
	
	public void posicoes() {
		for (int i = 0 ; i<nota.length ; i++) {
			System.out.println("Passou aqui");
		}
	}
	
	public void insereNota(float nota, int pos) {
		this.nota[pos] = nota;
	}
	
	float calculaNotas() {
		
		float soma=0;
		
		for (int i=0 ; i<nota.length ; i++) {
			soma += nota[i];
		}
		
		System.out.println("Total: " + soma);
		
		return soma;	
	}
	
	public void listar() {
		System.out.println("Aluno: " + this.nome + "\ncpf: " + this.cpf);
		for (int i = 0 ; i<nota.length ; i++) {
			int j=i+1;
			System.out.println("Nota " + j + ": " + nota[i]);
		}
					
	}
	

	


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public float[] getNota() {
		return nota;
	}

	public void setNota(float[] nota) {
		this.nota = nota;
	}

	

}