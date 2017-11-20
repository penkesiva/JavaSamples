
public class MaxSubArray {
	
	//my first dynamic programming
	//Kadane's Algorithm; which says maxSubArray at nth element is the 
	//max of nth element or sum of nth element and prev subArray sum
	int func(int[] arr) {
		int currMax = arr[0];
		int global = arr[0];
		for(int i=1; i<arr.length; i++) {
			currMax = Math.max(arr[i], arr[i] + currMax);
			global = Math.max(currMax, global);
		}
		return global;
	}

}
