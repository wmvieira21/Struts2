package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.CloseableThreadContext.Instance;

import dbutil.DBUtil;
import pojo.Product;

public class ProductManagementDAO {

	public static List<Product> getProducts(String name, String category, String dtCreate) {
		Connection conn = DBUtil.getConnection();
		List<Product> listProducts = new ArrayList<>();
		String whereFilters = "";

		try {
			PreparedStatement st = conn.prepareStatement("select * from product "
					+ "where (? is null or lower(prod_name) = ?) " + "and (? is null or lower(prod_category) = ?) "
					+ "and (? is null or to_char(prod_dt_create,'dd/MM/yyyy') = ?) ");

			st.setString(1, validadeFieldString(name));
			st.setString(2, validadeFieldString(name));
			st.setString(3, validadeFieldString(category));
			st.setString(4, validadeFieldString(category));
			st.setString(5, validadeFieldDate(dtCreate));
			st.setString(6, validadeFieldDate(dtCreate));
			ResultSet rs = st.executeQuery();

			System.out.println(rs.getStatement());

			while (rs.next()) {
				listProducts.add(new Product(rs.getInt("prod_id"), rs.getString("prod_name"),
						rs.getString("prod_category"), rs.getString("prod_price"), rs.getDate("prod_dt_create")));
			}
			return listProducts;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnnection(conn);
		}
		return null;
	}

	public static Product getProductByID(Integer id) {
		Connection conn = DBUtil.getConnection();
		Product p = null;

		try {
			PreparedStatement st = conn.prepareStatement("select * from product where prod_id=?");
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				p = new Product(rs.getInt("prod_id"), rs.getString("prod_name"), rs.getString("prod_category"),
						rs.getString("prod_price"), rs.getDate("prod_dt_create"));
			}
			return p;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnnection(conn);
		}
		return null;
	}

	public static int deleteProductByID(Integer id) {
		Connection conn = DBUtil.getConnection();

		try {
			PreparedStatement st = conn.prepareStatement("delete from product where prod_id=?");
			st.setInt(1, id);
			return st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnnection(conn);
		}
		return 0;
	}

	public static int addProduct(Product product) {
		Connection conn = DBUtil.getConnection();

		try {
			PreparedStatement st = conn.prepareStatement(
					"insert into product (prod_name,prod_category,prod_price,prod_dt_create) values (?,?,?,sysdate)");
			st.setString(1, product.getProdName());
			st.setString(2, product.getProdCategory());
			st.setString(3, product.getProdPrice());
			return st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnnection(conn);
		}
		return 0;
	}

	public static int updateProduct(Product product) {
		Connection conn = DBUtil.getConnection();

		try {
			PreparedStatement st = conn
					.prepareStatement("update product set prod_name=?,prod_category=?,prod_price=? where prod_id =?");
			st.setString(1, product.getProdName());
			st.setString(2, product.getProdCategory());
			st.setString(3, product.getProdPrice());
			st.setInt(4, product.getProdID());
			return st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnnection(conn);
		}
		return 0;
	}

	private static String validadeFieldString(String obj) {
		if (obj != null) {
			if (!((String) obj).trim().isEmpty()) {
				return ((String) obj).toLowerCase();
			}
		}
		return null;
	}

	private static String validadeFieldDate(String obj) throws ParseException {
		if (obj != null && !obj.isEmpty()) {

			// System.out.println(LocalDateTime.parse(obj));
			// System.out.println(LocalDate.parse(obj));
			//System.out.println(Instant.parse(obj));

			String dataformat = new SimpleDateFormat("dd/MM/yyyy").format(Date.from(Instant.parse(obj)));
			System.out.println(dataformat);

			return dataformat;
		}
		return null;
	}
}
