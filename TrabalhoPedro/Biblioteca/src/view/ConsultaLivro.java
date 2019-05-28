package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConsultaLivro extends JInternalFrame {
	private JTable table;
	private JTextField txtTitulo;
	private JTextField txtAutor;
	private JTextField txtIsbn;
	private JTextField txtGenero;
	private JTextField txtDesc;
	private JTextField txtIdioma;
	private JTextField txtEditora;
	private JTextField txtData;
	private JTextField txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaLivro frame = new ConsultaLivro();
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
	public ConsultaLivro() {
		setClosable(true);
		setBounds(100, 100, 1355, 486);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(scrollPane, Alignment.LEADING)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1335, Short.MAX_VALUE))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(null);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo");
		lblTtulo.setBounds(10, 11, 46, 14);
		panel.add(lblTtulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(20, 36, 166, 20);
		panel.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(10, 113, 46, 14);
		panel.add(lblAutor);
		
		txtAutor = new JTextField();
		txtAutor.setBounds(20, 138, 156, 20);
		panel.add(txtAutor);
		txtAutor.setColumns(10);
		
		JLabel lblIsbn = new JLabel("ISBN");
		lblIsbn.setBounds(302, 11, 46, 14);
		panel.add(lblIsbn);
		
		txtIsbn = new JTextField();
		txtIsbn.setBounds(312, 36, 156, 20);
		panel.add(txtIsbn);
		txtIsbn.setColumns(10);
		
		JLabel lblGnero = new JLabel("G\u00EAnero");
		lblGnero.setBounds(302, 113, 46, 14);
		panel.add(lblGnero);
		
		txtGenero = new JTextField();
		txtGenero.setBounds(312, 138, 156, 20);
		panel.add(txtGenero);
		txtGenero.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setBounds(599, 11, 46, 14);
		panel.add(lblDescrio);
		
		txtDesc = new JTextField();
		txtDesc.setBounds(609, 36, 155, 20);
		panel.add(txtDesc);
		txtDesc.setColumns(10);
		
		JLabel lblIdioma = new JLabel("Idioma");
		lblIdioma.setBounds(599, 113, 46, 14);
		panel.add(lblIdioma);
		
		txtIdioma = new JTextField();
		txtIdioma.setBounds(609, 138, 155, 20);
		panel.add(txtIdioma);
		txtIdioma.setColumns(10);
		
		JLabel lblEditora = new JLabel("Editora");
		lblEditora.setBounds(886, 11, 46, 14);
		panel.add(lblEditora);
		
		txtEditora = new JTextField();
		txtEditora.setBounds(896, 36, 166, 20);
		panel.add(txtEditora);
		txtEditora.setColumns(10);
		
		JLabel lblDataDePublicao = new JLabel("Data de Publica\u00E7\u00E3o");
		lblDataDePublicao.setBounds(886, 113, 119, 14);
		panel.add(lblDataDePublicao);
		
		txtData = new JTextField();
		txtData.setBounds(896, 138, 166, 20);
		panel.add(txtData);
		txtData.setColumns(10);
		
		JLabel lblrea = new JLabel("\u00C1rea");
		lblrea.setBounds(1164, 11, 46, 14);
		panel.add(lblrea);
		
		txtArea = new JTextField();
		txtArea.setBounds(1174, 36, 156, 20);
		panel.add(txtArea);
		txtArea.setColumns(10);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(412, 188, 89, 23);
		panel.add(btnAtualizar);
		
		JButton btnDelatar = new JButton("Deletar");
		btnDelatar.setBounds(813, 188, 89, 23);
		panel.add(btnDelatar);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"T\u00EDtulo", "Autor", "ISBN", "G\u00EAnero", "Descri\u00E7\u00E3o", "Idioma", "Editora", "Data de Publica\u00E7\u00E3o", "\u00C1rea"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, true, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(4).setPreferredWidth(184);
		table.getColumnModel().getColumn(6).setPreferredWidth(94);
		table.getColumnModel().getColumn(7).setPreferredWidth(115);
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);

	}
}
