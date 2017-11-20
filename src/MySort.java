
public class MySort {
	
	//no local copy of the arr is required as the param is send by copy
	int[] func(int[] arr) {
		int tmp;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {//ascending
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		//print all elements
		for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println("");
		
		return arr;
	}

}
