package CourseStudies.Exercicies.Swing;


import javax.swing.*;
public class Ex001 {

    public static void main(String[] args) {
        String nome, endereco, bairro, cidade, estado;

        nome = JOptionPane.showInputDialog("Digite seu nome:");
        endereco = JOptionPane.showInputDialog("Digite seu endereco:");
        bairro = JOptionPane.showInputDialog("Digite seu bairro:");
        cidade = JOptionPane.showInputDialog("Digite sua cidade:");
        estado = JOptionPane.showInputDialog("Digite seu estado:");

        JOptionPane.showMessageDialog(null, "nome: "+ nome + " endereco: " + endereco + " bairro: " + cidade + " estado: " + estado);
    }
}
