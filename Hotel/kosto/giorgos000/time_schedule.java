package Hotel.kosto.giorgos000;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Label;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Window.Type;

public class time_schedule extends JFrame {

	private JPanel contentPane;
	JTable table_date;
	public static Connection conn;
	Statement st;
	ResultSet rt;
	JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					time_schedule frame = new time_schedule();
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
	public time_schedule() {
		setTitle("\u0397\u039C\u0395\u03A1\u039F\u039C\u0397\u039D\u0399\u0395\u03A3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 100, 626, 301);//100, 100, 626, 301
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("\u0394\u0399\u0391\u0398\u0395\u03A3\u0399\u039C\u039F\u03A4\u0397\u03A4\u0391 \u0397\u039C\u0395\u03A1\u039F\u039C\u0397\u039D\u0399\u0391\u03A3");
		scrollPane.setBounds(10, 11, 470, 239);
		contentPane.add(scrollPane);
		
		table_date = new JTable();
		scrollPane.setViewportView(table_date);
		
		JButton btnNewButton = new JButton("\u0395\u03A0\u0399\u03A3\u03A4\u03A1\u039F\u03A6\u0397");
		btnNewButton.setBackground(new Color(102, 205, 170));
		btnNewButton.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HOTEL hotel=new HOTEL();
				hotel.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(499, 149, 101, 22);
		contentPane.add(btnNewButton);
		
		Label label = new Label("  \u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397");
		label.setBounds(499, 25, 86, 22);
		contentPane.add(label);
		
		JButton btnNewButton_1 = new JButton("\u0395\u0399\u03A3\u0391\u0393\u03A9\u0393\u0397");
		btnNewButton_1.setBackground(new Color(102, 205, 170));
		btnNewButton_1.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url2= "jdbc:mysql://************************";
				String username="************";
				String password="*************";
				String k=textField.getText();
				
				String q="select name_record as ονομα,surname_record as επιθετο,date_arrive_record as αφιξης , date_departure_record as αναχωρησης ,room_record as δωματιο from records where date_arrive_record =' "+k+"' ";	
				try {
					conn=DriverManager.getConnection(url2, username, password);
					System.out.println("ok");
					st=conn.createStatement();
					rt=st.executeQuery(q);
					table_date.setModel(DbUtils.resultSetToTableModel(rt));
			
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setBounds(499, 97, 101, 23);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setToolTipText("\u0397\u039C\u0395\u03A1\u039F\u039C\u0397\u039D\u0399\u0391 \u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397\u03A3");
		textField.setBounds(499, 53, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
