package MyProject.quiz8;

public class quiz8Class implements quiz8_Calulator{

//	private int n1;
//	private int n2;
//	
//	public quiz8Class(int n1, int n2) {
//		this.n1 = n1;
//		this.n2 = n2;
//	}
	@Override
	public long add(long n1, long n2) {
		return n1+n2;
	}

	@Override
	public long substract(long n1, long n2) {
		return n1-n2;
	}

	@Override
	public long multiply(long n1, long n2) {
		return n1*n2;
	}

	@Override
	public double divide(double n1, double n2) {
		return n1/n2;
	}
	
	void showData(long num,char type) {
		if(type=='0') {
			System.out.println("두수의 더한수은 : " + num + "입니다.");
		}else if(type=='1') {
			System.out.println("두수의 뺀수는 : " + num + "입니다.");
		}else{
			System.out.println("두수의 곱한수는 : " + num + "입니다.");
		}
	}
	
	void showData(double num) {
		System.out.println("두수의 나눈수는 : " + num + "입니다.");
	}
	
	
}
