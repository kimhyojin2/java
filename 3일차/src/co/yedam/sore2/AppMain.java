package co.yedam.sore2;

public class AppMain {

	public static void main(String[] args) {
		ScoreArr2App score = new ScoreArr2App();
		// score.arr.length ==> 3
		for (int i = 0; i < score.arr.length; i++) {
			System.out.println(score.arr[i].length+":"+
								score.stdTotal(i));
		}
		// score.print();
	}
}
