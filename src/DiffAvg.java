
public class DiffAvg {

	public static void main(String[] args) {
		int[] arr = new int[]{115,80,70,55,45,40,25};
		int count = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if( i+1 == arr.length){
				break;
			}
			sum = sum + Math.abs(arr[i] - arr[i+1]);
			count++;
		}
		System.out.println(sum/count);		
		
	}

}
