
public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char)(c2 + 1);	// 산출 타입 : int
		// (char) 명시적 타입캐스팅 : 값의 손실이 발생할 때, 강제로 실행시키는 태그
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		
		
	}

}
