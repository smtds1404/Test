
public class CharOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABAACBDDDDD";
		String temp = new String();
		int Count = 0;
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			while (temp.indexOf(ch) < 0) {
				temp = temp + ch;
				for (int k = 0; k < str.length(); k = k + 0) {
					int i = str.indexOf(ch, k);
					if (i >= 0) {
						Count++;
						k = (i + 1);
					}else{
						k++;
					}
				}
				System.out.print(ch +""+ Count);
				Count = 0;
			}

		}

	}

}
