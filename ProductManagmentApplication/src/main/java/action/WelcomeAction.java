package action;

import java.sql.Date;
import java.util.List;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import dao.ProductManagementDAO;
import dbutil.DBUtil;
import pojo.Product;

public class WelcomeAction extends ActionSupport implements Action {
	private List<Product> products;
	private String prodName;
	private String prodCategory;
	private String createDate;

	public void initializeProducts() {
		System.out.println("Filter data");
		System.out.println(prodName);
		System.out.println(prodCategory);
		System.out.println(createDate);
		this.products = ProductManagementDAO.getProducts(prodName, prodCategory, createDate);
	}

	public String execute() {
		initializeProducts();
		return SUCCESS;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
}
