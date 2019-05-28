package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.bean.Fornecedor;
import model.dao.FornecedorDAO;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class CadastroFornecedor extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtTipoInst;
	private JTextField txtEndereco;
	private JTextField txtTelefone;
	private JTextField txtUrl;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFornecedor frame = new CadastroFornecedor();
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
	public CadastroFornecedor() {
		setClosable(true);
		setBackground(Color.CYAN);
		setTitle("Fornecedor");
		setBounds(100, 100, 932, 727);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 1047, 748);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		lblNome.setBounds(154, 9, 54, 14);
		panel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		txtNome.setBounds(166, 34, 223, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblTipoDeInstituio = new JLabel("Tipo de Institui\u00E7\u00E3o");
		lblTipoDeInstituio.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		lblTipoDeInstituio.setBounds(154, 76, 149, 14);
		panel.add(lblTipoDeInstituio);
		
		txtTipoInst = new JTextField();
		txtTipoInst.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		txtTipoInst.setBounds(166, 101, 223, 20);
		panel.add(txtTipoInst);
		txtTipoInst.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		lblEndereo.setBounds(154, 146, 76, 14);
		panel.add(lblEndereo);
		
		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		txtEndereco.setBounds(166, 171, 223, 20);
		panel.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		lblTelefone.setBounds(505, 9, 76, 14);
		panel.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		txtTelefone.setBounds(520, 34, 223, 20);
		panel.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("URL");
		lblNewLabel.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		lblNewLabel.setBounds(505, 76, 54, 14);
		panel.add(lblNewLabel);
		
		txtUrl = new JTextField();
		txtUrl.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		txtUrl.setBounds(520, 101, 223, 20);
		panel.add(txtUrl);
		txtUrl.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBackground(new Color(153, 153, 255));
		btnOk.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fornecedor f = new Fornecedor();
				FornecedorDAO dao = new FornecedorDAO();
				
				f.setNome(txtNome.getText());
				f.setTipoDeInstituicao(txtTipoInst.getText());
				f.setEndereco(txtEndereco.getText());
				f.setTelefone(txtTelefone.getText());
				f.setEmail(txtEmail.getText());
				f.setUrl(txtUrl.getText());
				
				if(dao.create(f)) {
					dispose();
				}
				
			}
		});
		btnOk.setBounds(323, 263, 89, 23);
		panel.add(btnOk);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(new Color(153, 153, 255));
		btnCancelar.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(505, 263, 89, 23);
		panel.add(btnCancelar);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		lblEmail.setBounds(505, 146, 46, 14);
		panel.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		txtEmail.setBounds(520, 171, 223, 20);
		panel.add(txtEmail);
		txtEmail.setColumns(10);

	}
}
