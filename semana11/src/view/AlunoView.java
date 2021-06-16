//Alunos Louise Félix Laclau e Fabrício Valladares Bertolini
package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import bo.Aluno;
import controller.AlunoController;

public class AlunoView extends JFrame implements ActionListener {
    private JFrame frame;
    
    private JPanel panel;

    private JLabel lblTitle;
    private JButton btnInsert;
    private JButton btnUpdate;
    private JButton btnDelete;
    private JButton btnRead;
   
	public void create()
	{
		/*
		Scanner in = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Entre com a matricula: ");
		aluno.setMatricula(in.next());
		
		System.out.println("Entre com o nome: ");
		aluno.setNome(in.next());
		
		System.out.println("Entre com a cidade: ");
		aluno.setCidade(in.next());
		
		AlunoController controller = new AlunoController();
		controller.create(aluno);
		
		in.close();
		*/
	}
	
	public void read()
	{
		AlunoController controller = new AlunoController();

		System.out.println("Listagem de alunos");
		System.out.println("******************");
		
		for(Aluno aluno:controller.read())
		{
			System.out.println("Aluno matricula: " + aluno.getMatricula());
			System.out.println("Aluno nome: " + aluno.getNome());
			System.out.println("Aluno cidade: " + aluno.getCidade());
			System.out.println("-------------------------------------");
		}
	}
	
	public AlunoView()
	{
        frame = new JFrame();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));
        
        lblTitle = new JLabel("CRUD");
        lblTitle.setFont(new Font("Verdana", Font.BOLD, 20));
        panel.add(lblTitle);
        
        btnInsert = new JButton("Insert");
        btnInsert.addActionListener(this);
        
        btnUpdate = new JButton("Update");
        btnUpdate.addActionListener(this);
        
        btnDelete = new JButton("Delete");
        btnDelete.addActionListener(this);
        
        btnRead = new JButton("Read");
        btnRead.addActionListener(this);
        
   
        panel.add(btnInsert);
        panel.add(btnUpdate);
        panel.add(btnRead);
        panel.add(btnDelete);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("CRUD");
        frame.setSize(300,300);
        //frame.pack();
        frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		try 
		{
			if(e.getActionCommand().equalsIgnoreCase("insert"))
			{
				new InsertFrame();
				frame.dispose();
			}
			else if (e.getActionCommand().equalsIgnoreCase("delete"))
			{
				new DeleteFrame();
				frame.dispose();
			}
			else if (e.getActionCommand().equalsIgnoreCase("update"))
			{
				new UpdateFrame();
				frame.dispose();
			}
			else if (e.getActionCommand().equalsIgnoreCase("read"))
			{
				new Read();
				frame.dispose();
			}	
		}
		catch (Exception e2)
		{
			System.out.println(e2);
		}
	}
	
	public static void main(String[] args) {
		new AlunoView();
		
		/*System.out.println("Qual ação do CRUD?");
		Scanner in = new Scanner(System.in);
		
		String resposta = in.next();
		
		if (resposta.equalsIgnoreCase("c"))
			crud.create();
		else if (resposta.equalsIgnoreCase("u"))
			crud.update();
		else if (resposta.equalsIgnoreCase("r"))
			crud.read();
		else
			crud.delete();
		in.close();*/
	}


}
