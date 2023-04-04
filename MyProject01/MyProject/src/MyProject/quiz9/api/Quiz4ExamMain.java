package MyProject.quiz9.api;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit; // 값을 날짜 단위로 비교할수 있다.

public class Quiz4ExamMain {

	public static void main(String[] args) {
		//자신의 생일을 기준으로 오늘까지 몇 일을 살았는지 출력하는 프로그램을 만들어봅시다. 
		
		LocalDate birthday = LocalDate.of(1990,12,6);
		LocalDate now = LocalDate.now();
		
		System.out.println("오늘 : " + now);
		System.out.println("태어난 시 : " + birthday);
		
		//ChronoUnit.DAYS.between지정 일부터 현재까지의 시간을 알 수 있다. 
		long days = ChronoUnit.DAYS.between(birthday, now);
		System.out.println("지금까지 "  + days + "일 살았다.");
		
		LocalDate cays = LocalDate.parse("2023-12-25");
		System.out.println("크리스마스 : "  + cays);
		
		long days2 = ChronoUnit.DAYS.between(cays, now);
		System.out.println(days2);

	}

}
