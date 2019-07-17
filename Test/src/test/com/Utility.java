package test.com;

import java.util.Random;

public class Utility {
	public static StringBuilder secureCode = null;

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
	
	public static String getSecureCode2(int x) {
		StringBuilder secureCode = new StringBuilder("");
		Random randoms = new Random();
		int randomInt = 0;
		boolean b = false;
		char randomChar = 'a';
		for (int i = 0; i < x; i++) {
			b = randoms.nextBoolean();
			if(b) {
				randomInt = (int) (Math.random() * 10);
				secureCode.append(randomInt);
			} else {
				randomChar = (char)((int)(Math.random() * 26) + 65);
				secureCode.append(randomChar);
			}
		}
		return secureCode.toString();
	};
}
