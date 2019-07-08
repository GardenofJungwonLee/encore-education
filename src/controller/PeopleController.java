package controller;

import model.PeopleModel;
import model.domain.People;
import singlton.Log4J;
import view.EndView;

public class PeopleController {
	static Log4J log = Log4J.getInstance();
	
	public static void request(int reqNumber) {
		if(reqNumber ==1) { // ���˻�
			System.out.println(log.info());
			EndView.printAll(PeopleModel.getAll());
			
		}else if(reqNumber == 2) { //���ΰ˻�
			System.out.println(log.success());
			EndView.printTo(PeopleModel.search("�赿��"));
			EndView.printTo(PeopleModel.search("������"));
			
		}else if(reqNumber == 3) { //�ű԰���
			boolean r = PeopleModel.insert(new People(8,"CEO","���ػ�","VIP"));
			if(r) {
				EndView.printSuccess("������ ���ϵ帳�ϴ�.");
			}else {
				EndView.printFail("���Խ���");
			}
			
			
		}else if(reqNumber == 4) { //����
			boolean r = PeopleModel.delete("�赿��");
			if(r) {
				System.out.println(log.success());
			}else {
				System.out.println(log.empty());
			}
			
		}else if(reqNumber == 5) { // ȸ����� ���
			boolean r = PeopleModel.update("������");
			if(r) {
				System.out.println(log.success());
			}else {
				System.out.println(log.empty());
			}
			
		}else {
			EndView.printFail("��û�Ͻ� ������ ���� �� �� �����ϴ�");
			
		}
	}
		
		
		
	

	public static void main(String[] args) {

	}

}

