package Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Administor {
	private String userName;
	private String password;
	static ArrayList<Account> accounts = new ArrayList<>();
	static ArrayList<HospitalDepartment> hospitalDepartments = new ArrayList<>();
	static ArrayList<Medicine> medicines = new ArrayList<>();
	static ArrayList<ChargeItem> chargeItems = new ArrayList<>();
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
		public ChargeItem(String name,String shortName,String unit,double price,String no){
			this.name=name;
			this.shortName=shortName;
			this.price=price;
			this.unit=unit;
			this.no=no;
		}
	}
	//初始化，将文件导入数据结构
	public Administor(String userName,String password) throws IOException{
		this.userName=userName;
		this.password=password;
		Scanner in = new Scanner(//导入账号
				new FileInputStream(".\\data\\account.txt"));
		while(true){
			try{
				String str=in.nextLine();
				String[] strs=str.split("\\s");
				Administor.Account account=new Administor.Account(strs[0],strs[1],strs[2]);
				Administor.accounts.add(account);
			}catch(Exception NoSuchElementException){
				in.close();
				break;
			}
		}
		in = new Scanner(//导入医院科室
				new FileInputStream(".\\data\\hospitalDepartment.txt"));
		while(true){
			try{
				String str=in.nextLine();
				String[] strs=str.split("\\s");
				Administor.HospitalDepartment hospitalDepartment=new Administor.HospitalDepartment(strs[0],strs[1]);
				Administor.hospitalDepartments.add(hospitalDepartment);
			}catch(Exception NoSuchElementException){
				in.close();
				break;
			}
		}
		in = new Scanner(//导入药品信息
				new FileInputStream(".\\data\\medicine.txt"));
		while(true){
			try{
				String str=in.nextLine();
				String[] strs=str.split("\\s");
				double price = Double.parseDouble(strs[3]);
				Administor.Medicine medicine=new Administor.Medicine(strs[0],strs[1],strs[2],price,strs[4]);
				Administor.medicines.add(medicine);
			}catch(Exception NoSuchElementException){
				in.close();
				break;
			}
		}
		in = new Scanner(//导入收费项目
				new FileInputStream(".\\data\\chargeItem.txt"));
		while(true){
			try{
				String str=in.nextLine();
				String[] strs=str.split("\\s");
				double price = Double.parseDouble(strs[3]);
				Administor.ChargeItem chargeItem=new Administor.ChargeItem(strs[0],strs[1],strs[2],price,strs[4]);
				Administor.chargeItems.add(chargeItem);
			}catch(Exception NoSuchElementException){
				in.close();
				break;
			}
		}
	}
	
	//添加账户
	public void addAccount(String userName,String password,String type){
		Administor.accounts.add(new Account(userName,password,type));
	}
	//添加科室
	public void addHospitalDepartment(String name,String no){
		Administor.hospitalDepartments.add(new HospitalDepartment(name,no));
	}
	//添加药品
	public void addMedicine(String name,String shortName,String unit,double price,String no){
		Administor.medicines.add(new Medicine(name,shortName,unit,price,no));
	}
	//添加收费项目
	public void addChargeItem(String name,String shortName,String unit,double price,String no){
		Administor.chargeItems.add(new ChargeItem(name,shortName,unit,price,no));
	}
	//修改账户
	public String alterAccount(String userName,String newPassword,String newType){
		int mark=0;
		for(Account a : Administor.accounts){
			if(a.getUserName().equals(userName)){
				a.setPassword(newPassword);
				a.setType(newType);
				mark=1;
				break;
			}
		}
		if(mark==0) return "无该账号！";
		return "修改成功！";
	}
	//修改科室
	public String alterHospital(String no,String newName){
		int mark=0;
		for(HospitalDepartment a : Administor.hospitalDepartments){
			if(a.getNo().equals(no)){
				a.setName(newName);
				mark=1;
				break;
			}
		}
		if(mark==0) return "无该科室！";
		return "修改成功！";
	}
	//修改药品
	public String alterMedicine(String shortName,String newNo,String newUnit,String newPrice){
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
		if(mark==0) return "无该药品！";
		return "修改成功！";
	}
	//修改收费项目
	public String alterChargeItem(String shortName,String newNo,String newUnit,String newPrice){
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
		if(mark==0) return "无该项目！";
		return "修改成功！";
	}
	//删除账号
	public String deleteAccount(String userName){
		int mark=0;
		for(Account a:Administor.accounts){
			if(a.getUserName().equals(userName)){
				accounts.remove(a);
				mark=1;
				break;
			}
		}
		if(mark==0) return "删除失败！";
		return "删除成功！";
	}
	//删除科室
	public String deleteHospitalDepartment(String name){
		int mark=0;
		for(HospitalDepartment a:Administor.hospitalDepartments){
			if(a.getName().equals(name)){
				hospitalDepartments.remove(a);
				mark=1;
				break;
			}
		}
		if(mark==0) return "删除失败！";
		return "删除成功！";
	}
	//删除药品
	public String deleteMedicine(String name){
		int mark=0;
		for(Medicine a:Administor.medicines){
			if(a.getName().equals(name)){
				medicines.remove(a);
				mark=1;
				break;
			}
		}
		if(mark==0) return "删除失败！";
		return "删除成功！";
	}
	//删除项目
	public String deleteChargeItem(String name){
		int mark=0;
		for(ChargeItem a:Administor.chargeItems){
			if(a.getName().equals(name)){
				medicines.remove(a);
				mark=1;
				break;
			}
		}
		if(mark==0) return "删除失败！";
		return "删除成功！";
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
