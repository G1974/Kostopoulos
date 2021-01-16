package Hotel.kosto.giorgos000;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDCIDFont;
import org.apache.pdfbox.pdmodel.font.PDCIDFontType0;
import org.apache.pdfbox.pdmodel.font.PDCIDFontType2;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDTrueTypeFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

public class PRINT extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PRINT frame = new PRINT();
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
	public PRINT() {
		setBackground(UIManager.getColor("TextArea.selectionBackground"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 100, 455, 379);//100, 100, 455, 379
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		JLabel lblNewLabel = new JLabel("\u039F\u039D\u039F\u039C\u0391");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 13, 76, 23);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 28, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u0395\u03A0\u0399\u0398\u0395\u03A4\u039F");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 59, 76, 23);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 76, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u0391.\u03A6.\u039C.");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 107, 76, 23);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 124, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u0394\u0399\u0395\u03A5\u0398\u03A5\u039D\u03A3\u0397");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 155, 76, 23);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 172, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\u0391\u03A1\u0399\u0398\u039C\u039F\u03A3");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 203, 76, 23);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 220, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\u03A4\u0391\u03A7.\u039A\u03A9\u0394\u0399\u039A\u0391\u03A3");
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(10, 251, 76, 23);
		contentPane.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 268, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\u0394\u0399\u0391\u039D\u03A5\u039A\u03A4\u0395\u03A1\u0395\u03A5\u03A3\u0395\u0399\u03A3");
		lblNewLabel_6.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(163, 13, 119, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setBounds(183, 28, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("\u0394\u03A9\u039C\u0391\u03A4\u0399\u039F");
		lblNewLabel_7.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblNewLabel_7.setBounds(193, 59, 76, 23);
		contentPane.add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setBounds(183, 76, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("\u0391\u03A6\u0399\u039E\u0397");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblNewLabel_8.setBounds(183, 111, 76, 14);
		contentPane.add(lblNewLabel_8);
		
		textField_8 = new JTextField();
		textField_8.setBounds(183, 124, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("\u0391\u039D\u0391\u03A7\u03A9\u03A1\u0397\u03A3\u0397");
		lblNewLabel_9.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(176, 159, 106, 14);
		contentPane.add(lblNewLabel_9);
		
		textField_9 = new JTextField();
		textField_9.setBounds(183, 172, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("\u039A\u039F\u03A3\u03A4\u039F\u03A3/\u0397\u039C\u0395\u03A1\u0391");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_10.setBounds(163, 207, 119, 14);
		contentPane.add(lblNewLabel_10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(183, 220, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("\u03A6.\u03A0.\u0391.");
		lblNewLabel_11.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(183, 255, 76, 14);
		contentPane.add(lblNewLabel_11);
		
		textField_11 = new JTextField();
		textField_11.setBounds(183, 268, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("\u03A0\u039F\u039B\u0397");
		lblNewLabel_12.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(10, 294, 76, 23);
		contentPane.add(lblNewLabel_12);
		
		textField_12 = new JTextField();
		textField_12.setBounds(10, 309, 86, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\u0395\u039A\u03A4\u03A5\u03A0\u03A9\u03A3\u0397");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File file = new File("c:/users/giorgos1974/desktop/testpd/tst_5.pdf");
				try {
					PDDocument document=PDDocument.load(file);
					PDPage page = document.getPage(0);
				   // PDImageXObject pdImage = PDImageXObject.createFromFile("c:/users/giorgos1974/desktop/hotel.png",document);
					 
					 PDImageXObject pdImage = PDImageXObject.createFromFile("src/Hotel/kosto/giorgos000/hotel.png", document);
					 PDPageContentStream contentStream = new PDPageContentStream(document, page);
					 contentStream.drawImage(pdImage, 250, 650);
					 contentStream.beginText();
					 contentStream.setFont(PDType1Font.COURIER_BOLD,12);
					 contentStream.setLeading(14.5f);
					 contentStream.newLineAtOffset(25, 725);
					 String text = "NAME : "+textField.getText();
				     String text1=" SURNAME :"+textField_1.getText();
					 String text2=" A.F.M. = "+textField_2.getText();
					 String text3=" ADDRESS :"+textField_3.getText(); 
					 String text4=" NUMBER :"+textField_4.getText();
					 String text5=" POSTAL-CODE :"+textField_5.getText();
					 String text12=" TOWN :"+textField_12.getText();
					 String text6=" DATES :"+textField_6.getText();
					 String text8=" ARRIVE :"+textField_8.getText();
					 String text9=" DEPARTURE:"+textField_9.getText();
					 String text10=" COST BY DAY :"+textField_10.getText();
					 String text11=" TAX-NUMBER  :"+textField_11.getText();
					 String text7=" ROOM = "+textField_7.getText();
					// String text13=textField_13.getText();
					 
					 contentStream.newLine();
					 contentStream.newLine();
					 contentStream.newLine();
					 contentStream.newLine();
					 contentStream.newLine();
					 contentStream.newLine();
					 contentStream.newLine();
					 contentStream.newLine();
					 contentStream.newLine();
					 contentStream.newLine();
					 contentStream.newLine();
					 contentStream.newLine();
					 contentStream.newLine();
					 contentStream.newLine();
					 
					 contentStream.showText(text);
					 contentStream.newLine();
					 contentStream.showText(text1);
					 contentStream.newLine();
					 contentStream.showText(text2);
					 contentStream.newLine();
					 contentStream.showText(text3);
					 contentStream.newLine();
					 contentStream.showText(text4);
					 contentStream.newLine();
					 contentStream.showText(text5);
					 contentStream.newLine();
					 contentStream.showText(text6);
					 contentStream.newLine();
					 contentStream.showText(text7);
					 contentStream.newLine();
					 contentStream.showText(text8);
					 contentStream.newLine();
					 contentStream.showText(text9);
					 contentStream.newLine();
					 contentStream.showText(text10);
					 contentStream.newLine();
					 contentStream.showText(text11);
					 contentStream.newLine();
					 contentStream.showText(text12);
					 contentStream.newLine();
					 	
					 contentStream.endText();
					 contentStream.close();
					 document.save(new File("c:/users/giorgos1974/desktop/testpd/tst_6.pdf"));

					 document.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		
			
		});
		btnNewButton_1.setBackground(new Color(255, 204, 0));
		btnNewButton_1.setBounds(180, 308, 102, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("\u0395\u03A0\u0399\u03A3\u03A4\u03A1\u039F\u03A6\u0397");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HOTEL hotel=new HOTEL();
				hotel.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(102, 102, 102));
		btnNewButton.setBounds(341, 308, 104, 23);
		contentPane.add(btnNewButton);
	}
}
