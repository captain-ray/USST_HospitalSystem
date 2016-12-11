package Person;

public class Patient {
	private String name;
	private String age;
	private String phoneNumber;
	private String orderedDepartment;
	private String time;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getOrderedDepartment() {
		return orderedDepartment;
	}
	public void setOrderedDepartment(String orderedDepartment) {
		this.orderedDepartment = orderedDepartment;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Patient(String name,String age,String phoneNumber,String orderedDepartment,String time){
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.orderedDepartment=orderedDepartment;
		this.time=time;
	}
}
