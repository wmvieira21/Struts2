package com.testApp.validators;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class DomainNameValidator extends FieldValidatorSupport {
	
	//<param name="domainName">gmail.com</param>
	private String domainName;

	@Override
	public void validate(Object arg0) throws ValidationException {
		// TODO Auto-generated method stub
		System.out.println("DomainNameValidator validate()");
		// String validDomain = "gmail.com";
		String fieldName = getFieldName();
		String fieldValue = (String) getFieldValue(fieldName, arg0);

		if (!fieldValue.endsWith(domainName)) {
			addFieldError(fieldName, arg0);
		}
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

}
