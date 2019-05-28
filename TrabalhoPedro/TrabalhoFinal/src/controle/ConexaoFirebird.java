package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoFirebird {
	private String DRV;
	private String url;
	private String userName;
	private String password;
	private Connection conn;
	private Statement st;
	
	public boolean conecta() {
		boolean result = true;
	   try {
		   Class.forName(DRV);
		   conn = DriverManager.getConnection(url, userName, password);
	   }
	   catch(ClassNotFoundException erroClass) {
		   System.out.println(erroClass.getMessage());
		   result = false;
	   }
	   catch(SQLException erroSQL) {
		   System.out.println(erroSQL.getMessage());
		   result = false;
	   }
	   return result;
	}
	public void desconecta() {
		try {
			conn.close();
		}
		catch(SQLException erroSQL) {
			System.out.println(erroSQL.getMessage());
		}
	}
		
		public int regCount (String qry) {
			int result = 0;
		  try {
			  st = conn.createStatement();
			  ResultSet rs = st.executeQuery(qry);
			  rs.next();
			  result = rs.getInt(1);
			  st.close();
		  }
		  catch(SQLException sqlex) {
			  System.out.println(sqlex.getMessage());
		  }
		  return result;
		  
		}
		public String getColumn1 (String qry) {
			String result = "";
		   try {
			   st = conn.createStatement();
			   ResultSet rs = st.executeQuery(qry);
			  rs.next();
			  result = "" + rs.getString(1);
			  st.close();
		   }
		
		 catch(SQLException sqlex) {
			  System.out.println(sqlex.getMessage());

		 }
		 return result;
		}
		public void getColumn(String qry, String[] reg) {
			try {
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(qry);
			   rs.next();
			   for (int i = 1; i <= reg.length; i++)
				   reg[i-1] = "" + rs.getString(i);
			   st.close();
			}
			catch(SQLException sqlex) {
				System.out.println(sqlex.getMessage());
			}
		}
		public void getColumn(String qry, String[][] reg, int regs) {
			try {
				int lin = 0;
				st = conn.createStatement();
				ResultSet rs = st.executeQuery(qry);
			  while(rs.next()) {
				  for (int i = 0; i < regs; i++) {
					  
				  }
				  lin ++;
			  }
			}
		}
		
	

}
