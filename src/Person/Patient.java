package person;

import java.util.ArrayList;

public class Patient {
	private String name;
	private String age;
	private String phoneNumber;
	private String id;
	private HospitalDepartment hospitalDepartment;
	private String orderedTime;
	private Doctor doctor;
	private ArrayList<Medicine> medicines=new ArrayList<>();
	private ArrayList<ChargeItem> chargeItems=new ArrayList<>();
	
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
	public HospitalDepartment getHospitalDepartment() {
		return hospitalDepartment;
	}
	public void setHospitalDepartment(HospitalDepartment hospitalDepartment) {
		this.hospitalDepartment = hospitalDepartment;
	}
	public String getOrderedTime() {
		return orderedTime;
	}
	public void setOrderedTime(String orderedTime) {
		this.orderedTime = orderedTime;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	public ArrayList<Medicine> getMedicines() {
		return medicines;
	}
	public ArrayList<ChargeItem> getChargeItems() {
		return chargeItems;
	}
	public Patient(String name,String age,String phoneNumber,String id){
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.id = id;
	}
}
