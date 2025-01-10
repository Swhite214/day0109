package enums;

public enum Operator {
	ADD {
		@Override //추상메서드를 썻기에 바디를 만들고 오버라이드해야됨
		public int run(int x, int y) {
			// TODO Auto-generated method stub
			return x+y;
		}
	},SUB {
		@Override
		public int run(int x, int y) {
			// TODO Auto-generated method stub
			return x-y;
		}
	}; //바디 완성안하면 객체로서 못쓰니 오류남
	
	//추상메서드추가
	public abstract int run(int x, int y);// {}가 없는 미완성 메서드
	}
//메서드 오버라이드(재정의
//final 상속시 오버라이드 불가)
