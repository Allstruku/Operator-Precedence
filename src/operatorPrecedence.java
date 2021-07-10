
public class operatorPrecedence {
	public static void main(String[] args) { 
		int a = 5;
		int b = 10;
		int c = 15;
		System.out.println(a - b *c); //b와 c가 먼저 곱해진 다음 a-가 진행이된다
		System.out.println((a - b) * c); //a - b를 먼저 연산한 다음 c 값에 곱해진다 
		System.out.println(a > 5 && b > 5); //a > 5가 거짓인것과 b > 5는 사실이라는 결과를 먼저 계산한다. 하지만 logical AND 연산자 때문에 왼쪽 condition이 true로 계산
											// 안되면서 전체가 거짓으로 result return한다
		System.out.println(a > 5 || b > 5); //a > 5가 거짓인것과 b > 5는 사실이라는 결과를 먼저 계산한다. 하지만 logical OR 연산자 때문에 한 condition이 false로 계산을
											// 진행해도 전체가 사실으로 result return한다
		System.out.println(++ a - 5); // ++는 증가연산자이다. 변수 앞에 있기 때문에 전이연산자이다. 산수연산자인 - 5 보다 계산순위가 더 높기 때문에 a 변수에 1을 더한 다음 - 5가
									  // 진행된다
		System.out.println(a);
		
		a = 5;
		System.out.println(a ++ - 5); // ++는 증가연산자이다. 변수 뒤에 있기 떄문에 후이연산자이다. 산수연산자인 - 5 보다 계산순위가 더 높지만, 후이연산자이기 때문에 산수연산이 
									  // 진행이 된 다음 증가연산자가 진행이 된다.
		System.out.println(a);
	}
}
