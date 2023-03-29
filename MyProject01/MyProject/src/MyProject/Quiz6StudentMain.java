package MyProject;

public class Quiz6StudentMain {

	public static void main(String[] args) {
		
		Quiz6Student[] mb = new Quiz6Student[10];
		
		mb[0] = new Quiz6Student("캉진리", 90, 90, 85);
		mb[1] = new Quiz6Student("반다이크", 84, 56, 20);
		mb[2] = new Quiz6Student("발베르데", 62, 84, 30);
		mb[3] = new Quiz6Student("코아테스", 32, 85, 50);
		mb[4] = new Quiz6Student("손흥민", 100, 55, 43);
		mb[5] = new Quiz6Student("하리카네", 19, 32, 56);
		mb[6] = new Quiz6Student("아자르", 85, 54, 14);
		mb[7] = new Quiz6Student("토르강", 84, 87, 69);
		mb[8] = new Quiz6Student("오현규", 95, 38, 68);
		mb[9] = new Quiz6Student("차은우", 100, 100, 100);
		
		for(Quiz6Student srudent : mb) {
			System.out.println(srudent.toString());
		}
		
	}
	
}
