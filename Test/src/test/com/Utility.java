package test.com;

public class Utility {
	public static StringBuilder secureCode;

	public static String getSecureCode() {
		StringBuilder secureCode = new StringBuilder("");
		int random = 0;
		for (int i = 0; i < 4; i++) {
			random = (int) (Math.random() * 10);
			secureCode.append(random);
		}
		return secureCode.toString();
	};
	
	public static String getSecureCode(int x) {
		StringBuilder secureCode = new StringBuilder("");
		int random = 0;
		for (int i = 0; i < x; i++) {
			random = (int) (Math.random() * 10);
			secureCode.append(random);
		}
		return secureCode.toString();
	};
}
