package VotingSystem;

import java.awt.*;
import javax.swing.*;

public class VotingSystem extends JFrame {
	
	VotingSystem(){
		setBounds(0,0,1366,768);
		getContentPane().setBackground(Color.lightGray);
		
		JLabel l1 = new JLabel("Welcome to");
		l1.setFont(new Font("Tahoma",Font.BOLD,50));
		l1.setBounds(150, 230, 300, 100);
		getContentPane().add(l1);
		
		JLabel l2 = new JLabel("Online Voting System");
		l2.setFont(new Font("Tahoma",Font.BOLD,50));
		l2.setBounds(50, 300, 700, 100);
		getContentPane().add(l2);
		
//		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("F:\\Voting System\\Online_Voting_System\\src\\icon"));
//		JLabel l3 = new JLabel(i1);
//		l3.setBounds(800, 300, 300, 100);
//		add(l3);
		
		JButton b1 = new JButton("Next");
		b1.setBackground(new Color(0, 206, 209));
		b1.setFont(new Font("Tahoma", Font.BOLD, 24));
		b1.setBounds(250, 500, 300, 80);
		getContentPane().add(b1);
		
		
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("F:\\DATA Usage\\Tkinter tutorial\\vote.jfif"));
		lblNewLabel.setBounds(760, 230, 249, 253);
		getContentPane().add(lblNewLabel);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new VotingSystem();

	}
}
