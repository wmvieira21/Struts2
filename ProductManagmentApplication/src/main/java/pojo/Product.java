package pojo;

import java.sql.Date;

public class Product {
	private Integer prodID;
	private String prodName;
	private String prodCategory;
	private String prodPrice;
	private java.sql.Date createDate;

	public Product(Integer prodID, String prodName, String prodCategory, String prodPrice, Date createDate) {
		super();
		this.prodID = prodID;
		this.prodName = prodName;
		this.prodCategory = prodCategory;
		this.prodPrice = prodPrice;
		this.createDate = createDate;
	}

	public Product(Integer prodID, String prodName, String prodCategory, String prodPrice) {
		super();
		this.prodID = prodID;
		this.prodName = prodName;
		this.prodCategory = prodCategory;
		this.prodPrice = prodPrice;
	}

	public Product(String prodName, String prodCategory, String prodPrice) {
		super();
		this.prodName = prodName;
		this.prodCategory = prodCategory;
		this.prodPrice = prodPrice;
	}

	public Integer getProdID() {
		return prodID;
	}

	public void setProdID(Integer prodID) {
		this.prodID = prodID;
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
