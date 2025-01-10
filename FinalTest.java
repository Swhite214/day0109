package finals;

//final : 변수, 메서드, 클래스 사용할 수 있다.
//특정동작을 제한하는데 활용: 수정 불가의 의미로
public class FinalTest {
	int num = 10;
	final static int ZERO = 0; //반드시 초기화해줘야함 상수를 선언합니다 보통
	
	void disp() {
		System.out.println(ZERO);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ZERO);
		//System.out.println(num);
		
	}

}
