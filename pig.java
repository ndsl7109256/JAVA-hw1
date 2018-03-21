package hw1;

public class pig {
	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			String str = args[i];
			int len = str.length();
			if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o'
					|| str.charAt(0) == 'u')
				System.out.print(str.toUpperCase().charAt(0) + str.substring(1, len) + "ay ");
			else
				System.out.print(str.toUpperCase().charAt(1) + str.substring(2, len) + str.charAt(0) + "ay ");
		}
	}
}