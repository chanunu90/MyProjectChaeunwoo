package project2;

import java.util.Arrays;
import java.util.Scanner;

public class SmartPhoneMain {
	
	public static void main(String[] args) {

		SmartPhone[] sp = new SmartPhone[4];
		Scanner in = new Scanner(System.in);
		boolean key = false;
		int count = 3;
		int num = 1;
		
		String name;
		String color;
		
		int typeNumber;
		float size;
		
		//초기 3번까지 예시
		sp[0] = new SmartPhone("차은우","화이트",4,9.8f);
		sp[1] = new SmartPhone("롤링발칸","블루",1,6.8f);
		sp[2] = new SmartPhone("헐크","바이올렛",2,3.5f);
		
		//배열에 값입력
		while(true){
			if(key) {
				break;
			}else {
				System.out.println("이름을 입력하세요 >> " );
				name = in.nextLine();
				
				System.out.println("색상을 입력하세요 >>" );
				color = in.nextLine();
				
				System.out.println("타입을 입력하세요 >>" );
				typeNumber = in.nextInt();
				
				System.out.println("크기를 입력하세요 >>" );
				size = in.nextFloat();
				
				sp[count] = new SmartPhone(name,color,typeNumber,size);
				
				System.out.println("정보를 추가하시겠습니까? 1을 입력 하시면 정보를 추가합니다." );
				if(in.nextInt() == num) {
					sp = Arrays.copyOf(sp, sp.length + 1);
					count++; //배열을 한칸 추가함
					num = 1;
					System.out.println("추가합니다." );
				}else {
					System.out.println("종료합니다" );
					key = true;
					num = 0;
				}
			
			}
		}

		
//		sp[3] = new SmartPhone("캡아","블루",3,4.8f);
//		sp[4] = new SmartPhone("로저스","블루",7,5.0f);
//		sp[5] = new SmartPhone("안드","옐로우",4,5.1f);
//		sp[6] = new SmartPhone("구글","에메랄드",5,5.2f);
//		sp[7] = new SmartPhone("핑퐁","초록",2,5.4f);
//		sp[8] = new SmartPhone("뽀글뽀글","스카이블루",1,5.5f);
//		sp[9] = new SmartPhone("아모","블루",1,5.8f);
		
		//출력
		System.out.println("이름\t색상\t타입\t크기");
		for(int i=0;i < sp.length; i++){
			System.out.println(sp[i].tosString());
		}
		
		
//		//무엇을도와드릴까요?
//		System.out.println("=========무엇을 도와드릴까요?===========");
//		System.out.println("1.검색\t2.추가\t 3.삭제");
		
	}
	

}
