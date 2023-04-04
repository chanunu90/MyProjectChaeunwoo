package MyProject.quiz10;

import java.util.Scanner;
//콘솔에서 사용자 아이디를 입력 받아 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램을 만들어봅시다.
//① 사용자 예외 클래스를 정의해서 예외를 발생 시켜 봅시다.
//② 예외 클래스 이름은 BadIdInputException이라고 정의합시다.
public class BadIdInputExceptionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영문자와 숫자를 입력해주세요.");
		
		String value = sc.nextLine();
		
		
		if(value.isEmpty()) {
			
			System.out.println("공백입력은 허용하지 않습니다.");
		
		}else {
			
			for (int i =0 ; i < value.length(); i++) {
				char c = value.charAt(i);
				
				try {
					if(!(c>='a' && c<='z' || c>='A' && c<='Z' || '0'<=c && '9'>=c)) {
						BadIdInputException e = new BadIdInputException("영문자 또는 숫자만 입력이 가능합니다.");
						throw e;
						
					}
				}catch (BadIdInputException e) {
					System.out.println(e.getMessage());
					break;
				}
				
				
			}
			
		}
		System.out.println();
		System.out.println("입력된 값은 : "+ value + " 입니다.");
		

	
		
	}

}
