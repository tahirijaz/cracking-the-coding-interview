/*
	Problem 1.9: 	Assume you have method isSubstring which checks
					if one word is a substring of another. Given two strings
					write code to check if one is a rotation of the other
					(e.g. "waterbottle" is rotation of "erbottlewat")
*/


class StringRotation {	
	// Recreated the isSubstring given function
	public static boolean isSubstring(String str1, String str2){
		return (str1.indexOf(str2) < 0 ? false : true);
	}

	public static boolean isRotation(String str1, String str2){
		if(str1.length() != str2.length())
			return false;
			
		String repeat_str1 = str1 + str1;
		return isSubstring(repeat_str1, str2);
	}
	
	public static void main(String[] args) {
		String a = "tahir";
		String b = "ahirt";
		
		System.out.println(isRotation(a, b));
	}
}