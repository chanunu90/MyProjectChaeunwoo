package MyProject.quiz9.api;

public class Quiz1Person {

	String name;
	String personNumber;
	
	public Quiz1Person(String name, String personNumber) {
		super();
		this.name = name;
		this.personNumber = personNumber;
	}

	//1.위 Person 클래스의 equals() 메소드를 오버라이딩해서 
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		//주민등록번호가 같으면 인스턴스로 판별하는 프로그램을 만들어봅시다. 
		//매개변수로 전달받은 obj를 Person 타입으로 형변환( null이 아닌 상태에서 형변환 여부 체크 )
		//-> personNumber 비교 => 결과값을 result 에 대입
		if(obj!=null&& obj instanceof Quiz1Person) {
			Quiz1Person p = (Quiz1Person)obj;
			result = this.personNumber.equals(p.personNumber);
		}

		return result;
	}
	
	
	public static void main(String[] args) {
		Quiz1Person p1 = new Quiz1Person("차은우","901206-10333333" );
		Quiz1Person p2 = new Quiz1Person("피카츄","901206-10333333" );

		System.out.println(p1.equals(p2));
	}
	
	
	
	

}
