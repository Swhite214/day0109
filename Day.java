package enums;

public enum Day {
	//상수의 집합입니다.
	//여기서는 요일에 대한 상수들의 집합이겠네요 기본적으로 요일은 월~일까지네요
	MONDAY, //oridnal =0 
	TUESDAY, //oridnal =1
	WEDNESDAY, //oridnal =2
	THURSDAY, //oridnal =3
	FRIDAY, 
	SATURADAY, 
	SUNDAY
} //클래스는 아니지만 최종적으로 컴파일러가 클래스로인식

class Day02{
	public final static double PI=3.14; //보통상수는 공유목적임
	public final static double MONDAY = 0;
	public final static double TUESDAY = 1;
	public final static double WEDNESDAY = 2;
	public final static double THURSDAY = 3;
	public final static double FRIDAY = 4;
	public final static double SATURDAY = 5;
	public final static double SUNDAY = 6;
	//원래라면 이렇게 만들어야했지만 상수를...
}