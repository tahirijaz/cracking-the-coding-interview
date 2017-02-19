class ZeroMatrix {
	private int[][] zeroMatrix(int[][] m){
		int height = m.length;
		int width = m[0].length;
		
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				if(m[i][j]==0){
					for(int row=0; row < width; row++){
						m[i][row] = 0;
					}
					for(int col=0; col < width; col++){
						m[col][j] = 0;
					}
					i++;
					j++;
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
		int[][] matrix = {{1, 2, 0}, {4, 1, 6}, {7, 8, 9}};
		ZeroMatrix r = new ZeroMatrix();
		r.printMatrix(matrix);
		System.out.println("----------------");
		r.printMatrix(r.zeroMatrix(matrix));
	}
}