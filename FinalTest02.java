package finals;

public class FinalTest02 extends FinalTest025super{ //자식클래스입니다 부모클래스는 옆에있는 025super입니다.
	
	void display() {
		System.out.println("몰랐어요 내가 벌레라는것을"); //자식요소에 존재하는 메서드
		go();//그냥쓰는것만 가능
		execute();//이거 아빠 클래스게 아닌 자식클래스로 나옴
	}
	@Override
	void execute() {
		System.out.println("그래도 괜찮아~ 나는 빛나니까~");
	}
	// void go () { 단 부모에서 final로 막아놨기에 오버라이드 불가
	//}

}

class FinalTest025super //extends FinalTest025Supersuper 파이널이 붙어있으면 상속할수없어요
{
	final void go() { //접근제한아니기때문에 상관없이 접근가능
		System.out.println("나는 내가 빛나는 별인줄 알았어요");
	}
	void execute() {
		System.out.println("한번도 의심한적 없었죠~");
	}
}
final class FinalTest025Supersuper{
	
}