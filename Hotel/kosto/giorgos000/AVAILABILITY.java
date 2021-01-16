package Hotel.kosto.giorgos000;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;

public class AVAILABILITY extends JFrame {

	private JPanel contentPane;
	Label label;
	Label label_1;
	Label label_2;
	Label label_3;
	Label label_4;
	Label label_5;
	Label label_6;
	Label label_7;
	Label label_8;
	Label label_9;
	Label label_10;
	Label label_11;
	Label label_12;
	Label label_13;
	Label label_14;
	Label label_15;
	Label label_16;
	Label label_17;
	Label label_18;
	Label label_19;
	JTable table_1;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AVAILABILITY frame = new AVAILABILITY();
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
	public AVAILABILITY() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\giorgos1974\\Desktop\\House-icon.png"));
		setTitle("\u0394\u0399\u0391\u0398\u0395\u03A3\u0399\u039C\u039F\u03A4\u0397\u03A4\u0391 - \u0394\u03A9\u039C\u0391\u03A4\u0399\u03A9\u039D");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 100, 656, 486);//100, 100, 656, 486
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		label = new Label("1");
		label.setBackground(Color.GREEN);
		label.setFont(new Font("Angsana New", Font.BOLD, 16));
		label.setAlignment(Label.CENTER);
		label.setBounds(10, 29, 62, 22);//10, 29, 62, 22)
		contentPane.add(label);
		
		label_1 = new Label("2");
		label_1.setBackground(Color.GREEN);
		label_1.setFont(new Font("Dialog", Font.BOLD, 16));
		label_1.setAlignment(Label.CENTER);
		label_1.setBounds(92, 29, 62, 22);
		contentPane.add(label_1);
		
		label_2 = new Label("3");
		label_2.setBackground(Color.GREEN);
		label_2.setFont(new Font("Dialog", Font.BOLD, 16));
		label_2.setAlignment(Label.CENTER);
		label_2.setBounds(174, 29, 62, 22);
		contentPane.add(label_2);
		
		label_3 = new Label("4");
		label_3.setBackground(Color.GREEN);
		label_3.setFont(new Font("Dialog", Font.BOLD, 16));
		label_3.setAlignment(Label.CENTER);
		label_3.setBounds(256, 29, 62, 22);
		contentPane.add(label_3);
		
		label_4 = new Label("5");
		label_4.setBackground(Color.GREEN);
		label_4.setFont(new Font("Dialog", Font.BOLD, 16));
		label_4.setAlignment(Label.CENTER);
		label_4.setBounds(338, 29, 62, 22);
		contentPane.add(label_4);
		
		label_5 = new Label("6");
		label_5.setBackground(Color.GREEN);
		label_5.setFont(new Font("Dialog", Font.BOLD, 16));
		label_5.setAlignment(Label.CENTER);
		label_5.setBounds(10, 84, 62, 22);
		contentPane.add(label_5);
		
		label_6 = new Label("7");
		label_6.setBackground(Color.GREEN);
		label_6.setFont(new Font("Dialog", Font.BOLD, 16));
		label_6.setAlignment(Label.CENTER);
		label_6.setBounds(92, 84, 62, 22);
		contentPane.add(label_6);
		
		label_7 = new Label("8");
		label_7.setBackground(Color.GREEN);
		label_7.setFont(new Font("Dialog", Font.BOLD, 16));
		label_7.setAlignment(Label.CENTER);
		label_7.setBounds(174, 84, 62, 22);
		contentPane.add(label_7);
		
		label_8 = new Label("9");
		label_8.setBackground(Color.GREEN);
		label_8.setFont(new Font("Dialog", Font.BOLD, 16));
		label_8.setAlignment(Label.CENTER);
		label_8.setBounds(256, 84, 62, 22);
		contentPane.add(label_8);
		
		label_9 = new Label("10");
		label_9.setBackground(Color.GREEN);
		label_9.setFont(new Font("Dialog", Font.BOLD, 16));
		label_9.setAlignment(Label.CENTER);
		label_9.setBounds(338, 84, 62, 22);
		contentPane.add(label_9);
		
		label_10 = new Label("11");
		label_10.setBackground(Color.GREEN);
		label_10.setFont(new Font("Dialog", Font.BOLD, 16));
		label_10.setAlignment(Label.CENTER);
		label_10.setBounds(10, 141, 62, 22);
		contentPane.add(label_10);
		
		label_11 = new Label("12");
		label_11.setBackground(Color.GREEN);
		label_11.setFont(new Font("Dialog", Font.BOLD, 16));
		label_11.setAlignment(Label.CENTER);
		label_11.setBounds(92, 141, 62, 22);
		contentPane.add(label_11);
		
		label_12 = new Label("13");
		label_12.setBackground(Color.GREEN);
		label_12.setFont(new Font("Dialog", Font.BOLD, 16));
		label_12.setAlignment(Label.CENTER);
		label_12.setBounds(174, 141, 62, 22);
		contentPane.add(label_12);
		
		label_13 = new Label("14");
		label_13.setBackground(Color.GREEN);
		label_13.setFont(new Font("Dialog", Font.BOLD, 16));
		label_13.setAlignment(Label.CENTER);
		label_13.setBounds(256, 141, 62, 22);
		contentPane.add(label_13);
		
		label_14 = new Label("15");
		label_14.setBackground(Color.GREEN);
		label_14.setFont(new Font("Dialog", Font.BOLD, 16));
		label_14.setAlignment(Label.CENTER);
		label_14.setBounds(338, 141, 62, 22);
		contentPane.add(label_14);
		
		label_15 = new Label("16");
		label_15.setBackground(Color.GREEN);
		label_15.setFont(new Font("Dialog", Font.BOLD, 16));
		label_15.setAlignment(Label.CENTER);
		label_15.setBounds(10, 197, 62, 22);
		contentPane.add(label_15);
		
		label_16 = new Label("17");
		label_16.setBackground(Color.GREEN);
		label_16.setFont(new Font("Dialog", Font.BOLD, 16));
		label_16.setAlignment(Label.CENTER);
		label_16.setBounds(92, 197, 62, 22);
		contentPane.add(label_16);
		
		label_17 = new Label("18");
		label_17.setBackground(Color.GREEN);
		label_17.setFont(new Font("Dialog", Font.BOLD, 16));
		label_17.setAlignment(Label.CENTER);
		label_17.setBounds(174, 197, 62, 22);
		contentPane.add(label_17);
		
		label_18 = new Label("19");
		label_18.setBackground(Color.GREEN);
		label_18.setFont(new Font("Dialog", Font.BOLD, 16));
		label_18.setAlignment(Label.CENTER);
		label_18.setBounds(256, 197, 62, 22);
		contentPane.add(label_18);
		
		label_19 = new Label("20");
		label_19.setBackground(Color.GREEN);
		label_19.setFont(new Font("Dialog", Font.BOLD, 16));
		label_19.setAlignment(Label.CENTER);
		label_19.setBounds(338, 197, 62, 22);
		contentPane.add(label_19);
		
		JButton btnNewButton = new JButton("\u0395\u03A0\u0399\u03A3\u03A4\u03A1\u039F\u03A6\u0397");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HOTEL hotel=new HOTEL();
				hotel.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(533, 414, 107, 22);
		contentPane.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 271, 513, 165);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table_1.setEnabled(false);
		scrollPane.setViewportView(table_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AVAILABILITY.class.getResource("Hotel/kosto/giorgos000/hotel.png")));
		lblNewLabel.setBounds(460, 29, 143, 165);
		contentPane.add(lblNewLabel);
	}
}
