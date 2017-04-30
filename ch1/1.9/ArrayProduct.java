public class ArrayProduct{
	public static void getProductArray(int[] arr){
		int n = arr.length;
		int[] productArr = new int[n];
		int product;
		
		printArray(arr);
		
		for(int i=0; i<n; i++){
			productArr[i] = 1;
		}
		printArray(productArr);

		product = 1;
		for(int i=0; i<n; i++){
			productArr[i] *= product;
			product *= arr[i];
		}

		product = 1;
		for(int i=n-1; i>=0; i--){
			productArr[i] *= product;
			product *= arr[i];
		}
		printArray(productArr);
	}
	
	public static void printArray(int[] arr){
		System.out.print("[");	
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("]");
	}
	
	public static void main(String[] args){
		int[] arr = {2, 7, 3, 4};
		getProductArray(arr);
	}
}