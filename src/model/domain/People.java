/* ����� ������ �����ϰ� �Ǵ� ����
 * ������ ����, �����ϴ� ���
 * ��, age�� 1���̻��� �����͸� ��� : ��ȿ�� ����
 * age ���� ����
 * 	1. �ܺο��� 32bit int (+-)�� ������ �� 1 �̻��� �����͸� ���Եǰ� ����
 * 	2. age ��� ������ ���� ȣ���ϸ� 32bit�� ��� ������ �� ���� �ޱ� ������ ���� ȣ�� ����
 * 		- private ���� ����
 * 	3. ������ �޼ҵ�� ��ȿ�� ���� ���� �ݿ��ؼ� 1 �̻��� �����͸� ����
 * 		- public
 */


package model.domain;

public class People {
	//�������
	private String name;
	private int age;
	public People() {
		
	}
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
//	//������
//	public People() {} //������ ȣ�� new People();
//	
//	//��ü ���� ������ ����ڰ� ���ϴ� �����ͷ� ��ü�� ����� �� ����(�ʱ�ȭ)
//	public People(String n, int a){//new People("",2);
//		name = n;
//		age = a;
//	
//	}
	
	
}
	//name ������ ����, ����
	
	
	

	
	/* void setName(String name){
	 * 	this.name=name
	 * 	}
	 * 
	 *	String getName(){
	 *		return name;
	 *}
	 */
	
	//age ������ ����[1�� �̻��� ����� �����͸� ���. ����], ����

