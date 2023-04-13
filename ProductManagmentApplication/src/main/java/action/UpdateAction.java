package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import dao.ProductManagementDAO;
import pojo.Product;

public class UpdateAction extends ActionSupport implements Action {
	
	private Integer prodId;
	private String prodName;
	private String prodCategory;
	private String prodPrice;

	public String execute() {
		if (ProductManagementDAO.updateProduct(new Product(prodId, prodName, prodCategory, prodPrice)) > 0) {
			return SUCCESS;
		}
		return ERROR;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
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
