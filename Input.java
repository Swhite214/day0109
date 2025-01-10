package finals;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) throws IOException { //예외처리안합니다 나중에 만들테니
		InputStream is =System.in; //inputstream의 타입 변수 is에 System.in의값 할당 System 클래스의 static변수
		int read = is.read(); //-48해야지 아스키코드에서 빼기해서나옴
		// TODO Auto-generated method stub
		System.out.println("키보드에서 입력한 데이터: " +read); //한글자 밖에못읽음
		//123을치든 21341241423을치든 1 아니면 2 이렇게 밖에못읽음 아스키 코드로 읽어옵니다.
		System.out.println("키보드에서 입력한 데이터(문자): "+(char)read); //바이트 단위로 읽어오기에 이미지,동영상등 바이트단위로 처리되는애들에 한해서는 고려할수도있지만 성능상 별로...
		
		
		System.out.println("아래예제는 지문에따라 정확하게 입력하도록 약속을 왜하는지는 모르겠지만 합시다.");
		System.out.println("숫자 아니면 오류납니다.");
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextInt()); //int형으로 받아야하기에 정수형만 입력받을수있습니다. 문자열오면 예외가 발생
		
		System.out.println("문자 아니면 오류납니다.");
		System.out.println(sc.next());//공백을기준으로 문자단위를 정합니다. 예외는 발생하지않으나 뒤에오는 다른명령어에 영향끼칠수있다.
		
		System.out.println("집좀가자");
		String str2 = sc.nextLine(); //뭐여 이건또 엔터기준으로 입력처리 문제는 실행되면 위에애들부터 실행되는데 그다음 엔터치면 끝남 ㅋㅋ
		System.out.println(str2);// 단독으로쓰면 띄어쓰기도 문제없이 출력하지만 위에처럼 다른입력처리 명령어가 있다면 문제가 발생합니다.
		
		
	
	} //그래서잘안씁니다 스캐너쓰지

}
