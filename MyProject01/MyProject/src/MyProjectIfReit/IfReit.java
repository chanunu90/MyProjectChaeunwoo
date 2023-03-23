package MyProjectIfReit;

public class IfReit {

    public static void main(String[] args) {
    	
        int num=120;
        String RESULT = null;
        if(num>0) {
      
        	RESULT = (num%2==0) ? "양수이면서 짝수" : "양수이면서 홀수";
                
        }
        
        System.out.println("문제1.아래 예제는 두 개의 if문을 사용하고 있다. 한 개의 if 문만 사용하는 방식으로 변경해보자.");
        System.out.println(RESULT);
    }
}
