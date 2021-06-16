package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import bo.Aluno;
import controller.AlunoController;

public class InsertFrame extends JFrame implements ActionListener{
    private JFrame frame;
    private JPanel panel;

    private JLabel lblTitle;
    
    private JTextField lblMatricula;
    private JTextField lblNome;
    private JTextField lblCidade;
    
    private JLabel lblTxt1;
    private JLabel lblTxt2;
    private JLabel lblTxt3;
    
    private JButton btnSend;
    
    public InsertFrame()
    {
		frame = new JFrame();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("CRUD");
        frame.setSize(800,900);
        
        lblTitle = new JLabel("Insert");
        lblTitle.setFont(new Font("Verdana", Font.BOLD, 20));
        panel.add(lblTitle);
        
        lblTxt1 = new JLabel("Matricula:");
        panel.add(lblTxt1);
        lblMatricula = new JTextField();
        panel.add(lblMatricula);
        
        lblTxt2 = new JLabel("Nome:");
        panel.add(lblTxt2);
        lblNome = new JTextField();
        panel.add(lblNome);
        
        lblTxt3 = new JLabel("Cidade:");
        panel.add(lblTxt3);
        lblCidade = new JTextField();
        panel.add(lblCidade);
        
        btnSend = new JButton("Send");
        btnSend.addActionListener(this);
        panel.add(btnSend);
        
        frame.pack();
        frame.setVisible(true);
    }

	public void actionPerformed(ActionEvent e) {
		Aluno aluno = new Aluno();
		AlunoController crud = new AlunoController();
		
		aluno.setMatricula(lblMatricula.getText());
		aluno.setNome(lblNome.getText());
		aluno.setCidade(lblCidade.getText());

		crud.create(aluno);	
	}
}
