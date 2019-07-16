package mall.view;

import java.util.Scanner;

import mall.controller.MallController;
import mall.log.Admin;
import mall.model.dto.StoreDetail;
import mall.model.dto.StoreInfo;
import mall.model.dto.StoresInfo;;

public class StartView {

	public static void main(String[] args) {
		
	    // Admin ���� Ȯ�� (log4j)
        Scanner scanner = new Scanner(System.in);
        String id = null;
        System.out.print("���̵� �Է����ּ��� : ");
        id = scanner.next();         
        scanner.close();
        if(id.equals("admin")) {
           Admin.login();
        } else {
           Admin.loginFail();
           return;
        }
		
        
		MallController controller = MallController.getInstance();
	
		//���ο� store
		StoreInfo newStoreInfo = new StoreInfo("3��", "����", "����");
		StoreDetail newStoreDetail = new StoreDetail("2019�� 3��", 250, 50, 50);
		StoresInfo newStore = new StoresInfo("F", newStoreInfo, newStoreDetail );
		
		
	//��� store ���
			System.out.println("===��� Stroe ���===");
			controller.allStoresListView();
	
	//Ư�� store �˻� �� ���	
			System.out.println("===�˻� Stroe ���===");
			controller.StoreView("A");
	
	//���ο� store �߰�
			System.out.println("===���ο� Stroe �߰� �� ��ü ���===");
			controller.insertStore(newStore);
			controller.allStoresListView();
			
	//�˻��� store ����
			System.out.println("===�˻��� Store ����===");
			controller.deleteStore("ad");
//			controller.allStoresListView();
			
	//�˻��� store ����
			System.out.println("===�˻��� Stroe DetailInfo ����===");
			controller.updateStore("A", new StoreDetail("2019�� 2��", 200, 40000000, 40000000));
			controller.StoreView("A");
	
	
	//JSON �������� ��ȯ �� ���
			System.out.println("\"===================json�������� ��ȯ���===================");
			controller.jsonView();
	
	
	//Ư�� ���� store �˻� �� ���
			System.out.println("===Ư�� ���� Stroe �˻� �� ���===");
			controller.viewFloorStoreInfo("1��");
			
	//Ư�� ���� ������ �ջ�
			System.out.println("===Ư�� ���� ������ �ջ� �� ���===");
			controller.viewFloorStoreInfo("1��");
	}
}