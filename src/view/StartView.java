package view;

import controller.PeopleController;

public class StartView {

	public static void main(String[] args) {

		System.out.println("---모든검색---");
		PeopleController.request(1);
		
		System.out.println("---신규가입 및 모든검색---");
		PeopleController.request(3);
		PeopleController.request(1);
		
		System.out.println("---개인 검색 ---");
		PeopleController.request(2);

		System.out.println("--- 삭제 후 모든검색 ---");
		PeopleController.request(4);
		PeopleController.request(1);

		System.out.println("---등급상향---");
		PeopleController.request(5);
		PeopleController.request(1);

	}

}
