/* 	
	[1.6]	Compress string aabcccccaaa -> a2b1c5a3. If compressed string is not smaller return original characters are [a-z] and [A-Z]
*/

class StringCompression {
	private String getCompressedString(String s){
		int counter = 0;
		String compressed_str = "";
		
		for(int i=0; i<s.length(); i++){
			counter++;
			if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)){
				compressed_str += Character.toString(s.charAt(i)) + counter;
				counter = 0;
			}
		}
		
		if(compressed_str.length() >= s.length())
			return s;
		
		return compressed_str;
	}
	
	public static void main(String[] args) {
		StringCompression s = new StringCompression();
		System.out.println(s.getCompressedString("aabcccccaaa"));
	}
}