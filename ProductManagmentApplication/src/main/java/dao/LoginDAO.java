package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import dbutil.DBUtil;
import pojo.Login;

public class LoginDAO {

	public static boolean isUserValid(Login userDetails) {
		Connection conn = DBUtil.getConnection();
		try {
			PreparedStatement st = conn.prepareStatement("select 1 from login where user_name=? and password=?");
			st.setString(1, userDetails.getUserName());
			st.setString(2, userDetails.getPassword());
			int i = st.executeUpdate();
			return (i > 0);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnnection(conn);
		}
		return false;
	}
}
