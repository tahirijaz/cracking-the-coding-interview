class URLify {
	private String urlify(String s, int len){
		char[] str = s.toCharArray();
		for(int i=len-1, j=s.length()-1; i>0; i--){
			if(str[i]==' '){
				str[j--] = '0';
				str[j--] = '2';
				str[j--] = '%';
			}else{
				str[j--] = str[i]; 
			}
		}
		return String.valueOf(str);
	}
	
	public static void main(String[] args) {
		URLify url = new URLify();
		System.out.println("[" + url.urlify("Mr John Smith    ", 13) + "]");
	}
}