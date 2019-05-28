package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.bean.Leitor;
import model.dao.LeitorDAO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;

public class CadastroLeitor extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtCpf;
	private JTextField txtSexo;
	private JTextField txtData;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroLeitor frame = new CadastroLeitor();
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
	public CadastroLeitor() {
		setClosable(true);
		setBounds(100, 100, 930, 724);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 914, 683);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		lblNome.setBackground(SystemColor.activeCaption);
		lblNome.setBounds(134, 11, 55, 14);
		panel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		txtNome.setBounds(134, 36, 273, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(134, 87, 76, 14);
		panel.add(lblSobrenome);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(134, 112, 273, 20);
		panel.add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		txtCpf.setBounds(134, 188, 273, 20);
		panel.add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(489, 11, 46, 14);
		panel.add(lblSexo);
		
		txtSexo = new JTextField();
		txtSexo.setBounds(501, 36, 273, 20);
		panel.add(txtSexo);
		txtSexo.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(489, 87, 113, 14);
		panel.add(lblDataDeNascimento);
		
		txtData = new JTextField();
		txtData.setBounds(501, 112, 273, 20);
		panel.add(txtData);
		txtData.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(489, 163, 55, 14);
		panel.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(501, 188, 273, 20);
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBackground(new Color(153, 153, 255));
		btnOk.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Leitor l = new Leitor();
				LeitorDAO dao = new LeitorDAO();
				
				l.setNome(txtNome.getText());
				l.setSobrenome(txtSobrenome.getText());
				l.setCpf(txtCpf.getText());
				l.setSexo(txtSexo.getText());
				l.setDataNascimento(txtData.getText());
				l.setEmail(txtEmail.getText());
				
				if(dao.create(l)) {
					dispose();
				}
			}
		});
		btnOk.setBounds(318, 358, 89, 23);
		panel.add(btnOk);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		btnCancelar.setBackground(new Color(153, 153, 255));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(501, 358, 89, 23);
		panel.add(btnCancelar);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		lblCpf.setBounds(134, 163, 46, 14);
		panel.add(lblCpf);

	}
}
