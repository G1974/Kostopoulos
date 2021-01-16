package Hotel.kosto.giorgos000;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Label;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class CUSTOMER extends JFrame {

	private JPanel contentPane;
	public JTextField onoma;
	private JTextField epitheto;
	private JTextField domatio;
	protected String l;
	private JLabel lblNewLabel_2;
	private JTextField Hmerominia;
	public static Connection conn;
	private JTextField Hmerominia_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CUSTOMER frame = new CUSTOMER();
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
	public CUSTOMER() {
		setTitle("\u03A3\u03A4\u039F\u0399\u03A7\u0395\u0399\u0391 - \u03A0\u0395\u039B\u0391\u03A4\u0397");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\giorgos1974\\Desktop\\House-icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 100, 440, 318);//100, 100, 440, 318
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		onoma = new JTextField();
		onoma.setBounds(22, 28, 86, 20);
		contentPane.add(onoma);
		onoma.setColumns(10);
		
		epitheto = new JTextField();
		epitheto.setBounds(22, 84, 86, 20);
		contentPane.add(epitheto);
		epitheto.setColumns(10);
		
		domatio = new JTextField();
		domatio.setBounds(22, 140, 86, 20);
		contentPane.add(domatio);
		domatio.setColumns(10);
		
		JButton btnNewButton = new JButton("\u0395\u0399\u03A3\u0391\u0393\u03A9\u0393\u0397");
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HOTEL hotel=new HOTEL();
				hotel.setVisible(true);
				String url= "jdbc:mysql:*******************************";
				String username="********";
				String password="*********";
				try {
					conn=DriverManager.getConnection(url, username, password);
					System.out.println("ok");
					String name_record=onoma.getText();
					String surname_record=epitheto.getText();
					String date_arrive_record=Hmerominia.getText();
					int room_record=Integer.parseInt(domatio.getText());
					String date_departure_record=Hmerominia_2.getText();
				
					PreparedStatement p= CUSTOMER.conn.prepareStatement("INSERT INTO records values(?,?,?,?,?)");	
					p.setString(1, name_record);
					p.setString(2,surname_record);
					p.setString(3, date_arrive_record);
					p.setInt(4, room_record);
					p.setString(5, date_departure_record);
					p.executeUpdate();
					p.close();
				}catch(SQLException ex) {System.out.println("problem");}
				
	               	dispose();
	       
			}
		});
		btnNewButton.setBounds(300, 247, 114, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u039F\u039D\u039F\u039C\u0391");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(SystemColor.activeCaption);
		lblNewLabel.setBounds(28, 11, 67, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0395\u03A0\u0399\u0398\u0395\u03A4\u039F");
		lblNewLabel_1.setBounds(28, 66, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("\u0394\u03A9\u039C\u0391\u03A4\u0399\u039F");
		lblNewLabel_2.setBounds(28, 121, 67, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(" \u0391\u03A6\u0399\u039E\u0397\u03A3");
		lblNewLabel_3.setBounds(24, 176, 75, 14);
		contentPane.add(lblNewLabel_3);
		
		Hmerominia = new JTextField();
		Hmerominia.setBounds(22, 196, 86, 20);
		contentPane.add(Hmerominia);
		Hmerominia.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(CUSTOMER.class.getResource("/Hotel/kosto/giorgos000/luggage.png")));
		lblNewLabel_4.setBounds(244, 28, 148, 131);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("      \u0391\u039D\u0391\u03A7\u03A9\u03A1\u0397\u03A3\u0397\u03A3");
		lblNewLabel_5.setBounds(7, 228, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		Hmerominia_2 = new JTextField();
		Hmerominia_2.setBounds(22, 248, 86, 20);
		contentPane.add(Hmerominia_2);
		Hmerominia_2.setColumns(10);
	}
}
