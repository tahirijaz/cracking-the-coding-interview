/* 	
	[1.6]	Compress string aabcccccaaa -> a2b1c5a3.
			If compressed string is not smaller return original
			characters are [a-z] and [A-Z]
*/

class StringCompression {
	private String getCompressedString(String s){
		int counter = 1;
		String compressed_str = "";
		int i;
		
		for(i=0; i<s.length()-1; i++){
			if(s.charAt(i) == s.charAt(i+1)){
				counter++;
			}
			else{
				compressed_str += Character.toString(s.charAt(i)) + counter;
				counter = 1;
			}
		}
		
		compressed_str += Character.toString(s.charAt(i)) + counter;
		
		if(compressed_str.length() >= s.length())
			return s;
		
		return compressed_str;
	}
	
	public static void main(String[] args) {
		StringCompression s = new StringCompression();
		System.out.println(s.getCompressedString("aabcccccaaa"));
	}
}