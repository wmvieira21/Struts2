package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import dao.ProductManagementDAO;
import pojo.Product;

public class UpdateDataAction extends ActionSupport implements Action {

	private Integer prodId;
	private String prodName;
	private String prodCategory;
	private String prodPrice;

	public String execute() {
		/*
		 * Params coming from the URL. They're being set automaticly;
		 */

		/*
		 * Searching the database based on the id;
		 * 
		 * Product p = ProductManagementDAO.getProductByID(prodId); setProdId(prodId);
		 * setProdName(p.getProdName()); setProdCategory(p.getProdCategory());
		 * setProdPrice(p.getProdPrice());
		 */
		return SUCCESS;
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

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

}
