package MyProject;

public class Quiz5Member {
	//	/객체지향_인스턴스와 클래스 
	String name;
	String phoneNumber;
	String group;
	int grade;
	String email;
	String address;
	String birthday;

	//	1. Member 클래스에는 아래 요구사항에 맞는 변수와 메소드를 정의하고, main()메소드 에 해당 메소드를 호출해서 결과를 확인해보세요.
	//	단 인스턴스의 생성은 생성자를 이용해서 초기화하는 코드를 작성해 봅시다.
	
	//	① 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
	//	② 위에서 정의한 정보를 출력하는 메소드 정의
	//	③ 모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을 수 있는 생성자를 정의
	//	④ main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력

	public Quiz5Member(){
		this.name = "김민재";
		this.phoneNumber = "010-9245-0660";
		this.email = "justice@naver.com";
		this.grade = 3;
		this.address = "중남미";
		this.birthday = "0612";
		this.group = "나폴리";
	}
	public Quiz5Member(String name,String phoneNumber,String email,String address){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.grade = 1;
		this.address = address;
		this.birthday = "1206";
		this.group = "토트넘";
	}
	
	public void gogo() {
		System.out.println("이름:" + name);
		System.out.println("전화번호:" + phoneNumber);
		System.out.println("전공:" + group);
		System.out.println("학년:" + grade);
		System.out.println("이메일:" + email);
		System.out.println("주소:" + address);
		System.out.println("생일:" + birthday);
	}
	
	public static void main(String[] args) {
		
		Quiz5Member q5m1 = new Quiz5Member();
		q5m1.gogo();
		System.out.println();
		
		Quiz5Member q5m2 = new Quiz5Member("성시경","010-4546-6987","nunu@naver.com","우주어딘가");
		q5m2.gogo();
	}

}
