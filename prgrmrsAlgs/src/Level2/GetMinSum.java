package Level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
<문제> 
자연수로 이루어진 길이가 같은 수열 A,B가 있습니다. 
최솟값 만들기는 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱한 값을 누적하여 더합니다. 
이러한 과정을 수열의 길이만큼 반복하여 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표입니다.

예를 들어 A = [1, 2] , B = [3, 4] 라면

A에서 1, B에서 4를 뽑아 곱하여 더합니다.
A에서 2, B에서 3을 뽑아 곱하여 더합니다.
수열의 길이만큼 반복하여 최솟값 10을 얻을 수 있으며, 이 10이 최솟값이 됩니다.
수열 A,B가 주어질 때, 최솟값을 반환해주는 getMinSum 함수를 완성하세요.*/

/*
<나의 풀이(진행중)>
- 두 개의 수열에서 각각 1개의 숫자를 뽑음 => 두 개의 변수
- 두 수를 곱한 값의 최종 누적 값이 최소가 되어야 함 => 수열 A는 가장 작은 숫자부터, 수열 B는 가장 큰 숫자부터 매칭되어 곱해져야 함
 */

public class GetMinSum {
	public int getMinSum(int[] A, int[] B) {
		int answer = 0;
		int len = A.length;

		int num1[] = new int[len];
		int num2[] = new int[len];

		Arrays.sort(A);
		
		List<int[]> bList = Arrays.asList(B);
		Collections.reverse(bList);
		//B = bList.toArray(new int[bList.size()]);

		for (int a = 0; a < len; a++) {
			num1[a] = A[a];
		}
		for (int b = 0; b < len; b++) {
			num2[b] = B[b];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		GetMinSum test = new GetMinSum();
		int[] A = { 1, 2 };
		int[] B = { 3, 4 };
		System.out.println(test.getMinSum(A, B));
		
	}
}
