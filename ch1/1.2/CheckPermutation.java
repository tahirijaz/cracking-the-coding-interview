class CheckPermutation {
	private boolean checkPermutation(String s1, String s2){
		int[] characterCount = new int[128];
		if(s1.length() != s2.length())
			return false;
			
		for(int i=0; i<s1.length(); i++){
			characterCount[(int)(s1.charAt(i) - 'a')]++;
			characterCount[(int)(s2.charAt(i) - 'a')]--;
		}
		
		for(int i=0; i< characterCount.length; i++){
			if(characterCount[i]!=0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		CheckPermutation check = new CheckPermutation();
		System.out.println(check.checkPermutation("tahir", "rihat"));
	}
}