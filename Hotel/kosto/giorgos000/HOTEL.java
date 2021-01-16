package Hotel.kosto.giorgos000;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import java.awt.TextArea;
import java.awt.Label;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.DropMode;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
//import com.jgoodies.forms.factories.DefaultComponentFactory;

import net.proteanit.sql.DbUtils;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.*;
import java.awt.Font;

public class HOTEL extends JFrame {
     
	private JPanel contentPane;
    public String k;
    public String t;
    public int or;
    public String hmdate;
	public static Connection conni;
	ResultSet res ,tes;
	Statement stm ,smt;
	//private JTable table;
  //  JScrollPane sc=new JScrollPane(textArea);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HOTEL frame = new HOTEL();
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
	public HOTEL() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\giorgos1974\\Desktop\\House-icon.png"));
		setBackground(new Color(240, 240, 240));
		setTitle("HOTEL");
		setForeground(Color.BLUE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 100, 500, 300);//100, 100, 587, 300
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton(" \u0395\u039B\u0395\u0393\u03A7\u039F\u03A3  \u0394\u0399\u0391\u0398\u0395\u03A3\u0399\u039C\u039F\u03A4\u0397\u03A4\u0391\u03A3");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<ResultSet> pinax=new ArrayList<ResultSet>();
				AVAILABILITY availability = new AVAILABILITY();
				String url1= "jdbc:mysql://*********************************";
				String username="*********";
				String password="*************";
				String quer="SELECT name_record As Ονομα,surname_record As Επιθετο ,date_arrive_record As Αφιξη,room_record As Δωματιο,date_departure_record As Αναχωρηση  FROM records";
				
				try {
					conni=DriverManager.getConnection(url1, username, password);
					System.out.println("done");
					stm=conni.createStatement();
				    res=stm.executeQuery(quer);
				    availability.table_1.setModel(DbUtils.resultSetToTableModel(res));
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
			
					stm=conni.createStatement();
				    res=stm.executeQuery("SELECT room_record FROM records");
					while(res.next()) {
						int d=res.getInt("room_record");
						if(d==Integer.parseInt(availability.label.getText())) {availability.label.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_1.getText())) {availability.label_1.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_2.getText())) {availability.label_2.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_3.getText())) {availability.label_3.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_4.getText())) {availability.label_4.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_5.getText())) {availability.label_5.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_6.getText())) {availability.label_6.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_7.getText())) {availability.label_7.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_8.getText())) {availability.label_8.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_9.getText())) {availability.label_9.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_10.getText())) {availability.label_10.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_11.getText())) {availability.label_11.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_12.getText())) {availability.label_12.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_13.getText())) {availability.label_13.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_14.getText())) {availability.label_14.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_15.getText())) {availability.label_15.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_16.getText())) {availability.label_16.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_17.getText())) {availability.label_17.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_18.getText())) {availability.label_18.setBackground(Color.RED);}
						if(d==Integer.parseInt(availability.label_19.getText())) {availability.label_19.setBackground(Color.RED);}
					
						
						
					}
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				availability.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setIcon(null);
		btnNewButton.setBackground(new Color(102, 205, 170));
		btnNewButton.setBounds(10, 77, 216, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u0395\u0399\u03A3\u0391\u0393\u0395\u03A4\u0395 \u03A0\u0395\u039B\u0391\u03A4\u0397");
		btnNewButton_1.setBackground(new Color(102, 205, 170));
		btnNewButton_1.setIcon(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 CUSTOMER customer = new CUSTOMER();
				 customer.setVisible(true);
				 dispose();
			}
		});
		btnNewButton_1.setBounds(10, 16, 216, 45);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397 \u0397\u039C\u0395\u03A1\u039F\u039C\u0397\u039D\u0399\u0391\u03A3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				time_schedule schedule=new time_schedule();
			
				schedule.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBackground(new Color(102, 205, 170));
		btnNewButton_2.setBounds(10, 138, 216, 45);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u0394\u0399\u0391\u0393\u03A1\u0391\u03A6\u0397");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBackground(new Color(102, 205, 170));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DELETE delete=new DELETE();
				delete.setVisible(true);
				dispose();	
			}
		});
		btnNewButton_3.setBounds(10, 199, 216, 45);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u0395\u039A\u03A4\u03A5\u03A0\u03A9\u03A3\u0397");
		btnNewButton_4.setBackground(new Color(102, 205, 170));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				 PRINT print=new PRINT();
				 print.setVisible(true);
				 dispose();
			}
		});
		btnNewButton_4.setBounds(256, 16, 216, 45);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\u039A\u03A1\u0391\u03A4\u0397\u03A3\u0397");
		btnNewButton_5.setBackground(new Color(102, 205, 170));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TEMPORARY temporar=new TEMPORARY();
				temporar.setVisible(true);
				dispose();
			}
		});
		btnNewButton_5.setBounds(256, 77, 216, 45);
		contentPane.add(btnNewButton_5);
		
	
	
	}
}
