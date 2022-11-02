import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		// Scanner 선언 및 객체 생성 
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
//		System.out.print(n1+100 +" ");
//		System.out.println(n2%10);
		
//		System.out.print(n1);
//		System.out.print(" ");
//		System.out.println(n2);
		
		n1 = n1 + 100;
		n2 = n2 % 10;
		
		System.out.print(n1 + " " + n2);
	}

}
