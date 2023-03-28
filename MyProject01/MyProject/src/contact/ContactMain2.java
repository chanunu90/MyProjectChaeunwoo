package contact;

import java.util.Scanner;

public class ContactMain2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
				
		System.out.println("나이를 입력하세요 >");
		String strAge = in.nextLine();	
		
		//이거 짱짱맨 문자를 숫자로 바꿔줌 진짜 짱짱임
		int age = Integer.parseInt(strAge);
			
		System.out.println(age + 5);
		
		if(age > 19) {
			System.out.println("성인임");
		}else {
			System.out.println(age + 5);
		}
		
	}

}
