//random係数を使用した運勢占い
public class Fortune2 {
	public static void main(String[] ags) {
		double rand = Math.random() * 100;
		int number = (int)rand;
		System.out.println("あなたの運勢は");
		if(number >= 90) {
				System.out.println("大吉!");
			} else if (number >= 80) {
				System.out.println("中吉！");
			} else if (number >= 50) {
				System.out.println("小吉！");
			} else if (number >= 30) {
				System.out.println("末吉!");
			} else if (number >= 10) {
				System.out.println("凶!");
			} else {
				System.out.println("大凶!");
		} 
	}
}