package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import dao.ProductManagementDAO;
import pojo.Product;

public class AddAction extends ActionSupport implements Action {

	private String prodName;
	private String prodCategory;
	private String prodPrice;

	public String execute() {
		if (ProductManagementDAO.addProduct(new Product(prodName, prodCategory, prodPrice)) > 0) {
			return SUCCESS;
		}
		return ERROR;
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

	public String getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(String prodPrice) {
		this.prodPrice = prodPrice;
	}

}
