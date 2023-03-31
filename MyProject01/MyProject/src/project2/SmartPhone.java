package project2;

//프로젝트-1 에서 정의한 Contact 클래스를 기반으로 아래 요구사항을 추가해서 프로그램을 작성 합니다.

//1.SmartPhone 클래스를 정의합니다. 이 클래스는 연락처 정보를 관리하는 클래스입니다.
//① Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다.
//② 배열에 인스턴스를 저장하고, 수정하고, 삭제, 저장된 데이터의 리스트를 출력하는 메소드를 정의합니다.

//2.main()메소드를 아래의 요구조건을 정의해봅니다.
//① SmartPhone 클래스의 인스턴스를 생성합니다.
//② 사용자로부터 입력을 받아 Contact 인스턴스를 생성해서 SmartPhone 클래스의 인스턴스가 가지고 있는 배열에 추가합니다.
//③ 10번 반복해서 배열에 추가합니다.
//④ 배열의 모든 요소를 출력합니다.
//⑤ 배열의 모든 요소를 검색합니다.
//⑥ 배열의 요소를 삭제해 봅시다.
//⑦ 배열의 요소를 수정해 봅시다.

public class SmartPhone {

	private String name;
	private String color;
	
	private int typeNumber;
	private float size;

	//그냥 메소드
	public SmartPhone(String name,String color,int typeNumber,float size) {
		this.name = name;
		this.color = color;
		this.typeNumber = typeNumber;
		this.size = size;
		
	}
	
	//수정들어갈때 사용하는 메소드
	public SmartPhone(String name,String color,int typeNumber,float size,String updateType) {
		this.name = name;
		this.color = color;
		this.typeNumber = typeNumber;
		this.size = size;
		//타입번호에 따라 1검색/2업데이트/3삭제
		dataUpdate(updateType);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTypeNumber() {
		return typeNumber;
	}

	public void setTypeNumber(int typeNumber) {
		this.typeNumber = typeNumber;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}
	
	void dataUpdate(String updateType){
		
	}
	
	public String tosString() {
		
		return name + "\t"+ color +"\t"+typeNumber+"\t"+size;
	}
	
}
