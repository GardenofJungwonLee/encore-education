package mall.view;

import java.util.ArrayList;

import mall.model.dto.StoresInfo;


	public class EndView {
	
		//모든 store 출력
		public static void allStoresListView(ArrayList<StoresInfo> allStoreList){
			for(int index = 0; index < allStoreList.size(); index++){			
				System.out.println("[Store " + (index+1) + "]\n" + allStoreList.get(index) +"\n");
			}
		}
	
		//특정 store 출력
		public static void storeView(StoresInfo StoreInfo) {
			System.out.println(StoreInfo);
		}
		
		//예외가 아닌 단순 메세지 출력
		public static void messageView(String message) {
			System.out.println(message);
		}	
		
		//특정 층수 store 출력
		public static void floorStoreInfoView(ArrayList<StoresInfo> StoreInfo) {
			for(int index = 0; index < StoreInfo.size(); index++){			
				System.out.println(StoreInfo.get(index) +"\n");
			}
		}
}
