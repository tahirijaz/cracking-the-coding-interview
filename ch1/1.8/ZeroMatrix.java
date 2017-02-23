/*
	Problem 1.8
	
	If an element in a MxN matrix is 0, set that row and col 0
	
	Procedure: 	Using a MxN boolean array to save 0 locations
				and using that to set rows, cols to zero
			
*/

class ZeroMatrix {
	private int[][] zeroMatrix(int[][] m){
		int height = m.length;
		int width = m[0].length;

		boolean[][] is_zero = new boolean[height][width]; 
		
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				if (m[i][j] == 0)
					is_zero[i][j] = true; 			
			}
		}
		
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				if((i > 0 && m[i-1][j]!=0) || (j > 0 && m[i][j-1]!=0)){ 
					if (is_zero[i][j] == true){
						for(int row=0; row<height; row++){
							m[row][j] = 0;
						}
						for(int col=0; col<width; col++){
							m[i][col] = 0;
						}
					}
				}
			}
		}
		return m;
	}

	private void printMatrix(int[][] matrix){
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		int[][] matrix = {{1, 2, 1, 3}, {4, 1, 6, 2}, {0, 8, 9, 4}};
		ZeroMatrix r = new ZeroMatrix();
		r.printMatrix(matrix);
		System.out.println("----------------");
		r.printMatrix(r.zeroMatrix(matrix));
	}
}