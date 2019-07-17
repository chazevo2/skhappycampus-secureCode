package test.com;

public class UnitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1단계 : 기본 4자리
		// 4자리 형식의 숫자문자열 반환 => "0357"
		String secureCode = Utility.getSecureCode();
		System.out.println(secureCode);
		
		// 2단계 : 길이를 아규먼트로 전달받아서 해당 보안문자 반환
		// 에시 : "576532"
		String secureCode2 = Utility.getSecureCode(6);
		System.out.println(secureCode2);
		
	}

}
