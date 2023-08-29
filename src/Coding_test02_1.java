import java.util.Scanner;

// 범위 숫자들의 한계값을 구하고 싶은 양의 정수값을 Scanner 클래스를 활용하여 입력 받아서,
// for문을 활용하여, 입력된 양의 정수값까지 합계값을 구하여 화면으로 표시해 주는 자바 프로그램을 제작해 보시기 바랍니다.

// [실행 결과 예시(1) : Scanner 클래스 활용 5를 입력 받아서, 양의 정수값 변수명 inputlnt에 5대입 예시,
// 문자열 표현 : "1부터 " + inputlnt + "까지의 합 = ", 합계 결과값 변수명 hap,
// 1부터 5까지의 합 = 15]

//[실행 결과 예시(2) : Scanner 클래스 활용 10를 입력 받아서, 양의 정수값 변수명 inputlnt에 10대입 예시,
//문자열 표현 : "1부터 " + inputlnt + "까지의 합 = ", 합계 결과값 변수명 hap,
//1부터 10까지의 합 = 55]
public class Coding_test02_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("범위 숫자들의 합계값을 구하고 싶은 양의 정수값을 입력해 주세요 => ");
		int input = scan.nextInt();
		int hap = 0;
		
		for (int i = 1; i <= input; i++) {
			hap += i;
			System.out.println("1부터 " + input + "까지의 합 = " + hap);
		}
	}
}
