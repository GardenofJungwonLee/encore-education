/* 학습내용
 * 1. 변수
 * 	1-1. 타입에 따른 구분
 * 		1. 기본
 * 			byte, short, int, long
 * 			float, dobule
 * 			char
 * 			boolean
 * 		2. 참조
 * 			- 기본을 제외한 모든 타입
 * 	1-2. 선언 위치에 따른 구분
 * 		1. 멤버
 * 			- class {} 하위
 * 		2. 로컬
 * 			- 생성자 또는 메소드의 parmeter
 */



package step01;
import model.domain.People;

public class Ex03Variable {

	public static void main(String[] args) {
		// People 객체생성 - new People()
		People people = new People();
		
		
		// People에 "내짝 이름", - 나이 대입, setXxx(값)
		people.setName("한우석");
		people.setAge(-26);
		
		
		/* + 연산식
		 * 1. 숫자에 적용 : 산술 연산
		 * 2. 숫자 이외의 데이터에 적용 : 결합 연산 */
		/*system.out.println(p.getName() + "" + p.getAge())
		 * System
		 * out
		 * println 대기
		 * p
		 * getAge()
		 * println 실제 실행
		 * 종료
		 */
		//People의 getXxx() 호출해서 출력
		System.out.println(people.getName()+""+ people.getAge());
		
	}
}

