package mall.log;

public class Admin {
private static Log4J log = Log4J.getInstatnce();
	
	public static void login() {
		System.out.println(log.info());
	}

	public static void loginFail() {
		System.out.println(log.warn());
	}
}
