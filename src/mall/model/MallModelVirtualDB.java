package mall.model;

import java.util.ArrayList;

import mall.model.dto.StoreDetail;
import mall.model.dto.StoreInfo;
import mall.model.dto.StoresInfo;

public class MallModelVirtualDB {
		private static MallModelVirtualDB instance = new MallModelVirtualDB();
		private ArrayList<StoresInfo> StoreList = new ArrayList<StoresInfo>();
		private ArrayList<StoresInfo> FloorStoreInfo = new ArrayList<StoresInfo>();
		
		private MallModelVirtualDB() {
				 StoreList.add(new StoresInfo("A",
						    new StoreInfo("1��", "����", "�ѽ�"), 
		                    new StoreDetail("2019�� 2��", 250, 50000000, 5000000)));
		         
				 StoreList.add(new StoresInfo("B",
		                    new StoreInfo("1��", "����", "�߽�"), 
		                    new StoreDetail("2019�� 2��", 300, 10000000, 100000)));

		         StoreList.add(new StoresInfo("C",
		                    new StoreInfo("3��", "����", "������ǰ"), 
		                    new StoreDetail("2019�� 7��", 250, 4000000, 250000)));

		         StoreList.add(new StoresInfo("D",
		                    new StoreInfo("5��", "����", "��ȭ"), 
		                    new StoreDetail("2018�� 3��", 500, 20000000, 500000)));

		         StoreList.add(new StoresInfo("E",
		                    new StoreInfo("6��", "��Ƽ", "�̿���ǰ"), 
		                    new StoreDetail("2019�� 5��", 700, 50000000, 1000000)));
		}
		
		public static MallModelVirtualDB getInstance() {
			return instance;
		}
		
		public ArrayList<StoresInfo> getStoreList(){
			return StoreList;
		}
		
//		public ArrayList<StoreInfo> get{
//			return StoreInfo;
//		}
//		
		public ArrayList<StoresInfo> getFloorStoreInfo(){
			return FloorStoreInfo;
		}
		
		public void insertStore(StoresInfo newStore) {
			StoreList.add(newStore);
		}
		
		public void deleteStore(StoresInfo StoreName) {
			StoreList.remove(StoreName);
		}
		
}