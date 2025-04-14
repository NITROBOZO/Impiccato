package view;
import javax.swing.ImageIcon;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class FrameImpiccato extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fieldParola;
	private JLabel labelImmagine;
	private JLabel labelTentativi = new JLabel("Errori rimasti: 6");
	private JButton btnConferma = new JButton("Conferma");
	private JLabel labelParolaAttuale = new JLabel("");
	private JLabel lblVittoria = new JLabel("");
	private String alfabeto = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
	private final JLabel lblAlfabeto = new JLabel("<html>"+alfabeto+"</html>");
	
	

	public String getAlfabeto() {
		return alfabeto;
	}

	public void setAlfabeto(String alfabeto) {
		this.alfabeto = alfabeto;
	}

	public JLabel getLabelParolaAttuale() {
		return labelParolaAttuale;
	}
	
	public void setLabelVittoria(String str) {
		lblVittoria.setText(str);
	}

	public void setLabelParolaAttuale(String str) {
		labelParolaAttuale.setText(str);
	}
	public JTextField getFieldParola() {
		return fieldParola;
	}
	public JButton getBtnConferma() {
		return btnConferma;
	}
	public void setLabelImmagine(int n) {
		switch (n) {
		case 0:
			labelImmagine.setIcon(new ImageIcon(getClass().getResource("0.jpg")));
			break;
		case 1:
			labelImmagine.setIcon(new ImageIcon(getClass().getResource("1.jpg")));
			break;
		case 2:
			labelImmagine.setIcon(new ImageIcon(getClass().getResource("2.jpg")));
			break;
		case 3:
			labelImmagine.setIcon(new ImageIcon(getClass().getResource("3.jpg")));
			break;
		case 4:
			labelImmagine.setIcon(new ImageIcon(getClass().getResource("4.jpg")));
			break;
		case 5:
			labelImmagine.setIcon(new ImageIcon(getClass().getResource("5.jpg")));
			break;
		case 6:
			labelImmagine.setIcon(new ImageIcon(getClass().getResource("6.jpg")));
			break;
		}
	}

	public void setLabelTentativi(int n) {
		labelTentativi.setText("Errori rimasti: " + n);
	}

	public void updateAlfabeto() {
		lblAlfabeto.setText("<html>" + alfabeto + "</html>");
	}
	public FrameImpiccato() {
		setTitle("Impiccato");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		fieldParola = new JTextField();
		fieldParola.setBounds(242, 93, 148, 20);
		contentPane.add(fieldParola);
		fieldParola.setColumns(10);
		
		JLabel labelInserisciParola = new JLabel("Inserisci una parola/lettera");
		labelInserisciParola.setBounds(242, 68, 183, 14);
		contentPane.add(labelInserisciParola);
		
		
		labelTentativi.setBounds(50, 11, 106, 14);
		contentPane.add(labelTentativi);
		lblAlfabeto.setVerticalAlignment(JLabel.TOP);
		
		labelImmagine = new JLabel("");
		ImageIcon icon = new ImageIcon(getClass().getResource("6.jpg"));
		labelImmagine.setIcon(icon);
		labelImmagine.setBounds(24, 36, 148, 210);
		contentPane.add(labelImmagine);
		
		
		btnConferma.setBounds(272, 124, 89, 23);
		contentPane.add(btnConferma);
		
		
		labelParolaAttuale.setBounds(50, 256, 106, 14);
		contentPane.add(labelParolaAttuale);
		
		
		lblVittoria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVittoria.setBounds(182, 158, 243, 39);
		lblVittoria.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblVittoria);
		
		JLabel lblLettere = new JLabel("Lettere");
		lblLettere.setBounds(272, 195, 43, 14);
		contentPane.add(lblLettere);
		lblAlfabeto.setBounds(272, 209, 89, 72);
		
		contentPane.add(lblAlfabeto);
	}
}
