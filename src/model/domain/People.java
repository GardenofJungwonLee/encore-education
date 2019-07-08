package model.domain;

public class People {
	private int num;
	private String id;
	private String name;
	private String grade;
	
	public People() {}
	public People(int num, String id, String name, String grade) {
		this.num = num;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String toString() {
		return "no:"+num+" ȸ��ID:" + id  + " ȸ����:" +name+" ȸ�����:"+grade;
	}
}












	
	
	

