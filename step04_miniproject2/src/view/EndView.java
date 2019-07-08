package view;

import model.OneInstanceModel;
import model.domain.OneInstance;

public class EndView {
	
	public static void printAll(OneInstance[]all) {
		for(OneInstance v: all) {
			if(v!= null) {
				System.out.println(v.toString());
			}
		}
	}
	
	public static void printTo(OneInstance v) {
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
