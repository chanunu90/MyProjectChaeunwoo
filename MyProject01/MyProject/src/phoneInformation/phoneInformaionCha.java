package phoneInformation;

public class phoneInformaionCha {
	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	private String birthday;
	private String group;
	
	phoneInformaionCha(){
		name = "값이 없습니다.";
		phoneNumber = "값이 없습니다.";
		email = "값이 없습니다.";
		address = "값이 없습니다.";
		birthday = "값이 없습니다.";
		group = "값이 없습니다.";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	public void printData() {
		
		System.out.println("이름은 : >> " + getName());
		System.out.println("연락처는 : >> " + getPhoneNumber());
		System.out.println("이메일은 : >> " + getEmail());
		System.out.println("주소는 : >> " + getAddress());
		System.out.println("생일은 : >> " + getBirthday());
		System.out.println("그룹은 : >> " + getGroup());
		
		
		
	}
	

}
