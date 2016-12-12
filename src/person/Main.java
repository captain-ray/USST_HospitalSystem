package person;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	static void initial() throws IOException {
		Scanner in = new Scanner(// �����˺�
				new FileInputStream(".\\data\\account.txt"));
		while (true) {
			try {
				String str = in.nextLine();
				String[] strs = str.split("\\s");
				Account account = new Account(strs[0], strs[1], strs[2]);
				Administor.accounts.add(account);
			} catch (Exception NoSuchElementException) {
				in.close();
				break;
			}
		}
		in = new Scanner(// ����ҽԺ����
				new FileInputStream(".\\data\\hospitalDepartment.txt"));
		while (true) {
			try {
				String str = in.nextLine();
				String[] strs = str.split("\\s");
				HospitalDepartment hospitalDepartment = new HospitalDepartment(strs[0], strs[1]);
				Administor.hospitalDepartments.add(hospitalDepartment);
			} catch (Exception NoSuchElementException) {
				in.close();
				break;
			}
		}
		in = new Scanner(// ����ҩƷ��Ϣ
				new FileInputStream(".\\data\\medicine.txt"));
		while (true) {
			try {
				String str = in.nextLine();
				String[] strs = str.split("\\s");
				double price = Double.parseDouble(strs[3]);
				Medicine medicine = new Medicine(strs[0], strs[1], strs[2], price, strs[4]);
				Administor.medicines.add(medicine);
			} catch (Exception NoSuchElementException) {
				in.close();
				break;
			}
		}
		in = new Scanner(// �����շ���Ŀ
				new FileInputStream(".\\data\\chargeItem.txt"));
		while (true) {
			try {
				String str = in.nextLine();
				String[] strs = str.split("\\s");
				double price = Double.parseDouble(strs[3]);
				ChargeItem chargeItem = new ChargeItem(strs[0], strs[1], strs[2], price, strs[4]);
				Administor.chargeItems.add(chargeItem);
			} catch (Exception NoSuchElementException) {
				in.close();
				break;
			}
		}
		// ���ļ�����ҺŲ�����Ϣ
		in = new Scanner(new FileInputStream(".\\data\\registerPatients.txt"));
		String str;
		while (true) {
			try {
				str = in.nextLine();
				String[] strs = str.split("\\s+");
				Charger.registerPatients.add(new Patient(strs[0], strs[1], strs[2], strs[3]));
			} catch (Exception NoSuchElementException) {
				in.close();
				break;
			}
		}
		// ���ļ�����ԤԼ������Ϣ
		in = new Scanner(new FileInputStream(".\\data\\orderPatients.txt"));
		while (true) {
			try {
				str = in.nextLine();
				String[] strs = str.split("\\s+");
				Charger.orderPatients.add(new Patient(strs[0], strs[1], strs[2], strs[3]));
			} catch (Exception NoSuchElementException) {
				in.close();
				break;
			}
		}
	}

}
