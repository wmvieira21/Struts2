package action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import dao.LoginDAO;
import pojo.Login;

public class LoginAction extends ActionSupport implements Action {

	private String userName;
	private String password;
	private String error;

	public String execute() {

		if (LoginDAO.isUserValid(new Login(getUserName(), getPassword()))) {
			ServletActionContext.getRequest().getSession().setAttribute("userSession", userName);
			return SUCCESS;
		} else {
			setUserName(null);
			setPassword(null);
			addFieldError("error", "Invalid credentials");
			return INPUT;
		}
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
