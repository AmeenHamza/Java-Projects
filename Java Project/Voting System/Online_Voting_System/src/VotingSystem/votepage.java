package VotingSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Image;

import javax.swing.*;
public class votepage extends JFrame implements ActionListener{
	    JButton b1,b2,b3,b4,b5;
	    int a,b,c,d;
	    private JLabel lblNewLabel_4;
	    private JLabel lblNewLabel_1;
	    private JLabel lblNewLabel_3;
	    private JLabel lblNewLabel_2;
	    private JLabel lblNewLabel;
	
	votepage(){
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(""));
		Image i2 = i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource(""));
		Image i5 = i4.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);

		ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource(""));
		Image i8 = i7.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
		ImageIcon i9 = new ImageIcon(i8);

		ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource(""));
		Image i11 = i10.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
		ImageIcon i12 = new ImageIcon(i11);
		JLabel l4 = new JLabel(i12);
		getContentPane().add(l4);
		
		b1=new JButton("PTI");
		b1.addActionListener(this);
		b1.setBounds(120,260,150,50);
		b1.setForeground(Color.BLUE);
		getContentPane().add(b1);
		
		b2=new JButton("PMLN");
		b2.addActionListener(this);
		b2.setBounds(835,260,150,50);
		b2.setForeground(Color.BLUE);
		getContentPane().add(b2);
		
		b3=new JButton("Jamat-e-Islami");
		b3.addActionListener(this);
		b3.setBounds(120,560,150,50);
		b3.setForeground(Color.BLUE);
		getContentPane().add(b3);
		
		b4=new JButton("Result");
		b4.addActionListener(this);
		b4.setBounds(500,260,150,50);
		b4.setForeground(Color.RED);
		getContentPane().add(b4);
		
		b5=new JButton("PPP");
		b5.addActionListener(this);
		b5.setBounds(835,560,150,50);
		b5.setForeground(Color.BLUE);
		getContentPane().add(b5);
		
		
		
		setBounds(0,0,1034,700);
		getContentPane().setBackground(Color.lightGray);
		getContentPane().setForeground(Color.RED);
		getContentPane().setLayout(null);
		
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("F:\\DATA Usage\\Tkinter tutorial\\vote.jfif"));
		lblNewLabel_4.setBounds(470, 69, 210, 180);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\DATA Usage\\Tkinter tutorial\\download1.jfif"));
		lblNewLabel_1.setBounds(89, 50, 223, 199);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("F:\\DATA Usage\\Tkinter tutorial\\download.jfif"));
		lblNewLabel_3.setBounds(89, 332, 223, 217);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("F:\\DATA Usage\\Tkinter tutorial\\download3.jfif"));
		lblNewLabel_2.setBounds(800, 350, 210, 199);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("F:\\DATA Usage\\Tkinter tutorial\\download2.jfif"));
		lblNewLabel.setBounds(800, 50, 210, 199);
		getContentPane().add(lblNewLabel);
		setVisible(true);
	}

	public static void main(String[] args) {
		new votepage();
	}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1) {
				a=a+1;
				JOptionPane.showInternalMessageDialog(null,"Your Vote is added to PTI");
			}
			if(e.getSource()==b2) {
				b=b+1;
				JOptionPane.showInternalMessageDialog(null,"Your Vote is added to PMLN");
			}
			if(e.getSource()==b3) {
				c=c+1;
				JOptionPane.showInternalMessageDialog(null,"Your Vote is added to Jamat-e-Islami");
			}
			if(e.getSource()==b5) {
				d=d+1;
				JOptionPane.showInternalMessageDialog(null,"Your Vote is added to PPP");
			}
			if(e.getSource()==b4) {
				JOptionPane.showInternalMessageDialog(null,"PTI= "+a+" PMLN= "+b+" Jamat-e-Islami= "+c+" PPP= "+d);
			}
	}
}
