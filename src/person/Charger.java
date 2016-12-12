package person;

import java.util.ArrayList;

public class Charger extends Person{
	static ArrayList<Patient> registerPatients=new ArrayList<>();//�ҺŲ���
	static ArrayList<Patient> orderPatients = new ArrayList<>();//ԤԼ����
	public Charger(String userName,String password,String name,String id){
		super(userName,password,name,id);
	}
	//δԤԼ���˹Һ�
	public void createRegister(Patient patient,Doctor doctor,HospitalDepartment hospitalDepartment){
		patient.setDoctor(doctor);
		patient.setHospitalDepartment(hospitalDepartment);
		/**����Ϣд���ļ�**/
	}
	//��ѯ�Ƿ�Ϊ��ԤԼ����
	public boolean findInOder(Patient patient){
		for(Patient p : orderPatients){
			if(patient.getId().equals(p.getId()))
				return true;
		}
		return false;
	}
	//�շ�
	public String charge(Patient patient){
		double sum=0;
		for(int i=0;i<patient.getChargeItems().size();i++){
			sum+=patient.getChargeItems().get(i).getPrice();
			patient.getChargeItems().get(i).setState(true);
		}
		for(int i=0;i<patient.getMedicines().size();i++){
			sum+=patient.getMedicines().get(i).getPrice();
			patient.getMedicines().get(i).setState(true);
		}
		return "���շ�"+sum+"Ԫ";
	}
	
	
}
