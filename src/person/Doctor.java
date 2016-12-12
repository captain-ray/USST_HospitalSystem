package person;

import java.util.*;

public class Doctor extends Person{
	private Queue<Patient> patients=new LinkedList<>();
	private HospitalDepartment hospitalDepartment;
	
	
	public Queue<Patient> getPatients() {
		return patients;
	}


	public void setPatients(Queue<Patient> patients) {
		this.patients = patients;
	}


	public HospitalDepartment getHospitalDepartment() {
		return hospitalDepartment;
	}


	public void setHospitalDepartment(HospitalDepartment hospitalDepartment) {
		this.hospitalDepartment = hospitalDepartment;
	}


	public Doctor(String userName, String password, String name, String id,HospitalDepartment hospitalDepartment) {
		super(userName, password, name, id);
		this.hospitalDepartment=hospitalDepartment;
	}
	//开处方
	public void prescribe(Patient patient,ArrayList<ChargeItem> chargeItems,ArrayList<Medicine> medicines){
		for(int i=0;i<chargeItems.size();i++){
			patient.getChargeItems().add(chargeItems.get(i));
		}
		chargeItems=null;
		for(int i=0;i<medicines.size();i++){
			patient.getMedicines().add(medicines.get(i));
		}
		medicines=null;
	}
	//显示收费项目
	public String showChargeItem(Patient patient){
		String ans="";
		for(int i=0;i<patient.getChargeItems().size();i++){
			ans+=patient.getChargeItems().get(i).getName()
					+"\t"+patient.getChargeItems().get(i).getUnit()
					+"\t"+patient.getChargeItems().get(i).getPrice();
		}
		return ans;
	}
	//显示药品
	public String showMedicine(Patient patient){
		String ans="";
		for(int i=0;i<patient.getMedicines().size();i++){
			ans+=patient.getMedicines().get(i).getName()
					+"\t"+patient.getMedicines().get(i).getUnit()
					+"\t"+patient.getMedicines().get(i).getPrice();
		}
		return ans;
	}
}
