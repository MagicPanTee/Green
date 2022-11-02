
public class OperatorExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Java";
		String str2 = "JDK";
		
		String str3 = str1 + str2;
		String str4 = str1 + " " + str2;
		
		String str5 = "JDK" + 3 + 3.0;	
		// 연산자 우선순위에 의해 좌측부터 연산. (JDK와+3을 우선 수행하지만 문자열로 인식함. 3.0도 마찬가지로 실수자체를 문자열로 인식함)
		String str6 = 3 + 3.0 + "JDK";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		
		// 
	}

}
