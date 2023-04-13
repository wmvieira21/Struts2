import com.opensymphony.xwork2.Action;

public class TestAction implements Action {

	private String message;
	private String firstName;

	public String execute() {
		this.message = "Action to jsp value";
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
