package Source;

import java.util.*;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();

		int count = 0, max = Integer.MIN_VALUE, maximum = 0;
		for (int i = 0; i < str.length(); i++) {
			count = 0;
			StringBuffer sb = new StringBuffer("");

			for (int j = i; j < length+i && j < str.length(); j++) {
				sb.append(Character.toString(str.charAt(j)));
			}
			// System.out.println("E"+sb);
			
			for (int j = 0; j < sb.length(); j++) {
				char ch = sb.charAt(j);
				System.out.println(ch);
				if (ch == '1') {
					count++;
				}
			}

			if (count > max) {
				max = count;
			}
		}

		System.out.println(max);

	}

}
