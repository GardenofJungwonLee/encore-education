package mall.log;

public class Log4J {
	private static Log4J instance = new Log4J();
	private Log4J() {}
	public static Log4J getInstatnce() {
		return instance;
	}
	
	public String info() {
		return "���ӵǾ����ϴ�";
	}
	
	public String warn() {
		return "������ �����ϴ�";
	}
}
