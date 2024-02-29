package sample;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class registration {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("REGISTRATION");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1.setBounds(176, 25, 107, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("user name");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_2.setBounds(71, 64, 67, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(166, 61, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("password");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_3.setBounds(71, 95, 67, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		p1 = new JPasswordField();
		p1.setBounds(166, 92, 86, 20);
		frame.getContentPane().add(p1);
		
		JLabel lblNewLabel_4 = new JLabel("branch");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_4.setBounds(71, 129, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"CSE", "ECE", "IT", "AIML", "DS"}));
		cb1.setBounds(166, 127, 86, 18);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_5 = new JLabel("gender");
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_5.setBounds(71, 162, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton r1 = new JRadioButton("male");
		r1.setBounds(166, 158, 53, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("female");
		r2.setBounds(234, 158, 59, 23);
		frame.getContentPane().add(r2);
		
		JLabel lblNewLabel_6 = new JLabel("city");
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_6.setBounds(71, 194, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Hyderabad", "Chennai", "Vijaywada"}));
		cb2.setBounds(166, 190, 86, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb1.getText();
				String branch=(String) cb1.getSelectedItem();
				String city=(String) cb2.getSelectedItem();
				ButtonGroup rgb=new ButtonGroup();
				rgb.add(r1);
				rgb.add(r2);
				String gender="";
				if(r1.isSelected())
				{
					gender="male";
				}
				if(r2.isSelected())
				{
					gender="female";
				}
				JOptionPane.showMessageDialog(btnNewButton, "Name "+user+"\nBranch "+branch+"\nCity "+city+"\nGender "+gender);
				
			}
		});
		btnNewButton.setBounds(163, 223, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\12.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
	}
}
