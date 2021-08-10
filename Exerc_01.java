package Exerc_01;

import javax.swing.JOptionPane;

public class Exerc_01 {
	public static void main(String[] args) {
		int alunosQuant, notasQuant;
		double notaAluno,mediaNotas,somaNotas = 0.00;
		
		alunosQuant = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Alunos: "));
		
		for(int i = 0; i <= alunosQuant; i++) {
		
		  notasQuant  = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Notas do Aluno: "));
		  
		    for (int j = 0; j <= notasQuant; j++) {
				
				notaAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno: "));
				somaNotas += notaAluno;
				mediaNotas = somaNotas/notasQuant;
				
			}
		}
	}
}