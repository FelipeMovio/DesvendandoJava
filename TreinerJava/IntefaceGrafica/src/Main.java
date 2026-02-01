import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Criar a janela principal
        JFrame janela = new JFrame("Exemplo Swing");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setBounds(500,80,400,600);
        janela.setLayout(new BorderLayout());

        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Componentes
        JLabel label = new JLabel("Digite seu nome:");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Enviar");
        JLabel resultado = new JLabel("");

        // Adicionar ação ao botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textField.getText();
                resultado.setText("Olá, " + nome + "! Bem-vindo(a) ao Swing!");
            }
        });

        // Adicionar componentes ao painel
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(resultado);

        // Adicionar painel à janela
        janela.add(panel, BorderLayout.CENTER);

        // Exibir a janela
        janela.setVisible(true);
    }
}
