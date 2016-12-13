/*
	[1.4]	Write a function to check if a string is a permutation of a pelindrome
*/

class PelindromePermutation {
	private boolean isPelindromePermutation(String s){
		s = s.toLowerCase();
		int[] count = new int[128]; // count for all characters
		boolean oddChar = false;
		int lengthNoSpaces = 0;
	
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)!= ' '){
				count[s.charAt(i) - 'a']++;
				lengthNoSpaces++;
			}
		}
		
		boolean isOdd = (lengthNoSpaces % 2 == 1);
		
		for(int i=0; i< count.length; i++){
			if(count[i] != 0){
				if(count[i] % 2 !=0 && !isOdd){
					return false;
				}
				else if(count[i] % 2 !=0 && isOdd && !oddChar){
					oddChar = true;
				}
				else if(count[i] % 2 !=0 && isOdd && oddChar){
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		PelindromePermutation p = new PelindromePermutation();
		System.out.println(p.isPelindromePermutation("Tact Coa"));
	}
}
