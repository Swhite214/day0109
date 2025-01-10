package enums;

//Enum에서 제공하는 name, ordinal method
//추가 필드 method 사용가능
public enum Season {
	SPRING("꽃이 피는 계절","spring"), SUMMER("무더위가 시작돼요","summer"), FALL("낙엽이 슬슬 떨어지네요","fall"), WINTER("얼어 죽겠다 언제 지나가","winter") ;
	
	
	private final String korName;//final이 있으면 반드시 초기화해줘야함 값을
	private final String engName;
	
	private Season(String korName, String engName) {
		this.korName = korName;
		this.engName = engName;
	}
	
	public String getKorName() {
		return korName ;
	}
	public String getEngName() {
		return engName;
	}
}
