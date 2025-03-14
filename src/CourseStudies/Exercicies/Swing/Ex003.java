package CourseStudies.Exercicies.Swing;

import javax.swing.*;

public class Ex003 {
    public static void main(String[] args) {
        String nome;
        String cargo;
        Double salario;

        nome = JOptionPane.showInputDialog("Nome: ");
        cargo = JOptionPane.showInputDialog("Cargo: ");
        salario = Double.parseDouble(JOptionPane.showInputDialog("Salario: "));

        JOptionPane.showMessageDialog(null, salario*1.05);
    }
}
