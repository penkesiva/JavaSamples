
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstRecurringChar frc = new FirstRecurringChar();
		System.out.println(frc.func("ABCDA"));//A
		
		FirstNonRecurringChar fnrc = new FirstNonRecurringChar();
		System.out.println(fnrc.func("ABBCDCA"));//D
		
		int[] arr = {1,2,3,-1,-2,-3,1,-1,2,3,4,-1};
		MaxSubArray msa = new MaxSubArray();
		System.out.println(msa.func(arr));
	}

}
