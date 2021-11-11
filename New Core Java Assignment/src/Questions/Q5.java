package Questions;

public class Q5 {

			static String Substring(String str, int idx) {
			char[] charArray = str.toCharArray();
			char[]SubstringArray = new char[idx];

			for (int i = 0; i < idx; ++i) {
				SubstringArray[i] = charArray[i];
				}
		return new String(SubstringArray);
		}
		static String teststring = "My test string";
				public static void TestSubstring(int idx) {
			System.out.println(Substring(teststring, idx));
		}

	}

