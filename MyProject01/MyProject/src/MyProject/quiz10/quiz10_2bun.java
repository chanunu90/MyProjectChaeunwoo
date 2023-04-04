package MyProject.quiz10;

import java.util.Scanner;

public class quiz10_2bun {
	
	//Scanner 클래스로 태어난 년도를 입력 받을 때 int 타입으로 받도록 합시다.
	//이때 nextInt() 메소드를 사용하게 되는데 이때 발생하는 예외처리를 하도록 합시다. 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int value = 0;
		System.out.println("태어난 연도를 입력하세요.");
	
		try {
			value = in.nextInt();
			if(String.valueOf(value).length() != 4 || value > 3000) {
				quiz10_2bun_ex e = new quiz10_2bun_ex("정확한 4자리 연도를 입력해주세요 ex)1990");
				throw e;
			}else {
				System.out.println(value + "년생 나이는 " + ( 2024 - value));
			}
		}catch (quiz10_2bun_ex e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("숫자만 입력하세요");
		} finally {
//			System.out.println("입력이 완료되었습니다.");
		}
		
	}

}
