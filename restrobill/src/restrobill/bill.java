package restrobill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
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
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RESTRO BILL");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(138, 21, 158, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(23, 80, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Qnty");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(23, 120, 46, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "egg puff - 20", "samosa - 10", "cool drink - 20", "fruit juice - 30"}));
		c1.setBounds(108, 78, 100, 22);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(108, 124, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String qnty=t1.getText();
				int q=Integer.parseInt(qnty);
				int bill=0;
				if(item.equals("egg puff - 20"))
				{
					bill=q*20;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item:"+item+"\n Qnty: "+q+" \n your bill:"+bill);
				}
				else if(item.equals("samosa - 10"))
				{
					bill=q*10;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item:"+item+"\n Qnty: "+q+" \n your bill:"+bill);
				}
				else if(item.equals("cool drink - 20"))
				{
					bill=q*20;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item:"+item+"\n Qnty: "+q+" \n your bill:"+bill);
				}
				else if(item.equals("fruit juice - 30"))
				{
					bill=q*30;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item:"+item+"\n Qnty: "+q+" \n your bill:"+bill);
						
				}
			}
		});
		btnNewButton.setBounds(68, 169, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
