package CourseStudies.Exercicies.Swing;

import javax.swing.*;

public class Ex002 {
    public static void main(String[] args) {
        String nome, disciplina;

        nome = JOptionPane.showInputDialog("Nome: ");
        disciplina = JOptionPane.showInputDialog("Disciplina: ");
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota1 :"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota2 :"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Nota3 :"));
        double media = (n1 + n2 + n3)/ 3;
        JOptionPane.showMessageDialog(null, media);
    }
}
