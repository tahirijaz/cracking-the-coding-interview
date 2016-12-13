import java.util.*;

/*
	[1.5]	Write a function to check if two strings are one edit away 
			from each other - Insert, Remove, Replace character
*/

class OneAway {
	private boolean isOneAway(String s1, String s2){
		if(s2.length() > s1.length())
			return isOneAwayCheck(s1, s2);
		return isOneAwayCheck(s2, s1);
	}

	private boolean isOneAwayCheck(String s1, String s2){
		int diff = 0;
		int lenDiff = (s1.length() - s2.length());
		int i=0, j=0;
				
		if(lenDiff > 1)
			return false;
		
		while(i<s1.length()){
			if(diff > 1)
				return false;
				
			if(s1.charAt(i)!=s2.charAt(j)){
				diff++;
				j++;
				if(lenDiff==0)
					i++;
			}
			else{
				i++;
				j++;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		OneAway one = new OneAway();
		System.out.println(one.isOneAway("pale", "ple"));
		System.out.println(one.isOneAway("pales", "pale"));
		System.out.println(one.isOneAway("pale", "bale"));
		System.out.println(one.isOneAway("pale", "bake"));
	}
}