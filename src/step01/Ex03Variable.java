/* �н�����
 * 1. ����
 * 	1-1. Ÿ�Կ� ���� ����
 * 		1. �⺻
 * 			byte, short, int, long
 * 			float, dobule
 * 			char
 * 			boolean
 * 		2. ����
 * 			- �⺻�� ������ ��� Ÿ��
 * 	1-2. ���� ��ġ�� ���� ����
 * 		1. ���
 * 			- class {} ����
 * 		2. ����
 * 			- ������ �Ǵ� �޼ҵ��� parmeter
 */



package step01;
import model.domain.People;

public class Ex03Variable {

	public static void main(String[] args) {
		// People ��ü���� - new People()
		People people = new People();
		
		
		// People�� "��¦ �̸�", - ���� ����, setXxx(��)
		people.setName("�ѿ켮");
		people.setAge(-26);
		
		
		/* + �����
		 * 1. ���ڿ� ���� : ��� ����
		 * 2. ���� �̿��� �����Ϳ� ���� : ���� ���� */
		/*system.out.println(p.getName() + "" + p.getAge())
		 * System
		 * out
		 * println ���
		 * p
		 * getAge()
		 * println ���� ����
		 * ����
		 */
		//People�� getXxx() ȣ���ؼ� ���
		System.out.println(people.getName()+""+ people.getAge());
		
	}
}

