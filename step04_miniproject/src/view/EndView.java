package view;

import model.domain.People;

public class EndView {
	
	public static void printAll(People[]all) {
		for(People v: all) {
			if(v!= null) {
				System.out.println(v.toString());
			}
		}
	}
	
	public static void printTo(People v) {
		if(v !=null) {
			System.out.println(v.toString());
		}
	}

	public static void printSuccess(String msg) {
		System.out.println(msg);
	
	}
	public static void printFail(String msg) {
		System.out.println(msg);
	}
}
