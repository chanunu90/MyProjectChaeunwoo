package quiz;

import java.util.Iterator;

public class Quiz {

	public static void main(String[] args) {
        //문제1.아래 예제는 두 개의 if문을 사용하고 있다. 한 개의 if 문만 사용하는 방식으로 변경해보자.
		System.out.println("문제1.아래 예제는 두 개의 if문을 사용하고 있다. 한 개의 if 문만 사용하는 방식으로 변경해보자.");
		int num=-1;
        String RESULT = null;
        if(num>0) {
        	RESULT = (num%2==0) ? "양수이면서 짝수" : "양수이면서 홀수";
        }else {
        	RESULT = (num%2==0) ? "음수이면서 짝수" : "음수이면서 홀수";
        }
        System.out.println(RESULT);
        System.out.println();
        
        
        //문제2.다음과 같이 출력이 이루어지도록 작성해보자.
        System.out.println("문제2.다음과 같이 출력이 이루어지도록 작성해보자.");
//      num < 0 이라면 “0 미만” 출력
//      0 ≤ num <100 이라면 “0이상 100 미만“ 출력
//      100 ≤ num < 200 이라면 “100이상 200 미만“ 출력
//      200 ≤ num < 300 이라면 “200이상 300 미만“ 출력
//      300 ≤ num 이라면 “300이상 “ 출력
        int num2 = 300;
        if(num2 < 0) {
        	System.out.println("0 미만");
        }else if(0 <= num2 && num2 < 100){
        	System.out.println("0이상 100 미만");
        }else if(100 <= num2 && num2 < 200){
        	System.out.println("100이상 200 미만");
        }else if(200 <= num2 && num2 < 300){
        	System.out.println("200이상 300 미만");
        }else{
        	System.out.println("300이상");
        }
        
        System.out.println();
        
        
        //문제3.CondOp.java를 조건연산자(3항 연산자)를 사용하지 않고, if~else를 사용하는 형태로 변경해 보자.
        System.out.println("문제3.CondOp.java를 조건연산자(3항 연산자)를 사용하지 않고, if~else를 사용하는 형태로 변경해 보자.");
        
        int num1=50, num3=100;
        int big, diff;
//        big = (num1>num2)? num1:num2;
        if(num1>num3) {
        	big = num1;
        }else {
        	big = num3;
        }
        System.out.println(big);
        
        if(num1>num3) {
        	diff = num1-num3;
        }else {
        	diff = num3-num1;
        }
        System.out.println(diff);
        System.out.println();
        
        //문제4.SwitchBreak.java를 switch문이 아닌, if~else를 사용하는 형태로 변경해 보자.
        System.out.println("문제4.SwitchBreak.java를 switch문이 아닌, if~else를 사용하는 형태로 변경해 보자.");
        int n=3;
        if(n == 1) System.out.println("Simple Java");
        else if(n == 2) System.out.println("Funny Java");
        else if(n == 3) System.out.println("Fantastic Java");
        else System.out.println("The best programming language");
        
        System.out.println("Do you like coffee?");
        System.out.println();
        
        //문제5.문제 2의 답안 코드를 switch 문으로 변경하여 보자.
        System.out.println("문제5.문제 2의 답안 코드를 switch 문으로 변경하여 보자.");
        //num < 0 이라면 “0 미만” 출력 부분은 if문을 사용하고 나머지 조건에 대해 변경하세요.
        num2 = 250;
        switch (num2/100) {
		case 0: {
			System.out.println("0이상 100 미만");
			break;
		}
		case 1: {
			System.out.println("100이상 200 미만");
			break;
		}
		case 2: {
			System.out.println("200이상 300 미만");
			break;
		}
		default:
			System.out.println("300이상");
		}
        
        System.out.println();
        
        //문제6.while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성.
        System.out.println("문제6.while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성.");
        num = 1;
        int sum = 0;
        while(num <= 99) {
        	sum = sum + num;
        	num++;
        }
        System.out.println("1~99까지 합:" + sum);
        System.out.println();
        
        //문제7.1부터 100까지 출력한 후, 다시 거꾸로 100부터 1까지 출력하는 프로그램을 작성. while문과 do~while 문을 각각 한번씩 사용해서 작성
        System.out.println("문제7.1부터 100까지 출력한 후, 다시 거꾸로 100부터 1까지 출력하는 프로그램을 작성. while문과 do~while 문을 각각 한번씩 사용해서 작성");
        System.out.println("-------whlie문-------");
        num = 0;
        boolean check = false;
        while (num < 100) {
        	++num;
			System.out.print(num + "\t");	
			if(num%10==0) {
				System.out.println();	
			}
			
			if (num == 100) {
				while (num > 0) {
		        	--num;
					System.out.print(num + "\t");	
					if(num%10==0) {
						System.out.println();	
					}
					
					if(num == 1) {
						check = true;
						break;
					}
					
				}
			}
			
			if(check) {
				break;
			}
			
		}
        System.out.println();
        System.out.println("-------do whlie문--------");

        num = 0;
        check = false;
        
        do {
        	
        	++num;
			System.out.print(num + "\t");	
			if(num%10==0) {
				System.out.println();	
			}
			
			if (num == 100) {
				while (num > 0) {
		        	--num;
					System.out.print(num + "\t");	
					if(num%10==0) {
						System.out.println();	
					}
					
					if(num == 1) {
						check = true;
						break;
					}
					
				}
			}
			
			if(check) {
				break;
			}
        	
        }while (num < 100);
        System.out.println();	
        
        
        
        //문제8.1000 이하의 자연수 중에서 2의 배수 이면서 7의 배수인 숫자를 출력하고, 그 출력된 숫자들의 합을 구하는 프로그램을 while 문을 이용해서 작성
        System.out.println("문제8.1000 이하의 자연수 중에서 2의 배수 이면서 7의 배수인 숫자를 출력하고, 그 출력된 숫자들의 합을 구하는 프로그램을 while 문을 이용해서 작성");
        num = 0;
        sum = 0;
        while(num < 1000) {
        	num++;

        	if(num%2==0&&num%7==0){
        		sum = sum + num;
        		System.out.println("2의 배수 이면서 7의 배수인 숫자 =" + num);
        	}
        }
        System.out.println("총합 =" + sum);
        System.out.println();
        
        //문제9.for 문을 이용하여 1부터 10까지를 곱해서 그 결과를 출력하는 프로그램을 작성
        System.out.println("문제9.for 문을 이용하여 1부터 10까지를 곱해서 그 결과를 출력하는 프로그램을 작성");
        
        int Multiplication = 1;
        for(int i = 1; i <= 10 ;i++ ) {
        	System.out.println(i + "x" + Multiplication + "=" + Multiplication * i);
        	Multiplication = Multiplication * i;
        }
        System.out.println("총합 =" + Multiplication);
        
        //문제10.for 문을 이용하여 구구단 중 5단을 출력하는 프로그램 작성
        System.out.println("문제10.for 문을 이용하여 구구단 중 5단을 출력하는 프로그램 작성");
        int i = 5;
    	for(int j = 1 ; j < 10; j++) {
    		System.out.println(i + "x" + j + "=" + i*j );
    	}
        
    	System.out.println();
    	//문제11.ContinueBasic.java의 내부에 존재하는 while 문을 for 문으로 변경하여 작성
        System.out.println("문제11.ContinueBasic.java의 내부에 존재하는 while 문을 for 문으로 변경하여 작성");
        
        int count=0;
        for(num = 1; num <= 100; num++){
            if(num%5!=0 || num%7!=0)
            continue;
            count++;
            System.out.println(num);
        }
        System.out.println("count: " + count);
        
        System.out.println();
    	//문제12.자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다.
        //그리고 그 합이 언제 (몇을 더했을 때) 1000이 넘어서는지,
        //그리고 1000이 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성.
        System.out.println("문제12.자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다. 그리고 그 합이 언제 (몇을 더했을 때) 1000이 넘어서는지, 그리고 1000이 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성.");
        num = 0;
        sum = 0;
        while(true) {
        	++num;
        	if(!(num%2==0)) {
        		System.out.println("기존 값에 홀수 " + num + " 을 더합니다. = " + (sum + num));
        		sum = sum + num;
        	}else if(num%3==0) {
        		System.out.println("기존 값에 3의배수 " + num + " 을 더합니다. = " + (sum + num));
        		sum = sum + num;
        	}
        	if(sum > 1000) {
        		System.out.println("총값이" + sum + "으로 1000을 넘어 종료합니다.");
        		break;
        	}
        	
        }
        
        System.out.println();
    	//문제13.구구단의 짝수 단(2,4,8)만 출력하는 프로그램 작성.
        //단, 2단은 2x2까지, 4단은 4x4까지, 8단은 8x8 까지 출력
        System.out.println("문제13.구구단의 짝수 단(2,4,8)만 출력하는 프로그램 작성.단, 2단은 2x2까지, 4단은 4x4까지, 8단은 8x8 까지 출력");
        for(i = 1 ; i <= 10; i++) {
        	if(i==2) {
        		for(int j = 1 ; j <= 2; j++) {
        			 System.out.printf( i + "x" + j + "=" + (i * j) + "\t");
        		}
        		System.out.println();
        	}else if((i==4)){
        		for(int j = 1 ; j <= 4; j++) {
        			System.out.printf( i + "x" + j + "=" + (i * j) + "\t");
        		}
        		System.out.println();
        	}else if((i==8)){
        		for(int j = 1 ; j <= 8; j++) {
        			System.out.printf( i + "x" + j + "=" + (i * j) + "\t");
        		}
        	}
        }
        System.out.println();
        //문제 14.다음 식을 만족하는 조합을 찾는 프로그램 작성
        System.out.println("문제 14");
        int A = 0;
        int B = 0;
        for(A = 1; A <=9; A++) {
        	for(B = 0; B <=9; B++) {
        		
        	}
        }
        
        System.out.println();
        //문제 15
        System.out.println("문제 15");
        System.out.println("if문");
        n=2;
        if(n==1){
        	System.out.println("현재 인원은 1명 입니다.");
        }else if(n==2) {
        	System.out.println("현재 인원은 2명 입니다.");
        }else if(n==3) {
        	System.out.println("현재 인원은 3명 입니다.");
        }else {
        	System.out.println("현재 많은 사람들이 있습니다.");
        }
        System.out.println("switch문");
        switch (n) {
		case 1: {
			System.out.println("현재 인원은 1명 입니다.");
			break;
		}
		case 2: {
			System.out.println("현재 인원은 2명 입니다.");
			break;
		}
		case 3: {
			System.out.println("현재 인원은 3명 입니다.");
			break;
		}
		default:
			System.out.println("현재 많은 사람들이 있습니다.");
		}
        System.out.println();
        //문제 16.1 부터 99까지의 합을 구하는 프로그램 작성 while문, for문, do while 문을 각각 사용
        System.out.println("문제 16.1 부터 99까지의 합을 구하는 프로그램 작성 while문, for문, do while 문을 각각 사용");
        
        System.out.println("---while문---");
        num = 1;
        sum = 0;
        while(num <= 99) {
        	sum = sum + num;
        	num++;
        }
        System.out.println("1~99까지 합:" + sum);
        
        System.out.println("---for문---");
        
        num = 1;
        sum = 0;
        for(i = 1; i <=99; i++) {
        	sum = sum + num;
        	num++;
        }
        System.out.println("1~99까지 합:" + sum);
        
        System.out.println("---do while문---");
        num = 1;
        sum = 0;
        do {
        	sum = sum + num;
        	num++;
        }while(num <= 99);
        System.out.println("1~99까지 합:" + sum);
        
        
        
        
	}

}
