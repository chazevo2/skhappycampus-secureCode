package test.com;

public class UnitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1�ܰ� : �⺻ 4�ڸ�
		// 4�ڸ� ������ ���ڹ��ڿ� ��ȯ => "0357"
		String secureCode = Utility.getSecureCode();
		System.out.println(secureCode);
		
		// 2�ܰ� : ���̸� �ƱԸ�Ʈ�� ���޹޾Ƽ� �ش� ���ȹ��� ��ȯ
		// ���� : "576532"
		String secureCode2 = Utility.getSecureCode(6);
		System.out.println(secureCode2);
		
	}

}
