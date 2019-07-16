package mall.log;

public class Log4J {
	private static Log4J instance = new Log4J();
	private Log4J() {}
	public static Log4J getInstatnce() {
		return instance;
	}
	
	public String info() {
		return "접속되었습니다";
	}
	
	public String warn() {
		return "권한이 없습니다";
	}
}
