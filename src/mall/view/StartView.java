package mall.view;

import java.util.Scanner;

import mall.controller.MallController;
import mall.log.Admin;
import mall.model.dto.StoreDetail;
import mall.model.dto.StoreInfo;
import mall.model.dto.StoresInfo;;

public class StartView {

	public static void main(String[] args) {
		
	    // Admin 권한 확인 (log4j)
        Scanner scanner = new Scanner(System.in);
        String id = null;
        System.out.print("아이디를 입력해주세요 : ");
        id = scanner.next();         
        scanner.close();
        if(id.equals("admin")) {
           Admin.login();
        } else {
           Admin.loginFail();
           return;
        }
		
        
		MallController controller = MallController.getInstance();
	
		//새로운 store
		StoreInfo newStoreInfo = new StoreInfo("3층", "리빙", "가구");
		StoreDetail newStoreDetail = new StoreDetail("2019년 3월", 250, 50, 50);
		StoresInfo newStore = new StoresInfo("F", newStoreInfo, newStoreDetail );
		
		
	//모든 store 출력
			System.out.println("===모든 Stroe 출력===");
			controller.allStoresListView();
	
	//특정 store 검색 및 출력	
			System.out.println("===검색 Stroe 출력===");
			controller.StoreView("A");
	
	//새로운 store 추가
			System.out.println("===새로운 Stroe 추가 후 전체 출력===");
			controller.insertStore(newStore);
			controller.allStoresListView();
			
	//검색한 store 삭제
			System.out.println("===검색한 Store 삭제===");
			controller.deleteStore("ad");
//			controller.allStoresListView();
			
	//검색한 store 수정
			System.out.println("===검색한 Stroe DetailInfo 수정===");
			controller.updateStore("A", new StoreDetail("2019년 2월", 200, 40000000, 40000000));
			controller.StoreView("A");
	
	
	//JSON 형식으로 변환 및 출력
			System.out.println("\"===================json형식으로 변환출력===================");
			controller.jsonView();
	
	
	//특정 층수 store 검색 및 출력
			System.out.println("===특정 층수 Stroe 검색 및 출력===");
			controller.viewFloorStoreInfo("1층");
			
	//특정 층수 임차료 합산
			System.out.println("===특정 층수 보증금 합산 및 출력===");
			controller.viewFloorStoreInfo("1층");
	}
}