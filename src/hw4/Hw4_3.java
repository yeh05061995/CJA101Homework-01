package hw4;

public class Hw4_3 {
	public static void main(String[]args) {
	

		String aeiou = "aeiou";
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int count = 0;
		for (int i = 0; i < planets.length; i++) {
			
			for (int j = 0; j < planets[i].length(); j++) {
				
				String ch = String.valueOf(planets[i].charAt(j));		// 【valueOf()】 方法用于返回给定参数的原生 Number 对象值，参数可以是原生数据类型, String等。该方法是静态方法。该方法可以接收两个参数一个是字符串，一个是基数
																				// 【charAt()】前面字串的第j個字元
//				System.out.println(ch);
				
				if (aeiou.contains(ch)) {					// 【contains()】 包含/ 裡面有
					count++;
				}
			}
		}
		
		System.out.print("陣列裡共有" + count + "個母音");
	}
}

