
public class PrintfEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;	//long big = 100000000000L; / _은 가독성을 좋게하기 위함.
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010;	// 8진수 10, 10진수로는 8
		int hexNum = 0x10;	// 16진수 10, 10진수로는 16
		int binNum = 0b10;	// 2진수 10, 10진수로는 2
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c);	//int값 'A' 는 아스키 코드값으로 출력
		System.out.printf("finger=[%5d]%n", finger);	//[%5d] 뒤 5자리수까지 출력
		System.out.printf("finger=[%-5d]%n", finger);	//[-%5d] 앞 5자리수까지 출력 
		System.out.printf("finger=[%05d]%n", finger);	//[%05d] 빈자리에 0을 채워서 출력
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex);	// '#'은 접두사 (16진수 0x, 8진수 0)
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		

	}

}
