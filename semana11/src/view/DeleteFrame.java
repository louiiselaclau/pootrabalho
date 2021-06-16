package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controller.AlunoController;

public class DeleteFrame extends JFrame implements ActionListener{
    private JFrame frame;
    private JPanel panel;

    private JLabel lblTitle;
    
    private JTextField lblMatricula;
    
    private JLabel lblTxt1;
    
    private JButton btnSend;
    
    public DeleteFrame()
    {
		frame = new JFrame();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("CRUD");
        frame.setSize(800,900);
        
        lblTitle = new JLabel("Delete");
        lblTitle.setFont(new Font("Verdana", Font.BOLD, 20));
        panel.add(lblTitle);
        
        lblTxt1 = new JLabel("Matricula para deletar:");
        panel.add(lblTxt1);
        lblMatricula = new JTextField();
        panel.add(lblMatricula);
        
        btnSend = new JButton("Send");
        btnSend.addActionListener(this);
        panel.add(btnSend);
        
        frame.pack();
        frame.setVisible(true);
    }

	public void actionPerformed(ActionEvent e) {
		AlunoController crud = new AlunoController();
		
		crud.delete(lblMatricula.getText());
	}
}
