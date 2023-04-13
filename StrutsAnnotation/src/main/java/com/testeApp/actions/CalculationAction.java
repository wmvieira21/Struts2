package com.testeApp.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

public class CalculationAction extends ActionSupport implements com.opensymphony.xwork2.Action {

	// @Action("/calculate1")
	@Action(value = "/calculate1", results = { @Result(name = "success", location = "/success.jsp") })
	public String calculateEMI() {
		System.out.println("calculateEMI");
		return SUCCESS;
	}

	@Action(value = "/calculate2", results = { @Result(name = "error", location = "/error.jsp") })
	public String calculateEMC() {
		System.out.println("calculateEMC");
		return ERROR;
	}

	@Action(value = "/calculate3", results = { @Result(name = "success", location = "/success.jsp") })
	public String calculateEMD() {
		System.out.println("calculateEMD");
		return SUCCESS;
	}

}
