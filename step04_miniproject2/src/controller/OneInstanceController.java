package controller;

import log.check.Log4J;
import model.OneInstanceModel;
import model.domain.OneInstance;
import view.EndView;

public class OneInstanceController {
	static Log4J log = Log4J.getInstance();
	
	public static void request(int reqNumber) {
		
		if(reqNumber ==1) { // ���˻�
			System.out.println(log.info());
			EndView.printAll(OneInstanceModel.getAll());
			
		}else if(reqNumber == 2) { //���ΰ˻�
			EndView.printTo(OneInstanceModel.search("�赿��"));
			EndView.printTo(OneInstanceModel.search("������"));
			/*boolean f = OneInstanceModel.search("�赿��"));
			if(f) {
				System.out.println(log.success());
			}else {
				System.out.println(log.warn());
			}*/
			
		}else if(reqNumber == 3) { //�ű԰���
			boolean r = OneInstanceModel.insert(new OneInstance(8,"CEO","���ػ�","VIP"));
			if(r) {
				EndView.printSuccess("������ ���ϵ帳�ϴ�");
			}else {
				EndView.printFail("���Խ���");
			}
			
			
		}else if(reqNumber == 4) { //����
			boolean r = OneInstanceModel.delete("�赿��");
			if(r) {
				System.out.println(log.success());
			}
			else{
				System.out.println(log.empty());
			}
			
		}else if(reqNumber == 5) { // ȸ����� ���
			boolean r = OneInstanceModel.update("������");
			if(r) {
				System.out.println(log.success());
			}else{
				System.out.println(log.empty());
			}
			
		}else {
			EndView.printFail("��û�Ͻ� ������ ���� �� �� �����ϴ�");
		}
	}
		
		
		
	

	public static void main(String[] args) {

	}

}

