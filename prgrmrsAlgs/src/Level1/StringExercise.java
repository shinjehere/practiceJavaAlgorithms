package Level1;

/*getMiddle메소드는 하나의 단어를 입력 받습니다. 
단어를 입력 받아서 가운데 글자를 반환하도록 getMiddle메소드를 만들어 보세요. 
단어의 길이가 짝수일경우 가운데 두글자를 반환하면 됩니다.
예를들어 입력받은 단어가 power이라면 w를 반환하면 되고, 입력받은 단어가 test라면 es를 반환하면 됩니다.*/

public class StringExercise{
    String getMiddle(String word){

 // 단어의 길이/2 의 위치에 있는 글자   	
 // String을 배열로 저장
 // 해당 위치에 있는 글자를 반환. 
    	
    	char[] array = word.toCharArray();
    	int middle = array.length/2;
    	char result = ' ';
    	
    	if(array.length%2 == 0) {
    		result += array[middle] + array[middle+1];
    	}else {
    		result += array[middle+1];
    	}
    	
    	return String.valueOf(result);    
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}
