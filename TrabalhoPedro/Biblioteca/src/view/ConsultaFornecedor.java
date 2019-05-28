package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConsultaFornecedor extends JInternalFrame {
	private JTable table;
	private JTextField txtNome;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaFornecedor frame = new ConsultaFornecedor();
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
	public ConsultaFornecedor() {
		setClosable(true);
		setBounds(100, 100, 941, 541);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 925, 210);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 11, 74, 14);
		panel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(20, 36, 168, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblTipoDeInstituio = new JLabel("Tipo de Institui\u00E7\u00E3o");
		lblTipoDeInstituio.setBounds(10, 86, 110, 14);
		panel.add(lblTipoDeInstituio);
		
		textField = new JTextField();
		textField.setBounds(20, 111, 168, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(364, 11, 81, 14);
		panel.add(lblEndereo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(374, 36, 193, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(364, 86, 81, 14);
		panel.add(lblTelefone);
		
		textField_2 = new JTextField();
		textField_2.setBounds(374, 111, 193, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(736, 11, 46, 14);
		panel.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setBounds(746, 36, 169, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblUrl = new JLabel("URL");
		lblUrl.setBounds(736, 86, 46, 14);
		panel.add(lblUrl);
		
		textField_4 = new JTextField();
		textField_4.setBounds(746, 111, 169, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(224, 164, 89, 23);
		panel.add(btnAtualizar);
		
		JButton btnExcluir = new JButton("Deletar");
		btnExcluir.setBounds(478, 164, 89, 23);
		panel.add(btnExcluir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 211, 925, 289);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Tipo de Institui\u00E7\u00E3o", "Endere\u00E7o", "Telefone", "Email", "URL"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(166);
		table.getColumnModel().getColumn(1).setPreferredWidth(175);
		table.getColumnModel().getColumn(2).setPreferredWidth(162);
		table.getColumnModel().getColumn(3).setPreferredWidth(108);
		table.getColumnModel().getColumn(4).setPreferredWidth(157);
		table.getColumnModel().getColumn(5).setPreferredWidth(107);
		scrollPane.setViewportView(table);

	}
}
