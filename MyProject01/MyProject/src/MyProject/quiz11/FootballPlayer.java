package MyProject.quiz11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;


import java.util.Comparator;
import java.util.HashMap;

public class FootballPlayer implements Comparable<FootballPlayer>{
	private String name;
	private int number;
	private String team;
	private int age;

	public FootballPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return this.team.charAt(team.length()-1)%5;
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		
		if(obj != null && obj instanceof FootballPlayer) {
			FootballPlayer sp = (FootballPlayer)obj;
			result = team.equals(sp.getTeam()) && name.equals(sp.getName()) && age == sp.getAge();
		}
		
		return result;
	}
	
	@Override
	public int compareTo(FootballPlayer o) {
		
		int result = 0;
		
		result = team.compareTo(o.getTeam());
		if(result == 0) {
			result = name.compareTo(o.getName());
			if(result == 0) {
				if(number == o.getNumber()) {
					result = 0;
				}else {
					result = number - o.getNumber();
				}
			}
		}
		return result;
	}
	

	public static void main(String[] args) {
		// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		System.out.println("----------------1번--------------------------");
		List<FootballPlayer> players = new ArrayList<>();

		players.add(new FootballPlayer("파이아이우 마이어", 13, "게르만", 30));
		players.add(new FootballPlayer("니클라스 쥘레", 25, "돌문 ", 25));
		players.add(new FootballPlayer("슈바인 슈타이거", 10, "마인츠", 40));
		players.add(new FootballPlayer("마리오 고메스", 9, "뮌헨 ", 35));
		players.add(new FootballPlayer("니클라스 쥘레", 25, "돌문 ", 25));
		players.add(new FootballPlayer("슐로터베크", 4, "독일 ", 21));
		players.add(new FootballPlayer("니코 슐로터베크", 4, "독일 ", 21));
		players.add(new FootballPlayer("코 슐로터베크", 4, "독일 ", 21));

		for (FootballPlayer player : players) {
			System.out.println("선수명 : " + player.name + "\t등번호 : " + player.number + "\t팀 : " + player.team + "\t나이 : "
					+ player.age);
		}
		
		// 2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 입력이 되지 않도록 Set<E> 컬렉션을 이용해서 축구선수 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		System.out.println("----------------2번--------------------------");
		HashSet<FootballPlayer> playersHash = new HashSet<>();

		playersHash.add(new FootballPlayer("파이아이우 마이어", 13, "게르만", 30));
		playersHash.add(new FootballPlayer("니클라스 쥘레", 25, "돌문 ", 25));
		playersHash.add(new FootballPlayer("슈바인 슈타이거", 10, "마인츠", 40));
		playersHash.add(new FootballPlayer("마리오 고메스", 9, "뮌헨 ", 35));
		playersHash.add(new FootballPlayer("니클라스 쥘레", 25, "돌문 ", 25));
		playersHash.add(new FootballPlayer("니코 슐로터베크", 4, "독일 ", 21));
		playersHash.add(new FootballPlayer("니코 슐로터베크", 4, "독일 ", 21));
		playersHash.add(new FootballPlayer("니코 슐로터베크", 4, "독일 ", 21));

		for (FootballPlayer player : playersHash) {
			System.out.println("선수명 : " + player.name + "\t등번호 : " + player.number + "\t팀 : " + player.team + "\t나이 : "
					+ player.age);
		}

		
		
		// 3. TreeSet<E>을 이용해서 팀 이름순으로 정렬하고, 같은 팀의 선수들은 이름 순으로 정렬하고, 같은 이름의 선수는 번호 순으로 저장하는 프로그램을 만들어 봅시다.
		System.out.println("----------------3번--------------------------");
		TreeSet<FootballPlayer> playersTree = new TreeSet<>();

		playersTree.add(new FootballPlayer("파이아이우 마이어", 13, "돌문 ", 30));
		playersTree.add(new FootballPlayer("슈바인 슈타이거", 10, "마인츠", 40));
		playersTree.add(new FootballPlayer("마리오 고메스", 9, "뮌헨 ", 35));
		playersTree.add(new FootballPlayer("나 쥘레    ", 25, "돌문 ", 25));
		playersTree.add(new FootballPlayer("가 슐로터베크", 4, "독일 ", 25));

//		playersTree.stream().forEach(System.out::println);
		for (FootballPlayer player : playersTree) {
			System.out.println("선수명 : " + player.name + "\t등번호 : " + player.number + "\t팀 : " + player.team + "\t나이 : "
					+ player.age);
		}
		
		
		
		// 4. 축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 Map<K,V> 인스턴스를 이용해서 프로그램을 만들어봅시다.
		HashMap<String,FootballPlayer> hashMap = new HashMap<>();

		//HashMap 은 add가 아닌 put으로 데이터를 넣는다.
		hashMap.put("001", new FootballPlayer("파이아이우 마이어", 13, "게르만", 30));
		hashMap.put("010-1111-2222", new FootballPlayer("마리오 고메스", 9, "뮌헨 ", 35));
		
		System.out.println("---------------------------------------");
		
		System.out.println(hashMap.get("001").team);
		System.out.println(hashMap.get("010-1111-2222").team);
		
		Set<String> keySet = hashMap.keySet();
		for(String keyName : keySet) {
			System.out.println(keyName + " : " + hashMap.get(keyName).name);
		}
		
		
		
	}

	

}
