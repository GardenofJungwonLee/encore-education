package mall.view;

import java.util.ArrayList;

import mall.model.dto.StoresInfo;


	public class EndView {
	
		//��� store ���
		public static void allStoresListView(ArrayList<StoresInfo> allStoreList){
			for(int index = 0; index < allStoreList.size(); index++){			
				System.out.println("[Store " + (index+1) + "]\n" + allStoreList.get(index) +"\n");
			}
		}
	
		//Ư�� store ���
		public static void storeView(StoresInfo StoreInfo) {
			System.out.println(StoreInfo);
		}
		
		//���ܰ� �ƴ� �ܼ� �޼��� ���
		public static void messageView(String message) {
			System.out.println(message);
		}	
		
		//Ư�� ���� store ���
		public static void floorStoreInfoView(ArrayList<StoresInfo> StoreInfo) {
			for(int index = 0; index < StoreInfo.size(); index++){			
				System.out.println(StoreInfo.get(index) +"\n");
			}
		}
}
