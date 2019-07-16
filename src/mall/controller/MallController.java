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
	
	//��� store �˻�
		public void allStoresListView() {
			ArrayList<StoresInfo> StoresList = service.getAllStoresInfo();		
			if(StoresList.size() != 0) {
				EndView.allStoresListView(StoresList);	
			}else {
				EndView.messageView("�������� ������Ʈ�� �������� �ʽ��ϴ�.");
			}
		}
		
	//�˻� store view
		public void StoreView(String StoreName) {
			StoresInfo StoreInfo = service.getStoreInfo(StoreName);
			if(StoreInfo != null) {
				EndView.storeView(StoreInfo);	
			}else {
				EndView.messageView("�˻���û�Ͻ� ������Ʈ�� �������� �ʽ��ϴ�.");
			}
		}
	
	//���ο� store �߰�	
		public void insertStore(StoresInfo newStore) {
			service.storeInsert(newStore);
		}
		
	//�˻� store ����
		public void deleteStore(String StoreName) {
			try {
				service.storeDelete(StoreName);
			} catch (NotExistException e) {
				FailView.failMessageView(e.getMessage());
			}
		}
		
	//�˻� store ����
		public void updateStore(String StoreName, Object object) {
			try {
				service.storeUpdate(StoreName, object);
			} catch (NotExistException e) {
				FailView.failMessageView(e.getMessage());
			}
		}
	
		//������� Ű������ �ϴ� json��ü ����
	      public void jsonView() {
	         ArrayList<StoresInfo> StoresList = service.getAllStoresInfo();
	         JSONObject jsonObject = new JSONObject();
	         for(StoresInfo s : StoresList) {
	            jsonObject.put(s.getStoreName(), JSONObject.fromObject(s));
	         }
	        	System.out.println(jsonObject);
	      }
	      
	     //Ư�� ���� store �˻�
	      public void viewFloorStoreInfo(String storeFloor)  {
	    	  ArrayList<StoresInfo> store = service.floorStoreInfoView(storeFloor);
				if(store != null) {
					EndView.floorStoreInfoView(store);	
				}else {
					EndView.messageView("�˻���û�Ͻ� ������Ʈ�� �������� �ʽ��ϴ�.");
				}
	      }
}