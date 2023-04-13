import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class RegistrationAction extends ActionSupport implements Action {

	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private Integer age;
	private String address;
	private String selectedColor;
	private String selectedColorMult;
	private List<String> listColors;
	private boolean subscribe;
	private List<String> hobbies;
	private String selectedHobbies;
	private List<Product> products;

	public String initializeFieldsForm() {
		initializeColors();
		initializeHobbies();
		initializeProducts();
		this.setSubscribe(true);
		return INPUT;
	}

	public void initializeColors() {
		listColors = new ArrayList<>();
		listColors.add("Blue");
		listColors.add("Black");
		listColors.add("Red");
		listColors.add("Yellow");
	}

	public void initializeHobbies() {
		hobbies = new ArrayList<>();
		hobbies.add("Drawing");
		hobbies.add("Teaching");
		hobbies.add("Programming");
	}
	
	public void initializeProducts() {
		products = new ArrayList<>();
		products.add(new Product(1, "Iphone", 300.99));
		products.add(new Product(2, "TV", 800.99));
		products.add(new Product(3, "Macbook", 1000.99));
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public boolean isSubscribe() {
		return subscribe;
	}

	public void setSubscribe(boolean subscribe) {
		this.subscribe = subscribe;
	}

	public String getSelectedColorMult() {
		return selectedColorMult;
	}

	public void setSelectedColorMult(String selectedColorMult) {
		this.selectedColorMult = selectedColorMult;
	}

	public String execute() {
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

	/*
	 * @Override public void validate() { if (getFirstName().equals("")) {
	 * addFieldError("firstName", "First name is required!"); } if
	 * (getLastName().equals("")) { addFieldError("lastName",
	 * "Last name is required!"); } if (getGender() == null) {
	 * addFieldError("gender", "Gender is required!"); } if (getAge() == null) {
	 * addFieldError("age", "Age is required!"); } else if (getAge() < 18) {
	 * addFieldError("age", "Age must be above 18!"); } if (getEmail().equals("")) {
	 * addFieldError("email", "Email is required!"); } }
	 */

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSelectedColor() {
		return selectedColor;
	}

	public void setSelectedColor(String selectedColor) {
		this.selectedColor = selectedColor;
	}

	public List<String> getListColors() {
		return listColors;
	}

	public void setListColors(List<String> listColors) {
		this.listColors = listColors;
	}

	public String getSelectedHobbies() {
		return selectedHobbies;
	}

	public void setSelectedHobbies(String selectedHobbies) {
		this.selectedHobbies = selectedHobbies;
	}
}
