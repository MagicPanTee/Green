import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		// scanner의 인스턴스 코드를 생성하는 문장 (Scanner 변수 선언 / Scanner 객체 생성)
		
		System.out.print("두 자리 정수를 입력해주세요.>");
		String input = scanner.nextLine();
		// Sring input = scanner.next(); 의 Method도 문자열출력에 사용가능하지만 공백 이전까지만 입력.
		// char input = scanner.next().charAt(0); 0에 있는 문자를 입력
		// int input = scanner.nextInt(); 정수값을 입력받는 Method.
		// double input = sacnner.nextDouble(); 실수값을 입력받는 Method.
	
		
		
		scanner.close(); 
		//교재에는 없으나, warning 방지를 위한 Code
		// (빨간줄 : err, 노란줄 : warning)
		
		int num = Integer.parseInt(input) ;
		
		System.out.println("입력내용:" + input);
		System.out.printf("num=%d\n", num);
		
// print : 줄을 바꾸지 않고 내용을 출력
// println : 줄 바꿈 후, 내용을 출력	
// printf : print와 거의 동일하나, 출력방식이 다름
// Crrl+Shift+O : Scanner Method 자동 완성
		
	}

}
