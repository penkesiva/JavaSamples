
//selection sort is about finding the minimum value in the list and swap with the first element and so on
public class SelectionSort {
	
	int[] func(int[] arr) {
		int tmp;
		int minValue;
		
		for(int i=0; i<arr.length-1; i++) {
			minValue = arr[i]; //start with first element
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < minValue) { //ascending
					minValue = arr[j];;
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}

		}
		
		//print all
		for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println("");
		
		return arr;
	}

}
