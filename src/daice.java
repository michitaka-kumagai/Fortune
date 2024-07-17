
public class daice {
 public static void main(String[] agrs) {
	 double rand = Math.random() * 6 + 1; //1から6
	 int number = (int)rand;          //(int)randで小数点以下切り捨て
	 System.out.println("サイコロの目は" + number + "です。");
 }
}
