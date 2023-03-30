package MyProject.quiz7;

public class PersonMain {

	public static void main(String[] args) {

		Person[] persons = new Person[2];
		
		persons[0] = new Male("수퍼맨", "851111");
		persons[1] = new Female("수퍼걸", "910511");
		
		
		for(Person p:persons) {
			p.showPrint();
		}
		
		
	}

}
