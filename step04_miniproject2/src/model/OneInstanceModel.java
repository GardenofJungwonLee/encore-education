package model;

import model.domain.OneInstance;

public class OneInstanceModel {
	
	private static OneInstance[] instance = new OneInstance[10];
	private static int index;
	static {
		instance[0] = new OneInstance(1,"AAA", "�赿��", "�Ϲ�");
		instance[1] = new OneInstance(2,"BBB", "�ѿ켮", "VIP");
		instance[2] = new OneInstance(3,"CCC", "������", "VIP");
		instance[3] = new OneInstance(4,"ABC", "������", "�Ϲ�");
		instance[4] = new OneInstance(5,"BBC", "������", "�Ϲ�");
		instance[5] = new OneInstance(6,"BBQ", "����ȭ", "�Ϲ�");
		instance[6] = new OneInstance(7,"AHC", "���ο�", "VIP");
		index = 7;
	}
	
	
	public static boolean insert(OneInstance v) {
		if(index < 10) {
		instance[index++]=v;
		System.out.println("New) "+v.getName()+" ��");
			return true;
		}else {
			return false;
		}
	}
	
	public static OneInstance[] getAll() { //����� �˻�
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
