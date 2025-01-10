package enums;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day day = Day.THURSDAY; //Day타입에는 저장해둔 요일 7가지를빼고는 올수없어요
		System.out.println(day.toString()); //참조변수 static이붙어야 클래스변수
		Day02 day2 = new Day02();
		System.out.println(day2.toString());
		System.out.println(day.name());
		System.out.println(day.ordinal());
		Object obj; //class의 최상위 부모는 Object 얘네는 부모의 toString을 물려받아 그대로 사용
		//그러나 enum은 toString의 메서드를 오버라이드해서 사용 즉 enum은 enum이름만 클래스는 클래스이름@해쉬태그까지 나온다
		
		
		//한글로 출력할꺼에요
		switch(day.ordinal()) {
		
		case 0:System.out.println("월"); break;
		case 1:System.out.println("화"); break;
		case 2:System.out.println("수"); break;
		case 3:System.out.println("목"); break;
		case 4:System.out.println("금"); break;
		case 5:System.out.println("토"); break;
		case 6:System.out.println("일"); break;
		
		
		}
		
	}

}
