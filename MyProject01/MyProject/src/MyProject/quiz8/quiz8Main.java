package MyProject.quiz8;

public class quiz8Main {

	public static void main(String[] args) {
		
		quiz8_Calulator q8 = new quiz8Class();
		((quiz8Class) q8).showData(q8.add(10, 11), '0');
		((quiz8Class) q8).showData(q8.substract(57, 47), '1');
		((quiz8Class) q8).showData(q8.multiply(22, 10), '2');
		((quiz8Class) q8).showData(q8.divide(5.8, 6.7));
		
		//quiz8_Calulator q8Interface = new quiz8Class();
		
	}
}
