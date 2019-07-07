package model;

import model.domain.People;

public class PeopleModel {

	private static People[] allData = new People[10];
	private static int index;
	static {
		allData[0] = new People(1,"AAA", "김동범", "일반");
		allData[1] = new People(2,"BBB", "한우석", "VIP");
		allData[2] = new People(3,"CCC", "이정원", "VIP");
		allData[3] = new People(4,"ABC", "석유진", "일반");
		allData[4] = new People(5,"BBC", "민지은", "일반");
		allData[5] = new People(6,"BBQ", "송평화", "일반");
		allData[6] = new People(7,"AHC", "강민웅", "VIP");
		index = 7;
	}
	
	public static boolean insert(People v) {
		if(index < 10) {
		allData[index++]=v;
		return true;
		}else {
			return false;
		}
	}
	
	public static People[] getAll() { //모든사람 검색
		return allData;
	}
	
	public static boolean delete(String name) {
		People v = null;
		for(int i=0; i < allData.length; i++) {
			v= allData[i];
		if(v !=null && v.getName().equals(name)) {
			allData[i] =null;
			return true;
			}
		}
			return false;
	}
			
	public static People search(String name) {
		People v = null;
		for(int i=0; i < allData.length; i++) {
			v= allData[i];
			if(v !=null && v.getName().equals(name)) {
				return v;
			} 
		}
		return null;
	}
	
	
	public static boolean update(String name) {
		People v = null;
		for(int i=0; i < allData.length; i++) {
			v= allData[i];
		if(v !=null && v.getName().equals(name)) {
			allData[i].setGrade("vip");
			return true;
		}
			
		}
			return false;
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		
	}

}
