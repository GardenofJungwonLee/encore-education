/* �н� ���� 
 * 1. ���ǹ� ���� �ϴ� ���
 * 2. ��Ȳ
 * 		1. ���� ��Ȳ�� �ϳ��� ��� - if
 * 		2. ���� ��Ȳ�� �������� ��� - if ~else if
 * 		3. ���� �񱳽� �� �����Ͱ� �⺻ Ÿ��? ���� Ÿ��?
 * 3. ����
 * 		1. if
 * 		2. swutch
 * 4. ��������
 * 	- Ŭ������ ������ ��� ����(������), �޼ҵ�(���) ���� ����� ���� ��������
 * 		: ��ü ������ ��ü�� �����ϴ� ���� ������ ����, �޼ҵ� ȣ��
 * 
 * 	- �����ϰ� ��ü ���� ���̵� �޼ҵ�, ������ ȣ�� �����ϰ� ���ִ� Ű����
 * 		: static
 * 
 * 5. ��ü ���� ����
 * 	1. ��ü���� ��� ����
 * 		new ������( [..] );
 * 	2. new ������ ���̵� ������ ǥ��� ������ ��ü�� �Ǵ� Ÿ��
 * 		String Ÿ�� ""
 */


package step01;

public class Ex04Object {

	public static void main(String[] args) {
		/* B ��ü�� ���������� �����Ǵ� process
		 * ������ ��� ����������� �Ϻ��ϰ� �޸𸮿� �����Ǹ� �������� ��ü ���� �Ϸ�
		 * B ��ü�� ���� �Ϸ�Ǵ� ������ ������ ����������� �Ϻ��ϰ� �����Ǵ°� ��������
		 * A ��ü�� �Ϻ��ϰ� ���� -> B ��ü �����Ϸ�
		 */
		B b = new B();

	}

}

class A{
	A(){
		System.out.println("A");
	}
}

class B{
	A a = new A();
	B(){
		System.out.println("B");
	}
}