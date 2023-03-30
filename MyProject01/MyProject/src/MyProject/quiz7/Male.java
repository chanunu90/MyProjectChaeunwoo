package MyProject.quiz7;

public class Male extends Person{

	String size;
	
	public Male(String name, String pNumber) {
		super(name, pNumber);
		this.size = "203cm입니다.";
	}
	
	
	@Override
	void showPrint() {
		super.showPrint();
		System.out.println("남자입니다." + size);
	}
	
}
