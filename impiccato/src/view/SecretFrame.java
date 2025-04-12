package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecretFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fieldParolaSegreta;
	private JButton btnConfirm = new JButton("OK");
	private JLabel lblNewLabel = new JLabel("Inserisci la parola segreta");
	public JTextField getFieldParolaSegreta() {
		return fieldParolaSegreta;
	}
	public JButton getBtnConfirm() {
		return btnConfirm;
	}

	public SecretFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 206, 189);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		fieldParolaSegreta = new JTextField();
		fieldParolaSegreta.setBounds(50, 60, 96, 19);
		contentPane.add(fieldParolaSegreta);
		fieldParolaSegreta.setColumns(10);
		
		
		lblNewLabel.setBounds(28, 36, 172, 13);
		contentPane.add(lblNewLabel);
		
		btnConfirm.setBounds(55, 90, 85, 21);
		contentPane.add(btnConfirm);
	}
}
