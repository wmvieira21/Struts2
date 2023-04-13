package com.testeApp.actions.user;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

/*Comment annotations to use struts.xml file*/
@ResultPath("/view")
@Action ("/getDetails")
@Result(name = "success", location = "user.jsp")

@Namespace("/user")
/*Namespace is not necessary due to the package structure actions.user
 * When using struts.xml is required to define in the package tag*/

public class UserDetailsAction extends ActionSupport implements com.opensymphony.xwork2.Action {

	public String execute() {
		System.out.println("UserDetailsAction execute()");
		return SUCCESS;
	}

}
