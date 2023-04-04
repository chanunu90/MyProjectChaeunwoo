package MyProject.quiz9.api;

import java.util.Scanner;

public class Quiz3ExamMain {

	public static void main(String[] args) {
		
		//사용자에게 이름을 입력 받아 -> 문자열 받는다!
		//입력 받은 문자열을 정상적인 문자열(영문자)의 이름으로 표현하는지 판별하고,
		//공백으로 입력되었는지도 판별하는 -> trim() 써서 공백지우고 -> isEmpty()로 공백이있는지(값이 입력이 되었는지) 확인한다.
		//                                                isEmpty() == 문자열의 랭스 값이 0인지 판별하는거다.
		//프로그램을 만들어봅시다. 
		
		Scanner in = new Scanner(System.in);
		System.out.print("이름을 입력해 주세요 >>  ");
		String name = in.nextLine().trim();
		
		if(name.isEmpty()) {
		
			System.out.println("공백입력은 허용하지 않습니다.");
		
		}else {
			
			if(checkName(name)) {
				System.out.println(name);
			}else {
				System.out.println("영문자만 입력이 가능합니다.");
			}
			
		}
		
	}
	//전달 받은 문자열이 영문자로 되어있는지 판별 : a~z A~Z 0~9
	public static boolean checkName(String name) {
		
		boolean result = true;
		//전달 받은 문자열 중에 영문자가 아닌 문자를 포합하고 있다면
		//result = false 를 넣어준다.
		
		for (int i =0 ; i < name.length(); i++) {
			char c = name.charAt(i);
			if(!(c>='a' && c<='z' || c>='A' && c<='Z')) {
				result = false;
				break;
			}
		}
		
		
		return result;
	}
	

}
