
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstRecurringChar frc = new FirstRecurringChar();
		System.out.println("FirstRecurringChar: " + frc.func("ABCDA"));//A
		
		FirstNonRecurringChar fnrc = new FirstNonRecurringChar();
		System.out.println("FirstNonRecurringChar: " + fnrc.func("ABBCDCA"));//D
		
		int[] arr = {1,2,3,-1,-2,-3,1,-1,2,3,4,-1};
		MaxSubArray msa = new MaxSubArray();
		System.out.println("MaxSubArray: " + msa.func(arr));
		
		//Merge Sort
		
		//Selection Sort O(n2)
		SelectionSort ss = new SelectionSort();
		ss.func(arr);
		
		//Heap Sort
		//Radix Sort
		//Quick Sort
		
		//MySort O(n2)
		MySort ms = new MySort();
		ms.func(arr);
		
		//k-closest points from origin
		KClosestPoints kClose = new KClosestPoints(5);
		kClose.init();
		kClose.func();

		//Matrix transpose
		MatrixTranspose mt = new MatrixTranspose();
		int[][] arr2d = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		mt.func(arr2d, 4, 4);
		
		
		//string reverse
		ReverseString rs = new ReverseString();
		System.out.println("Reverse String " + rs.func("niart"));
		
	}

}
