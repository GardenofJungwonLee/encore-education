package mall.service;


import java.util.ArrayList;

import mall.exception.NotExistException;
import mall.model.MallModelVirtualDB;
import mall.model.dto.StoreDetail;
import mall.model.dto.StoreInfo;
import mall.model.dto.StoresInfo;

public class MallService {
	
	private static MallService instance = new MallService();
	private MallModelVirtualDB mallVirtualData = MallModelVirtualDB.getInstance();

	private MallService(){}
	public static MallService getInstance(){
		return instance;
	}
	
	//모든 StroeInfo 반환
	public ArrayList<StoresInfo> getAllStoresInfo() {
		return mallVirtualData.getStoreList();
	}
	
	//검색 StoreInfo 반환
	public StoresInfo getStoreInfo(String StoreName){
		StoresInfo store = null;
		ArrayList<StoresInfo> v = mallVirtualData.getStoreList();
		int count = v.size();
		for(int i = 0; i < count; i++) {
			if(v.get(i).getStoreName() == StoreName) {
				store = v.get(i);
			}
		}
		return store;
	}
	
	
	//검색 StoreInfo 삭제
	public void  storeDelete(String StoreName) throws NotExistException{
		StoresInfo store = getStoreInfo(StoreName);
		if(store == null) {
			throw new NotExistException("xxxxx 삭제하고자 하는 Stroe가 없습니다");
		}
		mallVirtualData.getStoreList().remove(store);
	}
	
	//새로운 StoreInfo 추가
	public void storeInsert(StoresInfo newStore) {
		mallVirtualData.insertStore(newStore);
	}
	
	//검색 StoreInfo 수정
	public void storeUpdate(String StoreName, Object object) throws NotExistException{
		StoresInfo store = getStoreInfo(StoreName);
		if(store == null) {
			throw new NotExistException("xxxxx 수정하고자 하는 Store가 없습니다");
		}else if(object instanceof StoreInfo) {
			store.setStoreInfo((StoreInfo)object);
		}else if(object instanceof StoreDetail) {
			store.setStoreDetail((StoreDetail)object);
		}
	}
	
	//특정 층수 Store 출력
	public ArrayList<StoresInfo> floorStoreInfoView(String storeFloor) {
		StoresInfo store = null;
		ArrayList<StoresInfo> v = mallVirtualData.getStoreList();
		ArrayList<StoresInfo> v1 = mallVirtualData.getFloorStoreInfo();
		int count = v.size();
		for(int i = 0; i < count; i++) {
			if(v.get(i).getStoreInfo().getStoreFloor() == storeFloor) {
				store = v.get(i);
				v1.add(store);
			}
		}
		return v1;
	}
	
}