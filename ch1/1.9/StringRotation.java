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
		if(str1.length() != str2.length()){
			return false;
		}
		
		String rotatedString = "";
			
		// Problem here
		while((i < str1.length()) && (str1.charAt(i) != str2.charAt(i2))){
			rotatedString += str1.charAt(i);
			i++;
		}
		
		int j = i;
		while(j < str1.length() -1){
			if(str1.charAt(j) != str2.charAt(j))
				return false;
			j++;
		}	
		
		System.out.println("str1: " + str2);
		System.out.println("str2: " + rotatedString);
		
		if(isSubstring(str2, rotatedString))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		String a = "tahir";
		String b = "ahirt";
		
		System.out.println(isRotation(a, b));
	}
}