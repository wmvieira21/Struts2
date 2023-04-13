import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.apache.catalina.tribes.util.Arrays;

public class CallableStatment {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");

			CallableStatement st = conn.prepareCall("{call addEmployee(?,?,?)}");
			st.setInt(1, 4);
			st.setString(2, "william");
			st.registerOutParameter(3, java.sql.Types.VARCHAR);
			st.executeUpdate();

			System.out.print("Error param out" + st.getString(3));

			/*
			 * while (rs.next()) { System.out.println(rs.getInt("ID_CLIENTE") + "-" +
			 * rs.getString("nome")); }
			 */

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
