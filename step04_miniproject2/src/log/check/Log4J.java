package log.check;

public class Log4J {
	private static Log4J instance = new Log4J();
	
	private Log4J(){};
	
	public static Log4J getInstance() {
		return instance;
	}
	
	public String info() {
		return "�ȳ��ϼ���,ȸ����";
	}
	public String warn() {
		return "���� ����";
	}
	public String success() {
		return "�ش� ��û�� �Ϸ�Ǿ����ϴ�";
	}
	public String empty() {
		return "�ش� ��û�� ó������ �ʾҽ��ϴ�";
	}
	
}
