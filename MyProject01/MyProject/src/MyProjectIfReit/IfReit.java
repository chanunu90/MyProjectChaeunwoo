package MyProjectIfReit;

public class IfReit {

    public static void main(String[] args) {
        int num=120;
        String RESULT = null;
        if(num>0) {
      
        	RESULT = (num%2==0) ? "양수이면서 짝수" : "양수이면서 홀수";
                
        }
        
        System.out.println(RESULT);
    }
}
