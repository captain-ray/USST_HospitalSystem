package person;

import java.util.ArrayList;

public class Charger extends Person{
	static ArrayList<Patient> registerPatients=new ArrayList<>();//挂号病人
	static ArrayList<Patient> orderPatients = new ArrayList<>();//预约病人
	public Charger(String userName,String password,String name,String id){
		super(userName,password,name,id);
	}
	//未预约病人挂号
	public String createRegister(Patient patient,Doctor doctor,HospitalDepartment hospitalDepartment){
		patient.setDoctor(doctor);
		patient.setHospitalDepartment(hospitalDepartment);
		/**将信息写回文件**/
	}
	//查询是否为已预约病人
	public boolean findInOder(Patient patient){
		for(Patient p : orderPatients){
			if(patient.getId().equals(p.getId()))
				return true;
		}
		return false;
	}
	
	
}
