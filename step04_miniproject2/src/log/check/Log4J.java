package log.check;

public class Log4J {
	private static Log4J instance = new Log4J();
	
	private Log4J(){};
	
	public static Log4J getInstance() {
		return instance;
	}
	
	public String info() {
		return "안녕하세요,회원님";
	}
	public String warn() {
		return "권한 없음";
	}
	public String success() {
		return "해당 요청이 완료되었습니다";
	}
	public String empty() {
		return "해당 요청이 처리되지 않았습니다";
	}
	
}
