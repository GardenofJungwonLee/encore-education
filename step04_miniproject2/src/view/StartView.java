package view;

import controller.OneInstanceController;

public class StartView {

	public static void main(String[] args) {

		System.out.println("---���˻�---");
		OneInstanceController.request(1);
		
		System.out.println("---�ű԰��� �� ���˻�---");
		OneInstanceController.request(3);
		OneInstanceController.request(1);
		
		System.out.println("---���� �˻� ---");
		OneInstanceController.request(2);

		System.out.println("--- ���� �� ���˻� ---");
		
		OneInstanceController.request(4);
		OneInstanceController.request(1);

		System.out.println("---������---");
		OneInstanceController.request(5);
		OneInstanceController.request(1);
	}

}
