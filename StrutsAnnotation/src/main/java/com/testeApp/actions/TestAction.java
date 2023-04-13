package com.testeApp.actions;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
/*
@Results({ @Result(name = "success", location = "/success.jsp"), @Result(name = "error", location = "/error.jsp") })

@Action("/testAction")
*/

public class TestAction extends ActionSupport implements com.opensymphony.xwork2.Action {

	@Action(value = "/testAction", results = { @Result(name = "success", location = "/success.jsp"),
			@Result(name = "error", location = "/error.jsp") })
	
	public String execute() {
		System.out.println("TestAction execute()");
		return SUCCESS;
	}

}
