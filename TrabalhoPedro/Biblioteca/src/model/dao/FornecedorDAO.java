package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import model.bean.Fornecedor;
import model.bean.Funcionario;

public class FornecedorDAO {
	
	public boolean create(Fornecedor f) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		boolean r = false;
		try {
			stmt = con.prepareStatement("INSERT INTO fornecedor(nome, tipoDeInstituicao, endereco, telefone, email, url) VALUES(?,?,?,?,?,?)");
			stmt.setString(1, f.getNome());
			stmt.setString(2, f.getTipoDeInstituicao());
			stmt.setString(3, f.getEndereco());
			stmt.setString(4, f.getTelefone());
			stmt.setString(5, f.getEmail());
			stmt.setString(6, f.getUrl());
			
			stmt.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
			r = true;
			return r;
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Erro ao salvar " + e);
			r = false;
			return r;
		}finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
	
	
}
