package Level1;

import java.util.Arrays;

/*두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환해주는 gcdlcm 함수를 완성해 보세요. 
 배열의 맨 앞에 최대공약수, 그 다음 최소공배수를 넣어 반환하면 됩니다. 
 예를 들어 gcdlcm(3,12) 가 입력되면, [3, 12]를 반환해주면 됩니다.*/


/*
 * [유클리드 호제법 알고리즘]
 * 두 개의 자연수의 최대공약수를 계산하는 알고리즘.
 * 1. 두 수를 입력받는다.
 * 2. 두 수 중 큰 수와 작은 수를 구분한다.
 * 3. 두 수를 나눈 나머지가 0일때까지 큰수와 작은수를 나눈다.
 * 4. 나머지가 0이 되는 순간 큰수가 최대공약수이다.
 * 5. 처음 입력받은 두수의 곱을 최대공약수로 나누면 최소공배수가된다.
 * */

public class GCDnLCM {
	public int[] gcdlcm(int a, int b) {
		int[] answer = new int[2];

		int num = 1;
		int mtp = a * b;

		while (num != 0) {
			num = b%a;
			b=a;
			a=num;
		}

		answer[0] = b;
		answer[1] = mtp/b;
		
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		GCDnLCM c = new GCDnLCM();
		System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
	}
}
