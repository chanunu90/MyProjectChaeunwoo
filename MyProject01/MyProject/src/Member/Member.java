package Member;

public class Member {

	private String name;
	private String phoneNumber;
	private String major;
	private int grade;
	private String email;
	private String birthday;
	private String address;
	
	public Member(
			String name, 
			String phoneNumber, 
			String major, 
			int grade,
			String email, 
			String birthday,
			String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}
	
	public Member(
			String name, 
			String phoneNumber, 
			String major, 
			int grade,
			String email
			) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
//		this.birthday = "입력 데이터가 없습니다.";
//		this.address = "입력 데이터가 없습니다.";
	}
	

	public void printDate() {
		System.out.println("이름:" + name);
		System.out.println("전화번호:" + phoneNumber);
		System.out.println("전공:" + major);
		System.out.println("학년:" + grade);
		System.out.println("이메일:" + email);
		
//		if(birthday != null){
//			System.out.println("생일:" + birthday);
//		}else {
//			System.out.println("생일: 미입력");
//		}
		System.out.println("생일:" + (birthday != null? birthday:"생일: 미입력"));
		
		if(address != null){
			System.out.println("주소:" + address);
		}else {
			System.out.println("주소: 미입력");
		}
	}

	
	public static void main(String[] args) {
		Member mb = new Member("김민재", "010-5478-6321", "싸이클", 4, "son@naver.com" ,null ,"지구촌 중남미 어딘가");
		mb.printDate();
		
		System.out.println();
		
		Member mb2 = new Member("박지성", "010-7458-3321", "야구", 1, "son@naver.com");
		mb2.printDate();
		
		
		
	}
	
	
	
}
