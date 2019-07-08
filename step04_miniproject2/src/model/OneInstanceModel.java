package model;

import model.domain.OneInstance;

public class OneInstanceModel {
	
	private static OneInstance[] instance = new OneInstance[10];
	private static int index;
	static {
		instance[0] = new OneInstance(1,"AAA", "김동범", "일반");
		instance[1] = new OneInstance(2,"BBB", "한우석", "VIP");
		instance[2] = new OneInstance(3,"CCC", "이정원", "VIP");
		instance[3] = new OneInstance(4,"ABC", "석유진", "일반");
		instance[4] = new OneInstance(5,"BBC", "민지은", "일반");
		instance[5] = new OneInstance(6,"BBQ", "송평화", "일반");
		instance[6] = new OneInstance(7,"AHC", "강민웅", "VIP");
		index = 7;
	}
	
	
	public static boolean insert(OneInstance v) {
		if(index < 10) {
		instance[index++]=v;
		System.out.println("New) "+v.getName()+" 님");
			return true;
		}else {
			return false;
		}
	}
	
	public static OneInstance[] getAll() { //모든사람 검색
		return instance;
	}
	
	public static boolean delete(String name) {
		OneInstance v = null;
		for(int i=0; i < instance.length; i++) {
			v= instance[i];
		if(v !=null && v.getName().equals(name)) {
			instance[i] =null;
			return true;
			}
		}
			return false;
	}
			
	public static OneInstance search(String name) {
		OneInstance v = null;
		for(int i=0; i < instance.length; i++) {
			v= instance[i];
			if(v !=null && v.getName().equals(name)) {
				return v;
				} 
			}
				return null;
	}
	
	
	public static boolean update(String name) {
		OneInstance v = null;
		for(int i=0; i < instance.length; i++) {
			v= instance[i];
		if(v !=null && v.getName().equals(name)) {
			instance[i].setGrade("vip");
			return true;
		}
			
		}
			return false;
	}
}
