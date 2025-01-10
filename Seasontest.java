package enums;

public class Seasontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season season = Season.WINTER;
		System.out.println(season.getEngName());
		System.out.println(season.name());
		System.out.println(season.getKorName());
		String input = "SPRING";
		Season[] seasons = Season.values();//enum타입의 이름 상수형데이터타입임 String이 아님
		for(Season s: seasons) {
			if(input.equals(s.name())) {
				System.out.println(input);
			}
			else {
				System.out.println(input + "은 유효하지않는데이터");
			}
		System.out.println(s.name());
		}
		System.out.println();
		//java.lang.IllegalArgumentException
		
	}

}
