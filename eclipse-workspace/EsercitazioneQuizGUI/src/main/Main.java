package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CardController;

public class Main {
	public static void main(String[] args) {
		CardController ctrl = new CardController();
		// Creazione di un JFrame
        JFrame frame = new JFrame("Quiz in inglese");

        // Creazione di un JButton
        JButton button = new JButton("Play!");
        button.setPreferredSize(new Dimension(100, 30));

    	JPanel panel = new JPanel();
    	panel.setPreferredSize(new Dimension(640, 100));
        
        frame.setLayout(new GridLayout(2, 1));
        
     // text area
        JLabel jt= new JLabel();
        
        jt.setFont(new Font("Consolas",Font.PLAIN,25));
        jt.setForeground(Color.BLUE);
        jt.setBackground(Color.BLACK);
        
        
        // Aggiunta di un ActionListener al pulsante
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Azione da eseguire quando il pulsante viene premuto
//                JOptionPane.showMessageDialog(frame, ctrl.creaRandomCard());
            	jt.setText(ctrl.creaRandomCard());
            }
        });

        panel.add(button);
        // Aggiunta del pulsante al contenuto del frame
        frame.getContentPane().add(panel);

        frame.getContentPane().add(jt);

        // Impostazione delle dimensioni del frame
        frame.setSize(640, 480);

        // Operazione di chiusura predefinita
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Rendere il frame visibile
        frame.setVisible(true);
		
	}
}
