package Questions;

public class Q3 {
		
		public static String Reverse(String str) {
			
			char[] charArray = str.toCharArray();
			char[] subArray = new char[charArray.length];

			for (int i = charArray.length - 1; i >= 0; --i) {
				subArray[charArray.length - i] = charArray[i];
			}
			return new String(subArray);
		}

		public static String testString = "yes";
		public static void TestReverse() {
			System.out.println(Reverse(testString));
		}
	}
