package view;

import controller.PeopleController;

public class StartView {

	public static void main(String[] args) {

		System.out.println("---���˻�---");
		PeopleController.request(1);
		
		System.out.println("---�ű԰��� �� ���˻�---");
		PeopleController.request(3);
		PeopleController.request(1);
		
		System.out.println("---���� �˻� ---");
		PeopleController.request(2);

		System.out.println("--- ���� �� ���˻� ---");
		PeopleController.request(4);
		PeopleController.request(1);

		System.out.println("---��޻���---");
		PeopleController.request(5);
		PeopleController.request(1);

	}

}
