package person;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Administor extends Person{
	
	private ArrayList<Doctor> doctors=new ArrayList<>();
	private ArrayList<Charger> chargers=new ArrayList<>();
	
	static ArrayList<HospitalDepartment> hospitalDepartments = new ArrayList<>();
	static ArrayList<Medicine> medicines = new ArrayList<>();
	static ArrayList<ChargeItem> chargeItems = new ArrayList<>();
	
	public Administor(String userName, String password,String name,String id) {
		super(userName,password,name,id);
	}
	//添加医生账户
	public void addDoctor(String userName,String password,String name,String id,HospitalDepartment hospitalDepartment) throws IOException{
		doctors.add(new Doctor(userName,password,name,id,hospitalDepartment));
		//writeAccount("account.txt");
	}
	//添加挂号收费人员账户
	public void addCharger(String userName,String password,String name,String id) throws IOException{
		chargers.add(new Charger(userName,password,name,id));
		//writeAccount("account.txt");
	}
	//添加科室
	public void addHospitalDepartment(String name,String no) throws IOException{
		Administor.hospitalDepartments.add(new HospitalDepartment(name,no));
		//writeAccount("hospitalDepartment.txt");
	}
	//添加药品
	public void addMedicine(String name,String shortName,String unit,double price,String no) throws IOException{
		Administor.medicines.add(new Medicine(name,shortName,unit,price,no));
		//writeAccount("medicine.txt");
	}
	//添加收费项目
	public void addChargeItem(String name,String shortName,String unit,double price,String no) throws IOException{
		Administor.chargeItems.add(new ChargeItem(name,shortName,unit,price,no));
		//writeAccount("chargeItem.txt");
	}
	//修改账户
	/*public String alterAccount(String userName,String newPassword,String newType) throws IOException{
		int mark=0;
		for(Account a : Administor.accounts){
			if(a.getUserName().equals(userName)){
				a.setPassword(newPassword);
				a.setType(newType);
				mark=1;
				break;
			}
		}
		//writeAccount("account.txt");
		if(mark==0) return "无该账号！";
		return "修改成功！";
	}*/
	//修改科室
	public String alterHospital(String no,String newName) throws IOException{
		int mark=0;
		for(HospitalDepartment a : Administor.hospitalDepartments){
			if(a.getNo().equals(no)){
				a.setName(newName);
				mark=1;
				break;
			}
		}
		//writeAccount("hospitalDepartment.txt");
		if(mark==0) return "无该科室！";
		return "修改成功！";
	}
	//修改药品
	public String alterMedicine(String shortName,String newNo,String newUnit,String newPrice) throws IOException{
		int mark=0;
		for(Medicine a : Administor.medicines){
			if(a.getShortName().equals(shortName)){
				a.setNo(newNo);
				a.setUnit(newUnit);
				double price = Double.parseDouble(newPrice);
				a.setPrice(price);
				mark=1;
				break;
			}
		}
		//writeAccount("medicine.txt");
		if(mark==0) return "无该药品！";
		return "修改成功！";
	}
	//修改收费项目
	public String alterChargeItem(String shortName,String newNo,String newUnit,String newPrice) throws IOException{
		int mark=0;
		for(ChargeItem a : Administor.chargeItems){
			if(a.getShortName().equals(shortName)){
				a.setNo(newNo);
				a.setUnit(newUnit);
				double price = Double.parseDouble(newPrice);
				a.setPrice(price);
				mark=1;
				break;
			}
		}
		//writeAccount("chargeItem.txt");
		if(mark==0) return "无该项目！";
		return "修改成功！";
	}
	//删除账号
	/*public String deleteAccount(String userName) throws IOException{
		int mark=0;
		for(Account a:Administor.accounts){
			if(a.getUserName().equals(userName)){
				accounts.remove(a);
				mark=1;
				break;
			}
		}
		writeAccount("account.txt");
		if(mark==0) return "删除失败！";
		return "删除成功！";
	}*/
	//删除科室
	public String deleteHospitalDepartment(String name) throws IOException{
		int mark=0;
		for(HospitalDepartment a:Administor.hospitalDepartments){
			if(a.getName().equals(name)){
				hospitalDepartments.remove(a);
				mark=1;
				break;
			}
		}
		//writeAccount("hospitalDepartment.txt");
		if(mark==0) return "删除失败！";
		return "删除成功！";
	}
	//删除药品
	public String deleteMedicine(String name) throws IOException{
		int mark=0;
		for(Medicine a:Administor.medicines){
			if(a.getName().equals(name)){
				medicines.remove(a);
				mark=1;
				break;
			}
		}
		//writeAccount("medicine.txt");
		if(mark==0) return "删除失败！";
		return "删除成功！";
	}
	//删除项目
	public String deleteChargeItem(String name) throws IOException{
		int mark=0;
		for(ChargeItem a:Administor.chargeItems){
			if(a.getName().equals(name)){
				medicines.remove(a);
				mark=1;
				break;
			}
		}
		//writeAccount("chargeItem.txt");
		if(mark==0) return "删除失败！";
		return "删除成功！";
	}
	//将改变的结果写回文件
	/*public void writeAccount(String fileName) throws IOException{
		FileWriter file = new FileWriter(fileName);
		for(Account a : Administor.accounts){
			file.write(a.getUserName()+" "+a.getPassword()+a.getType());
		}
		file.close();
	}*/
	public void writeHospitalDepartment(String fileName) throws IOException{
		FileWriter file = new FileWriter(fileName);
		for(HospitalDepartment a : Administor.hospitalDepartments){
			file.write(a.getName()+" "+a.getNo());
		}
		file.close();
	}
	public void writeMedicine(String fileName) throws IOException{
		FileWriter file = new FileWriter(fileName);
		for(Medicine a : Administor.medicines){
			file.write(a.getName()+" "+a.getShortName()+" "+a.getUnit()+" "+a.getPrice()+" "+a.getNo());
		}
		file.close();
	}
	public void writeChargeItem(String fileName) throws IOException{
		FileWriter file = new FileWriter(fileName);
		for(ChargeItem a : Administor.chargeItems){
			file.write(a.getName()+" "+a.getShortName()+" "+a.getUnit()+" "+a.getPrice()+" "+a.getNo());
		}
		file.close();
	}
/*	public static void main(String[] args) throws IOException {
		Administor admin = new Administor("123456","000000");
		for(Administor.Account a:Administor.accounts){
			System.out.println(a.getUserName()+" "+a.getPassword()+" "+a.getType());
		}
		for(Administor.HospitalDepartment a:Administor.hospitalDepartments){
			System.out.println(a.getName());
		}
		for(Administor.Medicine a:Administor.medicines){
			System.out.println(a.getName()+" "+a.getShortName()+" "+a.getUnit()+" "+a.getPrice());
		}
		for(Administor.ChargeItem a:Administor.chargeItems){
			System.out.println(a.getName()+" "+a.getShortName()+" "+a.getUnit()+" "+a.getPrice());
		}
	}*/
}
//系统账户类
class Account{
	private String userName;
	private String password;
	private String type;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Account(String userName,String password,String type){
		this.userName=userName;
		this.password=password;
		this.type=type;
	}
}
//医院科室类
class HospitalDepartment{
	private String name;
	private String no;//编号
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public HospitalDepartment(String name,String no){
		this.name = name;
		this.no = no;
	}
	
}
//药品类
class Medicine{
	private String name;
	private String shortName;//拼音简码
	private String unit;
	private double price;
	private String no;
	private boolean state=false;//指示收费状态，false表示未收费
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public Medicine(String name,String shortName,String unit,double price,String no){
		this.name=name;
		this.shortName=shortName;
		this.unit=unit;
		this.price=price;
		this.no=no;
	}
}
//收费项目类
class ChargeItem{
	private String name;
	private String shortName;
	private String unit;
	private double price;
	private String no;
	private boolean state=false;//指示收费状态，false表示未收费
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public ChargeItem(String name,String shortName,String unit,double price,String no){
		this.name=name;
		this.shortName=shortName;
		this.price=price;
		this.unit=unit;
		this.no=no;
	}
}