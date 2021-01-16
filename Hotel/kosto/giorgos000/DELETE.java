package Hotel.kosto.giorgos000;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JToolBar;
import java.awt.Font;

public class DELETE extends JFrame {
	public static Connection conni;
	ResultSet res ,tes;
	Statement stm ,smt;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DELETE frame = new DELETE();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DELETE() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 100, 212, 278);//100, 100, 212, 278
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		JButton btnNewButton = new JButton("\u0394\u0399\u0391\u0393\u03A1\u0391\u03A6\u0397 ");
		btnNewButton.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		btnNewButton.setBackground(new Color(102, 205, 170));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String url3= "jdbc:mysql://****************************";
				String username="*************";
				String password="***********";
				String qq="DELETE from records where room_record=?";
				
				try {
					conni=DriverManager.getConnection(url3, username, password);
					System.out.println("done");
					PreparedStatement pr=conni.prepareStatement(qq); pr.setInt(1, Integer.parseInt(textField.getText())); 
					int btn;
					btn=JOptionPane.showConfirmDialog(null, "≈…”‘≈ ”…√œ’—œ”","Warning",JOptionPane.YES_NO_OPTION);
				if (btn==JOptionPane.YES_OPTION) {pr.execute();}
				
				else {}
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				//dispose();
			}
		});
		btnNewButton.setBounds(31, 87, 115, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(65, 51, 54, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Label label = new Label("   \u0391\u03A1\u0399\u0398\u039C\u039F\u03A3 \u0394\u03A9\u039C\u0391\u03A4\u0399\u039F\u03A5");
		label.setAlignment(Label.CENTER);
		label.setBounds(31, 10, 129, 35);
		contentPane.add(label);
		
		JButton btnNewButton_1 = new JButton("\u0395\u03A0\u0399\u03A3\u03A4\u03A1\u039F\u03A6\u0397");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HOTEL hotel=new HOTEL();
				hotel.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(102, 205, 170));
		btnNewButton_1.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		btnNewButton_1.setBounds(31, 120, 115, 23);
		contentPane.add(btnNewButton_1);
	}
}
