
public class PrintfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "www.codechobo.com";
		
		float f1 = .10f;	// 0.010, 1.0e+1
		float f2 = 1e1f;	// 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;	// float type은 값의 뒤에 f를 작성, double type은 값에 소수점이 있으면 double로 인식
		double d = 1.23456789;
		
		System.out.printf("f1=%f, %e, %g%n", f1, f2, f3);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10fn", d);	// 전체 14자리 중 소수점 10자리
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);	// 왼쪽정렬
		System.out.printf("[%.8s]%n", url);		// 왼쪽에서 8글자만 출력
	}

}
