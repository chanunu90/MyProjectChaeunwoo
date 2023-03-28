package contact;

public class ContactMain {

	public static void main(String[] args) {
		Contact c = new Contact( "손흥민","010-5555-5555","son@gmail.com","런던","20001012","친구" );
		
		System.out.println("이름 : " + c.getName());
		System.out.println("전화번호 : " + c.getPhoneNumber());
		System.out.println("이메일 : " + c.getEmail());
		System.out.println("주소 : " + c.getAddress());
		System.out.println("생일 : " + c.getBirthday());
		System.out.println("그룹 : " + c.getGroup());
		System.out.println("--------------------------------------");
		c.printData();
		
		c.setPhoneNumber("010-9999-8888");
		c.setEmail("cew@naver.com");
		c.setAddress("알레스카 이글루 3번길");
		c.setBirthday("1990.09.01");
		System.out.println("--------------------------------------");
		c.printData();

	}
}
