import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class RegistrationAction extends ActionSupport implements Action {

	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private Integer age;

	public String execute() {
		System.out.println("execute() RegistrationAction");
		return SUCCESS;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}
	
	/*@Override
	public void validate() {
		if (getFirstName().equals("")) {
			//error from the properties file I18n
			addFieldError("firstName", getText("error.firstName.required"));
		}
		if (getLastName().equals("")) {
			addFieldError("lastName", "Last name is required!");
		}
		if (getGender() == null) {
			addFieldError("gender", "Gender is required!");
		}
		if (getAge() == null) {
			addFieldError("age", "Age is required!");
		} else if (getAge() < 18) {
			addFieldError("age", "Age must be above 18!");
		}
		if (getEmail().equals("")) {
			addFieldError("email", "Email is required!");
		}
	}
	*/
	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
