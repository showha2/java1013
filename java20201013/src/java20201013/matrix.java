package java20201013;

public class matrix {

	public static void main(String[] args) {
		//문자열 2차원 배열의 생성
		String [][] names = {
				{"태연", "유리", "윤아"},
				{"써니", "제니", "로사"}
		};
		
		//행의 순회
		/*
		for(int i=0; i<names.length; i=i+1) {
			//열의 순회
			for(int j=0; j<names[1].length; j=j+1) {
				System.out.printf("%10s", names[i][j]);
			}
			System.out.printf("\n");
		}
		*/
		
		//빠른 열거 이용
		//배열의 배열이므로 처음에는 배열에 저장하고
		/*
		for(String [] temp : names) {
			//그 배열을 다시 순서대로 순회
			for(String imsi : temp) {
				System.out.printf("%15s",  imsi);
			}
			System.out.printf("\n");
		}
		*/
		
		//일차원 배열을 이차원 배열 처럼 이용
		//이 구조는 실무에서도 많이 이용
		String [] players = {
				"한유미", "배유나", "문정원",
				"문성민", "신영석", "최민호"
		};
		
		for(int i=0; i<players.length; i=i+1) {
			System.out.printf("%15s", players[i]);
			if(i %3 == 2) {
				System.out.printf("\n");
			}
		}
	}

}
