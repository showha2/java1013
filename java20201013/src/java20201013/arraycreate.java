package java20201013;

public class arraycreate {

	public static void main(String[] args) {
		
		//이름 배열을 생성과 동시에 초기화
		String [] names = {"유재석", "박명수", "정준하", "하하"};
		
		//점수 3개를 저장할 수 있는 배열을 만들고 값을 대입
		int [] scores = new int[4];
		scores[0] = 95;
		scores[1] = 88;
		scores[2] = 97;
		scores[3] = 77;
		
		//반복문을 사용하기 않고 인덱스만을 이용해서 출력
		/*
		System.out.printf("이름은 %s이고 점수는 %d입니다.\n", names[0], scores[0]);
		System.out.printf("이름은 %s이고 점수는 %d입니다.\n", names[1], scores[1]);
		System.out.printf("이름은 %s이고 점수는 %d입니다.\n", names[2], scores[2]);
		*/
		
		//반복문을 사용하면 유지보수가 수월 해짐
		/*
		for(int i=0; i<3; i=i+1) {
			System.out.printf("이름은 %s이고 점수는 %d입니다.\n", names[i], scores[i]);
		}
		*/
		
		//3이라고 배열의 데이터 개수를 설정하는 부분을 수정
		//배열의 속성으로 설정 데이터가 변경이 되도 출력하는 부분을 수정할 필요가 없어집니다.
		/*
		for(int i=0; i<names.length; i=i+1) {
			System.out.printf("이름은 %s이고 점수는 %d입니다.\n", names[i], scores[i]);
		}
		*/
		
		//. 으로 접근하거나 [인덱스]로 데이터를 접근하게되면
		//메모리를 한 번 더 찾아가야 합니다.
		//반복문 등에서 동일한 데이터를 여러 번 . 이나 [인덱스]를
		//이용해서 찾아가게 되면 비효율적
		//이런 경우에는 이 데이터를 가까운 곳에 저장해두고
		//접근하는 것이 좋습니다.
		/*
		int len = names.length;
		for(int i=0; i<len; i=i+1) {
			System.out.printf("이름은 %s이고 점수는 %d입니다.\n", names[i], scores[i]);
		}
		*/
		
		//빠른 열거를 이용한 names의 데이터 출력
		for(String name : names) {
			System.out.printf("%s\n", name);
		}
	}

}
