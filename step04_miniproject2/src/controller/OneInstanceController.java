package controller;

import log.check.Log4J;
import model.OneInstanceModel;
import model.domain.OneInstance;
import view.EndView;

public class OneInstanceController {
	static Log4J log = Log4J.getInstance();
	
	public static void request(int reqNumber) {
		
		if(reqNumber ==1) { // 모든검색
			System.out.println(log.info());
			EndView.printAll(OneInstanceModel.getAll());
			
		}else if(reqNumber == 2) { //개인검색
			EndView.printTo(OneInstanceModel.search("김동범"));
			EndView.printTo(OneInstanceModel.search("석유진"));
			/*boolean f = OneInstanceModel.search("김동범"));
			if(f) {
				System.out.println(log.success());
			}else {
				System.out.println(log.warn());
			}*/
			
		}else if(reqNumber == 3) { //신규가입
			boolean r = OneInstanceModel.insert(new OneInstance(8,"CEO","서해상","VIP"));
			if(r) {
				EndView.printSuccess("가입을 축하드립니다");
			}else {
				EndView.printFail("가입실패");
			}
			
			
		}else if(reqNumber == 4) { //삭제
			boolean r = OneInstanceModel.delete("김동범");
			if(r) {
				System.out.println(log.success());
			}
			else{
				System.out.println(log.empty());
			}
			
		}else if(reqNumber == 5) { // 회원등급 향상
			boolean r = OneInstanceModel.update("석유진");
			if(r) {
				System.out.println(log.success());
			}else{
				System.out.println(log.empty());
			}
			
		}else {
			EndView.printFail("요청하신 정보는 서비스 할 수 없습니다");
		}
	}
		
		
		
	

	public static void main(String[] args) {

	}

}

