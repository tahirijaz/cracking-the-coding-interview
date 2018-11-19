/*
	EX 5.1 
	
	Given two 32-bit numbers, N and M, and two bit positions, i and j 
	Set all bits between i and j in N equal to M 
	EXAMPLE:
	Input: N = 10000000000, M = 10101, i = 2, j = 6
	Output: N = 10001010100
*/

public class CreateBinarySubstring{
	public static final int INT_BITS = 32;
	
	public static int createSubstring(int N, int M, int i, int j){
		int num_bits = j - i;
		int mask = ~0;
		
		printBinary(mask);
		return mask;
	}
	
	public static void printBinary(int num){
		int binary[] = new int[INT_BITS];
		for(int i=INT_BITS-1; i>=0 && num > 0; i--){
			binary[i] = num & 1;
			num >>= 1;
		}
		for (int i=0; i<INT_BITS; i++){
			if(i % 8 == 0){
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		createSubstring(10, 5, 2, 6);
	}
}

