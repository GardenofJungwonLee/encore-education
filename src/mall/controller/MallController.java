package mall.controller;

import java.util.ArrayList;

import mall.exception.NotExistException;
import mall.model.dto.StoresInfo;
import mall.service.MallService;
import mall.view.EndView;
import mall.view.FailView;
import net.sf.json.JSONObject;

public class MallController {
	
	private static MallController instance = new MallController();
	private MallService service = MallService.getInstance();
	
	private MallController() {}
	
	public static MallController getInstance() {
		return instance;
	}
	
	//모든 store 검색
		public void allStoresListView() {
			ArrayList<StoresInfo> StoresList = service.getAllStoresInfo();		
			if(StoresList.size() != 0) {
				EndView.allStoresListView(StoresList);	
			}else {
				EndView.messageView("진행중인 프로젝트는 존재하지 않습니다.");
			}
		}
		
	//검색 store view
		public void StoreView(String StoreName) {
			StoresInfo StoreInfo = service.getStoreInfo(StoreName);
			if(StoreInfo != null) {
				EndView.storeView(StoreInfo);	
			}else {
				EndView.messageView("검색요청하신 프로젝트는 존재하지 않습니다.");
			}
		}
	
	//새로운 store 추가	
		public void insertStore(StoresInfo newStore) {
			service.storeInsert(newStore);
		}
		
	//검색 store 삭제
		public void deleteStore(String StoreName) {
			try {
				service.storeDelete(StoreName);
			} catch (NotExistException e) {
				FailView.failMessageView(e.getMessage());
			}
		}
		
	//검색 store 수정
		public void updateStore(String StoreName, Object object) {
			try {
				service.storeUpdate(StoreName, object);
			} catch (NotExistException e) {
				FailView.failMessageView(e.getMessage());
			}
		}
	
		//기업명을 키값으로 하는 json객체 생성
	      public void jsonView() {
	         ArrayList<StoresInfo> StoresList = service.getAllStoresInfo();
	         JSONObject jsonObject = new JSONObject();
	         for(StoresInfo s : StoresList) {
	            jsonObject.put(s.getStoreName(), JSONObject.fromObject(s));
	         }
	        	System.out.println(jsonObject);
	      }
	      
	     //특정 층수 store 검색
	      public void viewFloorStoreInfo(String storeFloor)  {
	    	  ArrayList<StoresInfo> store = service.floorStoreInfoView(storeFloor);
				if(store != null) {
					EndView.floorStoreInfoView(store);	
				}else {
					EndView.messageView("검색요청하신 프로젝트는 존재하지 않습니다.");
				}
	      }
}