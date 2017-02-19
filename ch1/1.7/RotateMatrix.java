// Rotate a Matrix 90 degrees clockwise (in-place)

public class RotateMatrix{
	private int[][] rotateMatrix(int[][] m){
		int n = m.length;
		for(int layer=0; layer<n/2; layer++){
			int first = layer;
			int last = n - 1 - layer;
			for(int i=0; i<last; i++){
				int offset = i - first;
				int top = m[first][i];
				m[first][i] = m[last-offset][first];
				m[last-offset][first] = m[last][last-offset];
				m[last][last-offset] = m[i][last];
				m[i][last] = top;
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
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		RotateMatrix r = new RotateMatrix();
		r.printMatrix(matrix);
		System.out.println("--------------");
		r.printMatrix(r.rotateMatrix(matrix));
	}
}