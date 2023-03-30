package MyProject.quiz7;

public class Female extends Person{

	String size;
	
	public Female(String name, String pNumber) {
		super(name, pNumber);
		this.size = "177m입니다.";
	}
	
	
	@Override
	void showPrint() {
		super.showPrint();
		System.out.println("여자입니다." + size);
	}
	
}
