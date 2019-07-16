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
	
	//��� StroeInfo ��ȯ
	public ArrayList<StoresInfo> getAllStoresInfo() {
		return mallVirtualData.getStoreList();
	}
	
	//�˻� StoreInfo ��ȯ
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
	
	
	//�˻� StoreInfo ����
	public void  storeDelete(String StoreName) throws NotExistException{
		StoresInfo store = getStoreInfo(StoreName);
		if(store == null) {
			throw new NotExistException("xxxxx �����ϰ��� �ϴ� Stroe�� �����ϴ�");
		}
		mallVirtualData.getStoreList().remove(store);
	}
	
	//���ο� StoreInfo �߰�
	public void storeInsert(StoresInfo newStore) {
		mallVirtualData.insertStore(newStore);
	}
	
	//�˻� StoreInfo ����
	public void storeUpdate(String StoreName, Object object) throws NotExistException{
		StoresInfo store = getStoreInfo(StoreName);
		if(store == null) {
			throw new NotExistException("xxxxx �����ϰ��� �ϴ� Store�� �����ϴ�");
		}else if(object instanceof StoreInfo) {
			store.setStoreInfo((StoreInfo)object);
		}else if(object instanceof StoreDetail) {
			store.setStoreDetail((StoreDetail)object);
		}
	}
	
	//Ư�� ���� Store ���
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