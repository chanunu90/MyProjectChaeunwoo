package MyProject;

public class quiz3 {

	public static void main(String[] args) {
//		/JAVA에서 제공하는 연산자
//		 Calculator 클래스를 정의해봅시다.
//		 ① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의
//		 ② 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의
//		 ③ 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의
//		 ④ 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의
		
//		 ⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
//		 ⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의
//		 원의 둘레 : 2 x π x r , 월의 넓이 : π x r x r
		
//		 ⑦ main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
//		 ⑧ 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main() 메소드
//		 에 추가해봅시다.
		duhagi(7,9);
		bbegi(7,9);
		gobhagi(7,9);
		nanugi(7,9);
		dule(5.5f);
		nurbi(6.6f);
		
	}
	
	static void duhagi(int num1,int num2) {
		System.out.println("① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의");
		System.out.println(num1 + "+" + num2 + "=" + num1+num2);
		System.out.println();
	}
	
	static void bbegi(int num1,int num2) {
		System.out.println("② 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의");
		System.out.println(num1 + "+" + num2 + "=" + num1+num2);
		System.out.println();
	}
	
	static void gobhagi(int num1,int num2) {
		System.out.println("③ 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의");
		System.out.println(num1 + "+" + num2 + "=" + num1+num2);
		System.out.println();
	}
	
	static void nanugi(int num1,int num2) {
		System.out.println("④ 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의");
		System.out.println(num1 + "+" + num2 + "=" + num1+num2);
		System.out.println();
	}
	
	
	static void dule(float r) {
		System.out.println("⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의");
		System.out.println(2 + " x " + Math.PI + " x " + r + " = " + 2*Math.PI*r);
		System.out.println();
	}
	
	static void nurbi(float r) {
		System.out.println("⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의");
		System.out.println(Math.PI + " x " + r + " x " + r + " = " + Math.PI*r*r);
		System.out.println();
	}

}
