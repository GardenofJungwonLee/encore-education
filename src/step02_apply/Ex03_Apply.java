package step02_apply;

public class Ex03_Apply {
	String kor, eng, math;
	int kor_score, eng_score, math_score;
	int average; 
	
	Ex03_Apply(){}
	
	int scoreAverage(){
		average = (kor_score+eng_score+math_score)/3;
		return average;
	}
	
	
	
	public static void main(String[] args) {
		Ex03_Apply average = new Ex03_Apply();
		
		average.kor_score = 90;
		average.eng_score = 88;
		average.math_score = 50;
		
		System.out.print(average.scoreAverage());
		
					

	}

}
