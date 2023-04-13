package com.testApp.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.CustomValidator;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.ValidationParameter;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import com.testApp.validators.DomainNameValidator;

@Action("/registerAction")
@Results({ @Result(name = "success", location = "/welcome1.jsp"), @Result(name = "input", location = "/register.jsp") })

public class RegistrationAction extends ActionSupport implements com.opensymphony.xwork2.Action {

	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private Integer age;

	public String execute() {
		System.out.println("execute() RegistrationAction");
		return SUCCESS;
	}

	@RequiredStringValidator(type = ValidatorType.SIMPLE, fieldName = "firstName", message = "First name is required")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@RequiredStringValidator(type = ValidatorType.SIMPLE, fieldName = "lastName", message = "Last name is required")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@RequiredFieldValidator(type = ValidatorType.SIMPLE, fieldName = "gender", message = "Gender is required")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@RequiredStringValidator(type = ValidatorType.SIMPLE, fieldName = "email", message = "Email name is required")
	@EmailValidator(type = ValidatorType.SIMPLE, fieldName = "email", message = "Email is not valid")
	
	@CustomValidator(type = "domainNameValidator", fieldName = "email", message = "Email must have a GMAIL domain", parameters = {
			@ValidationParameter(name = "domainName", value = "gmail.com") })
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@RequiredFieldValidator(type = ValidatorType.SIMPLE, fieldName = "age", message = "Age is required")
	@IntRangeFieldValidator(type = ValidatorType.SIMPLE, fieldName = "age", message = "Age must be over 18", min = "18")
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	/*
	 * @Override public void validate() { if (getFirstName().equals("")) { //error
	 * from the properties file I18n addFieldError("firstName",
	 * getText("error.firstName.required")); } if (getLastName().equals("")) {
	 * addFieldError("lastName", "Last name is required!"); } if (getGender() ==
	 * null) { addFieldError("gender", "Gender is required!"); } if (getAge() ==
	 * null) { addFieldError("age", "Age is required!"); } else if (getAge() < 18) {
	 * addFieldError("age", "Age must be above 18!"); } if (getEmail().equals("")) {
	 * addFieldError("email", "Email is required!"); } }
	 */
}
