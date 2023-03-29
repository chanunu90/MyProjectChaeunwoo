package MyProject.quiz6;

public class Quiz6StudentMain2 {

	public static void main(String[] args) {
		
		String[] name = {
				"캉진리",
				"반다이크",
				"발베르데",
				"코아테스",
				"손흥민",
				"하리카네",
				"아자르",
				"토르강",
				"오현규",
				"차은우",
		};
		int[][] scores = {
				{ 90, 90, 85   },
				{ 84, 56, 20   },
				{ 62, 84, 30   },
				{ 32, 85, 50   },
				{ 100, 55, 43  },
				{ 19, 32, 56   },
				{ 85, 54, 14   },
				{ 84, 87, 69   },
				{ 95, 38, 68   },
				{ 100, 100, 100}
		};
		
		for(int i= 0; i < name.length ; i++) {
				System.out.println("이름:" + name[i]  + " , 국어점수:" + scores[i][0]+ " , 수학점수:"  + scores[i][1]+  " , 영어점수:"  + scores[i][2]);
		}
	
	}
	
}
