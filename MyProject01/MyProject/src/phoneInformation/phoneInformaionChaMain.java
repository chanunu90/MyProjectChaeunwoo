package phoneInformation;

import java.util.Scanner;

public class phoneInformaionChaMain {
	
	public static void main(String[] args) {
		phoneInformaionCha cha = new phoneInformaionCha();
		Scanner in = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 >>");
		cha.setName(in.nextLine());
		System.out.print("연락처를 입력하세요 >>");
		cha.setPhoneNumber(in.nextLine());
		System.out.print("이메일을 입력하세요 >>");
		cha.setEmail(in.nextLine());
		System.out.print("주소를 입력하세요 >>");
		cha.setAddress(in.nextLine());
		System.out.print("생일을 입력하세요 >>");
		cha.setBirthday(in.nextLine());
		System.out.print("그룹을 입력하세요 >>");
		cha.setGroup(in.nextLine());
		
		
		cha.printData();
		
		
		
		
		
	}

}
