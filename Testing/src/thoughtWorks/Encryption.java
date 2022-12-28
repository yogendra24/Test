package thoughtWorks;

public class Encryption {

	public static void main(String[] args) {
		String input = "a4bc2zy";
		char[] ch = input.toCharArray();
		for (int i = 0; i <= ch.length - 1; i++) {
			System.out.println(ch[i]);
			if (Character.isDigit(ch[i])) {
				String text = String.valueOf(ch[i]);
				int number = Integer.parseInt(text);
				System.out.println(ch);
				for (int j = i - 1; j <=0; j--) {
					System.out.println("Elemnts:" + ch[j]);
					for (int k = 0; k <= number - 1; k++) {
						System.out.print(ch[j]);
					}

				}
			}
			else {
				System.out.println(ch[i]);
			}
		}

	}

}
