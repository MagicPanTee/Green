
public class OperaorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1000000;
		int y = 1000000;
		
		int iz = x * y;	// 변수 type을 8byte의 메모리 용량을 가진 long으로 바꿔야함
		long lz1 = (long)x * (long)y;	// 타입 캐스팅이 연산보다 우선 수행됨
		long lz2 = (long)(x * y);	// 괄호 안에 x*y를 넣어서 연산이 우선 수행됨.
		long lz3 = (long) x * y;
		
		System.out.println(iz);
		System.out.println(lz1);
		System.out.println(lz2);
		System.out.println(lz3);
	}

}
