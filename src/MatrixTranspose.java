
public class MatrixTranspose {
	
	void func(int[][] arr, int rows, int col) {
		int tmp = 0;
		printMatrix(arr, rows, col);
		for(int i=0; i<rows; i++) {
			for(int j=i; j<col; j++) {
				if(i == j) {
					continue;
				}
				tmp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = tmp;
			}
		}
		printMatrix(arr, rows, col);
	}
	
	void printMatrix(int[][] arr, int r, int c) {
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
