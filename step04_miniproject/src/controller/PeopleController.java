package controller;

import model.PeopleModel;
import model.domain.People;
import view.EndView;

public class PeopleController {
	public static void request(int reqNumber) {
		if(reqNumber ==1) { // ���˻�
			EndView.printAll(PeopleModel.getAll());
			
		}else if(reqNumber == 2) { //���ΰ˻�
			
			EndView.printTo(PeopleModel.search("�赿��"));
			EndView.printTo(PeopleModel.search("������"));
			
		}else if(reqNumber == 3) { //�ű԰���
			boolean r = PeopleModel.insert(new People(8,"CEO","���ػ�","VIP"));
			if(r) {
				EndView.printSuccess("���Լ���");
			}else {
				EndView.printFail("���Խ���");
			}
			
			
		}else if(reqNumber == 4) { //����
			
			PeopleModel.delete("�赿��");
			
			
		}else if(reqNumber == 5) { // ȸ����� ���
			boolean r = PeopleModel.update("������");
			
		}else {
			
			EndView.printFail("��û�Ͻ� ������ ���� �� �� �����ϴ�");
			
		}
	}
		
		
		
	

	public static void main(String[] args) {

	}

}

