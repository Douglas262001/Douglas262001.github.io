package Exerc_01;

import javax.swing.JOptionPane;

public class Exerc_1 {
    public static void main(String[] args) {
        String nome;
        Double nota, media, soma = 0.0;
        int quantAlun, quantNotas;
        
        quantAlun = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de alunos: "));
        quantNotas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de notas por aluno: "));
        
        for(int i = 0; i < quantAlun; i++) {
            nome = JOptionPane.showInputDialog(null, "Informe o nome do aluno: ");
            soma = 0.0;
            for(int j = 0; j < quantNotas; j++){
                nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do aluno: "));
                soma += nota;
            }
            media = soma/quantNotas;
            JOptionPane.showMessageDialog(null, "O aluno " + nome + " e sua media foi " + media);
        }
    }
}
