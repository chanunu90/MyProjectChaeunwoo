package MyProject;

public class Quiz6Student {

//	Student 클래스를 정의해봅시다.
//	① 학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다.
//	② 변수는 캡슐화를 합니다. getter/setter 메소드를 정의합니다.
//	③ 총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.

	private String studentName;
	private int koreanScore;
	private int mathScore;
	private int englishScore;
	
	public Quiz6Student(String studentName, int koreanScore, int mathScore, int englishScore) {
		
		this.studentName = studentName;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;

	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getKoreanScore() {
		return koreanScore;
	}

	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}
	
	@Override
	public String toString() {
		return "학생정보 [학생이름 : " + studentName + ", 국어점수 : " + koreanScore + ", 수학점수 : " + mathScore + ", 영어점수 : " + englishScore + ", 총점 : " +(koreanScore+mathScore+englishScore)+ ", 평균 : " + (float)((koreanScore+mathScore+englishScore)/3) +"]";
	}
	
}
