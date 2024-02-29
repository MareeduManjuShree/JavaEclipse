package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ECommerce {
	

	private JFrame frame;
	int items=0;
	int bill=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ECommerce window = new ECommerce();
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
	public ECommerce() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("E COMMERCE APP");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		lblNewLabel.setBounds(160, 11, 112, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel l1 = new JLabel("CART : 0");
		l1.setBounds(357, 25, 60, 14);
		frame.getContentPane().add(l1);
		
		JLabel lblNewLabel_3 = new JLabel("RS : 500");
		lblNewLabel_3.setBounds(75, 221, 60, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+500;
				l1.setText("CART :"+items);
			}
		});
		b1.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\21.jpg"));
		b1.setBounds(23, 49, 141, 161);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+800;
				l1.setText("CART : "+items);
			}
		});
		b2.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\images.jpg"));
		b2.setBounds(207, 49, 141, 162);
		frame.getContentPane().add(b2);
		
		JLabel lblNewLabel_2 = new JLabel("RS : 800");
		lblNewLabel_2.setBounds(253, 221, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton b3 = new JButton("BUY");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b3, "no of items "+items+"\nBill "+bill);
				
			
			}
		});
		b3.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(b3);
	}

}
