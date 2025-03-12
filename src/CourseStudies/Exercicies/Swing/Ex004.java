package CourseStudies.Exercicies.Swing;

import javax.swing.*;

public class Ex004 {
    public static void main(String[] args) {
        String nome;
        Double ganhoPorHora;
        Double HorasTrabalhadas;

        nome = JOptionPane.showInputDialog("Nome: ");
        ganhoPorHora = Double.parseDouble(JOptionPane.showInputDialog("Salario POR HORA: "));
        HorasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Quantas HORAS TRABALHADAS: "));

        JOptionPane.showMessageDialog(null, ganhoPorHora*HorasTrabalhadas*25*0.98);
    }
}
