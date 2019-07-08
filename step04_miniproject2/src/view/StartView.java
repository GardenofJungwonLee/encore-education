package view;

import controller.OneInstanceController;

public class StartView {

	public static void main(String[] args) {

		System.out.println("---모든검색---");
		OneInstanceController.request(1);
		
		System.out.println("---신규가입 및 모든검색---");
		OneInstanceController.request(3);
		OneInstanceController.request(1);
		
		System.out.println("---개인 검색 ---");
		OneInstanceController.request(2);

		System.out.println("--- 삭제 후 모든검색 ---");
		
		OneInstanceController.request(4);
		OneInstanceController.request(1);

		System.out.println("---등급향상---");
		OneInstanceController.request(5);
		OneInstanceController.request(1);
	}

}
