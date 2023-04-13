package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import dao.ProductManagementDAO;

public class DeleteAction extends ActionSupport implements Action {

	private Integer prodId;

	public String execute() {
		if (ProductManagementDAO.deleteProductByID(prodId) > 0) {
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

}
